package com.jxd.manage.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.manage.dao.*;
import com.jxd.manage.ds.BorrowDateSet;
import com.jxd.manage.ds.ReserveDateSet;
import com.jxd.manage.model.*;
import com.jxd.manage.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BorrowServiceImpl
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/30
 * @Version 1.0
 */
@Service
public class BorrowServiceImpl implements IBorrowService {
    @Autowired
    private IBorrowRecordDao borrowRecordDao;

    @Override
    public Map<String,Object> selectBorrowByPage(Map<String,String> queryMap) {
        String page =  queryMap.get("page");
        String limit =  queryMap.get("limit");
        String bid =  queryMap.get("bid");
        String tid =  queryMap.get("tid");
        String bsid =  queryMap.get("bsid");
        String did=  queryMap.get("did");
        String eid = queryMap.get("eid");
        String btime =  queryMap.get("btime");

        Map<String, Object> map = new HashMap(3);
        if(page != null && limit != null){
            IPage<BorrowRecord> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            BorrowDateSet borrowDateSet = new BorrowDateSet(bid,tid,bsid,btime,eid,did);
            IPage<BorrowRecord> pageResult = borrowRecordDao.selectBorrowByPage(pages,borrowDateSet);
            map.put("count",pageResult.getTotal());
            map.put("data",pageResult.getRecords());
            map.put("code",0);
            return map;
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
            return map;
        }
    }
    @Override
    public List<BorrowRecord> getBorrowByBid(String bid) {
        Integer bid1 = bid == null ? null : Integer.valueOf(bid);
        return borrowRecordDao.getBorrowByBid(bid1);
    }

    @Override
    public boolean addBorrow(BorrowRecord borrowRecord) {
        return borrowRecordDao.addBorrow(borrowRecord);
    }

    @Override
    public boolean delBorrows(List<Integer> bids) {
        return borrowRecordDao.delBorrows(bids);
    }

    @Override
    public boolean updBorrow(BorrowRecord borrowRecord) {
        return borrowRecordDao.updBorrow(borrowRecord);
    }

    @Override
    public boolean updBorrows(List<Map<String,String>> list) {
        for (Map<String,String> map: list) {
              BorrowRecord borrowRecord = new BorrowRecord();
              borrowRecord.setBid(Integer.parseInt(map.get("bid")));
              borrowRecord.setBsid(map.get("bsid"));
              if ("7".equals(map.get("bsid"))){//全部还清
                  borrowRecord.setBstillMoney("0");
              } else {
                  borrowRecord.setBstillMoney(map.get("bstill_money"));
              }
              if(map.get("bbackReason")!=null&&!"".equals(map.get("bbackReason"))){
                    borrowRecord.setBbackReason(map.get("bbackReason"));
              }else {
                    borrowRecord.setBbackReason("");
                }
            boolean isSucc = borrowRecordDao.updBorrows(borrowRecord);
              if (!isSucc){
                  return false;
              }
            }
        return true;
    }

}
