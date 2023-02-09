package com.jxd.manage.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.*;
import com.jxd.manage.service.IManageService;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static com.jxd.manage.util.ChangeChinesePinyin.changeChinesePinyin;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/27
 * @Version 1.0
 */
@RestController
public class ManageController {
    @Autowired
    private IManageService manageService;

    @RequestMapping("/getDeptList")
    public List<Dept> getDeptList(){
        return manageService.selectAllDept();
    }
    @RequestMapping("/userListPage")
    public Map<String,Object> selectUserByPage(@RequestBody Map<String,String> queryMap){
        Map<String,Object> map = manageService.selectUserByPage(queryMap);
        return map;
    }
    @RequestMapping("/empListPage")
    public Map<String,Object> selectEmpByPage(@RequestBody Map<String,String> queryMap){
        Map<String,Object> map = manageService.selectEmpByPage(queryMap);
        return map;
    }
    @RequestMapping("/deptListPage")
    public Map<String,Object> selectDeptByPage(@RequestBody Map<String,String> queryMap){
        Map<String,Object> map = manageService.selectDeptByPage(queryMap);
        return map;
    }
    @RequestMapping("/bStateListPage")
    public Map<String,Object> selectBStateByPage(@RequestBody Map<String,String> queryMap){
        Map<String,Object> map = manageService.selectBStateByPage(queryMap);
        return map;
    }
    @RequestMapping("/bTypeListPage")
    public Map<String,Object> selectBTypeByPage(@RequestBody Map<String,String> queryMap){
        Map<String,Object> map = manageService.selectBTypeByPage(queryMap);
        return map;
    }
    @RequestMapping("/rStateListPage")
    public Map<String,Object> selectRStateByPage(@RequestBody Map<String,String> queryMap){
        Map<String,Object> map = manageService.selectRStateByPage(queryMap);
        return map;
    }
    @RequestMapping("/delUsers")
    public String delUsers(@RequestBody String[] uids){
        if (manageService.delUser(uids)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/delEmps")
    public String delEmps(@RequestBody String[] eids){
        if (manageService.delEmp(eids)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/delBstates")
    public String delBstates(@RequestBody String[] bsids){
        if (manageService.delBorrowState(bsids)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/delBtypes")
    public String delBtypes(@RequestBody String[] tids){
        if (manageService.delBorrowType(tids)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/delRstates")
    public String delRstates(@RequestBody String[] rsids){
        if (manageService.delReserveState(rsids)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/delDepts")
    public String delDepts(@RequestBody String[] dids){
        if (manageService.delDept(dids)){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/addEmp")
    public String addEmp(@RequestBody Map<String,String> map) throws BadHanyuPinyinOutputFormatCombination {
        //汉字转拼音
        Map<String, String> pinyin = changeChinesePinyin(map.get("name"));
        Emp emp =  new Emp(null,map.get("name"),map.get("sex"),map.get("job"),map.get("hiredate"),map.get("did"),null);

        boolean isSucc1 = manageService.addEmp(emp);
        User user = new User(null,emp.getEid()+pinyin.get("fullPinyin"),"123");
        boolean isSucc2 = manageService.addUser(user);
        emp.setUid(user.getUid());
        boolean isSucc3 =manageService.updEmp(emp);
        if (isSucc1&&isSucc2&&isSucc3){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/addDept")
    public String addDept(@RequestBody Map<String,String> map){
        boolean isSucc = manageService.addDept(new Dept(null,map.get("name")));
        if (isSucc){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/addBstate")
    public String addBstate(@RequestBody Map<String,String> map){
        boolean isSucc = manageService.addBorrowState(new BorrowState(null,map.get("name")));
        if (isSucc){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/addBtype")
    public String addBtype(@RequestBody Map<String,String> map){
        boolean isSucc = manageService.addBorrowType(new BorrowType(null,map.get("name")));
        if (isSucc){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/addRstate")
    public String addRstate(@RequestBody Map<String,String> map){
        boolean isSucc = manageService.addReserveState(new ReserveState(null,map.get("name")));
        if (isSucc){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/resertPwds")
    public String resertPwds(@RequestBody String[] uids){
        if (manageService.resertPwds(uids)){
            return "success";
        }else {
            return "error";
        }
    }


}
