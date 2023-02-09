package com.jxd.manage.controller;

import com.jxd.manage.model.ReserveRecord;
import com.jxd.manage.model.ReserveState;
import com.jxd.manage.service.IBorrowService;
import com.jxd.manage.service.IManageService;
import com.jxd.manage.service.IReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ReserveController
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/30
 * @Version 1.0
 */
@RestController
public class ReserveController {
    @Autowired
    private IReserveService reserveService;
    @Autowired
    private IManageService manageService;
    @Autowired
    private IBorrowService borrowService;


    @RequestMapping("/reserveListPage")
    public Map<String,Object> selectReserveByPage(@RequestBody Map<String,String> queryMap){
        Map<String,Object> map1 = reserveService.selectReserveByPage(queryMap);
        return map1;
    }
    @RequestMapping("/reserveList")
    public List<ReserveRecord> getReserveByRid(String rid){
        return reserveService.getReserveByRid(rid);
    }
    @RequestMapping("/rstateList")
    public List<ReserveState> rstateList(){
        List<ReserveState> list = manageService.selectAllReserveState();
        return list;
    }
    @RequestMapping("/addReserve")
    public String addReserve(@RequestBody ReserveRecord reserveRecord){
        boolean isSucc = reserveService.addReserve(reserveRecord);
        if (isSucc){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/delReserves")
    public String delReserves(@RequestBody List<Integer> rids){
        if (reserveService.delReserves(rids)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/updReserve")
    public String updReserve(@RequestBody ReserveRecord reserveRecord){
        if (reserveRecord.getRbackReason()==null){
            reserveRecord.setRbackReason("");
        }
        boolean isRes = reserveService.updReserve(reserveRecord);
        //boolean isBor = borrowService.updBorrow();
        if (isRes){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/updReserves")
    public String updReserves(@RequestBody List<Map<String,String>> list){
        if (reserveService.updReserves(list)&&borrowService.updBorrows(list)){
            return "success";
        }else {
            return "error";
        }
    }
}
