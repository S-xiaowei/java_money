package com.jxd.manage.controller;

import com.jxd.manage.model.BorrowRecord;
import com.jxd.manage.model.BorrowState;
import com.jxd.manage.model.BorrowType;
import com.jxd.manage.service.IBorrowService;
import com.jxd.manage.service.IManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BorrowController
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/30
 * @Version 1.0
 */
@RestController
public class BorrowController {
    @Autowired
    private IBorrowService borrowService;
    @Autowired
    private IManageService manageService;

    @RequestMapping("/borrowListPage")
    public Map<String,Object> selectBorrowByPage(@RequestBody Map<String,String> queryMap){
        Map<String,Object> map = borrowService.selectBorrowByPage(queryMap);
        return map;
    }
    @RequestMapping("/borrowList")
    public List<BorrowRecord> getBorrowByBid(String bid){
        return borrowService.getBorrowByBid(bid);
    }
    @RequestMapping("/typeList")
    public List<BorrowType> typeList(){
        return manageService.selectAllBorrowType();
    }
    @RequestMapping("/bstateList")
    public List<BorrowState> bstateList(){
        return manageService.selectAllBorrowState();
    }
    @RequestMapping("/addBorrow")
    public String addBorrow(@RequestBody BorrowRecord borrowRecord){
        boolean isSucc = borrowService.addBorrow(borrowRecord);
        if (isSucc){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/delBorrows")
    public String delBorrows(@RequestBody List<Integer> bids){
        if (borrowService.delBorrows(bids)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/updBorrow")
    public String updBorrow(@RequestBody BorrowRecord borrowRecord){
        if (borrowRecord.getBbackReason()==null){
            borrowRecord.setBbackReason("");
        }
        if (borrowService.updBorrow(borrowRecord)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/updBorrows")
    public String updBorrows(@RequestBody List<Map<String,String>> list){
        if (borrowService.updBorrows(list)){
            return "success";
        }else {
            return "error";
        }
    }
}
