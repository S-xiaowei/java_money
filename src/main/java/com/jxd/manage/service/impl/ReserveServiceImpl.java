package com.jxd.manage.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.manage.dao.IBorrowRecordDao;
import com.jxd.manage.dao.IReserveRecordDao;
import com.jxd.manage.dao.IReserveStateDao;
import com.jxd.manage.ds.ReserveDateSet;
import com.jxd.manage.model.BorrowRecord;
import com.jxd.manage.model.ReserveRecord;
import com.jxd.manage.model.ReserveState;
import com.jxd.manage.service.IReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ReserveServiceImpl
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/30
 * @Version 1.0
 */
@Service
public class ReserveServiceImpl implements IReserveService {
    @Autowired
    private IReserveRecordDao reserveRecordDao;
    @Autowired
    private IBorrowRecordDao borrowRecordDao;

    @Override
    public Map<String, Object> selectReserveByPage(Map<String, String> queryMap) {
        String page = queryMap.get("page");
        String limit = queryMap.get("limit");
        String bid = queryMap.get("bid");
        String eid = queryMap.get("eid");
        String rsid = queryMap.get("rsid");
        String rtime = queryMap.get("rtime");

        Map<String, Object> map = new HashMap(4);
        if (page != null && limit != null) {
            IPage<ReserveRecord> pages = new Page(Integer.parseInt(page), Integer.parseInt(limit));
            ReserveDateSet reserveDateSet = new ReserveDateSet(bid, rsid, rtime, eid);
            IPage<ReserveRecord> pageResult = reserveRecordDao.selectReserveByPage(pages, reserveDateSet);
            map.put("count", pageResult.getTotal());
            map.put("data", pageResult.getRecords());
            map.put("code", 0);
        } else {
            map.put("data", (Object) null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object) null);
        }
        return map;
    }

    @Override
    public List<ReserveRecord> getReserveByRid(String rid) {
        return reserveRecordDao.getReserveByRid(rid);
    }

    @Override
    public boolean addReserve(ReserveRecord recordRecord) {
        return reserveRecordDao.addReserve(recordRecord);
    }

    @Override
    public boolean delReserves(List<Integer> rids) {
        return reserveRecordDao.delReserves(rids);
    }

    @Override
    public boolean updReserve(ReserveRecord reserveRecord) {
        return reserveRecordDao.updReserve(reserveRecord);
    }

    @Override
    public boolean updReserves(List<Map<String, String>> list) {
        for (int i = 0; i < list.size(); i++) {
            ReserveRecord reserveRecord = new ReserveRecord();
            Map<String, String> map = list.get(i);
            reserveRecord.setRid(Integer.parseInt(map.get("rid")));
            reserveRecord.setRsid(map.get("rsid"));

            if(!"".equals(map.get("rbackReason"))&&map.get("rbackReason")!=null){
                reserveRecord.setRbackReason((map.get("rbackReason")));
            }else {
                reserveRecord.setRbackReason("");
            }
            boolean isSucc = reserveRecordDao.updReserves(reserveRecord);
           if (!isSucc) {
                return false;
            }
        }
        return true;
    }
}
