package com.jxd.manage.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.manage.dao.*;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.*;
import com.jxd.manage.service.IManageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/28
 * @Version 1.0
 */
@Service
public class ManageServiceImpl implements IManageService {
    @Autowired
    private IDeptDao deptDao;
    @Autowired
    private IEmpDao empDao;
    @Autowired
    private IUserDao userDao;
    @Autowired
    private IBorrowStateDao borrowStateDao;
    @Autowired
    private IBorrowTypeDao borrowTypeDao;
    @Autowired
    private IReserveStateDao reserveStateDao;

    @Override
    public Map<String, Object> selectUserByPage(Map<String, String> queryMap) {
        String page =  queryMap.get("page");
        String limit =  queryMap.get("limit");
        String id =  queryMap.get("id");
        String name =  queryMap.get("name");

        Map<String, Object> map = new HashMap(2);
        if(page != null && limit != null){
            IPage<User> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            ManageDateSet manageDateSet = new ManageDateSet(id,name,null);
            IPage<User> pageResult = userDao.selectUserByPage(pages,manageDateSet);
            map.put("count",pageResult.getTotal());
            map.put("data",pageResult.getRecords());
            map.put("code",0);
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
        }
        return map;
    }
    @Override
    public Map<String,Object> selectEmpByPage(Map<String,String> queryMap) {
        String page =  queryMap.get("page");
        String limit =  queryMap.get("limit");
        String eid =  queryMap.get("id");
        String ename =  queryMap.get("name");
        String did =  queryMap.get("did");

        Map<String, Object> map = new HashMap(3);
        if(page != null && limit != null){
            IPage<Emp> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            ManageDateSet manageDateSet = new ManageDateSet(eid,ename,did);
            IPage<Emp> pageResult = empDao.selectEmpByPage(pages,manageDateSet);
            map.put("count",pageResult.getTotal());
            map.put("data",pageResult.getRecords());
            map.put("code",0);
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
        }
        return map;
    }

    @Override
    public Map<String,Object> selectDeptByPage(Map<String,String> queryMap) {
        String page =  queryMap.get("page");
        String limit =  queryMap.get("limit");
        String id =  queryMap.get("id");
        String name =  queryMap.get("name");

        Map<String, Object> map = new HashMap(2);
        if(page != null && limit != null){
            IPage<Dept> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            ManageDateSet manageDateSet = new ManageDateSet(id,name,null);
            IPage<Dept> pageResult = deptDao.selectDeptByPage(pages,manageDateSet);
            map.put("count",pageResult.getTotal());
            map.put("data",pageResult.getRecords());
            map.put("code",0);
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
        }
        return map;
    }

    @Override
    public Map<String,Object> selectBStateByPage(Map<String,String> queryMap) {
        String page =  queryMap.get("page");
        String limit =  queryMap.get("limit");
        String id =  queryMap.get("id");
        String name =  queryMap.get("name");

        Map<String, Object> map = new HashMap(2);
        if(page != null && limit != null){
            IPage<BorrowState> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            ManageDateSet manageDateSet = new ManageDateSet(id,name,null);
            IPage<BorrowState> pageResult = borrowStateDao.selectBStateByPage(pages,manageDateSet);
            map.put("count",pageResult.getTotal());
            map.put("data",pageResult.getRecords());
            map.put("code",0);
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
        }
        return map;
    }

    @Override
    public Map<String,Object> selectBTypeByPage(Map<String,String> queryMap) {
        String page =  queryMap.get("page");
        String limit =  queryMap.get("limit");
        String id =  queryMap.get("id");
        String name =  queryMap.get("name");

        Map<String, Object> map = new HashMap(2);
        if(page != null && limit != null){
            IPage<BorrowType> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            ManageDateSet manageDateSet = new ManageDateSet(id,name,null);
            IPage<BorrowType> pageResult = borrowTypeDao.selectBTypeByPage(pages,manageDateSet);
            map.put("count",pageResult.getTotal());
            map.put("data",pageResult.getRecords());
            map.put("code",0);
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
        }
        return map;
    }

    @Override
    public Map<String,Object>  selectRStateByPage(Map<String,String> queryMap) {
        String page =  queryMap.get("page");
        String limit =  queryMap.get("limit");
        String id =  queryMap.get("id");
        String name =  queryMap.get("name");

        Map<String, Object> map = new HashMap(2);
        if(page != null && limit != null){
            IPage<ReserveState> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            ManageDateSet manageDateSet = new ManageDateSet(id,name,null);
            IPage<ReserveState> pageResult = reserveStateDao.selectRStateByPage(pages,manageDateSet);
            map.put("count",pageResult.getTotal());
            map.put("data",pageResult.getRecords());
            map.put("code",0);
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
        }
        return map;
    }

    @Override
    public List<Dept> selectAllDept() {
        return deptDao.selectAllDept();
    }

    @Override
    public boolean delEmp(String[] eids) {
        return empDao.delEmp(eids);
    }

    @Override
    public boolean updEmp(Emp emp) {
        return empDao.updEmp(emp);
    }

    @Override
    public  boolean addEmp(Emp emp) {
        return empDao.addEmp(emp);
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public boolean delDept(String[] bids) {
        return deptDao.delDept(bids);
    }

    @Override
    public boolean updDept(Dept dept) {
        return deptDao.updDept(dept);
    }

    @Override
    public boolean addBorrowType(BorrowType borrowType) {
        return borrowTypeDao.addBorrowType(borrowType);
    }

    @Override
    public boolean delBorrowType(String[] bsids) {
        return borrowStateDao.delBorrowState(bsids);
    }

    @Override
    public boolean addBorrowState(BorrowState borrowState) {
        return borrowStateDao.addBorrowState(borrowState);
    }

    @Override
    public boolean delBorrowState(String[] bsids) {
        return borrowStateDao.delBorrowState(bsids);
    }
    @Override
    public List<BorrowType> selectAllBorrowType() {
        return borrowTypeDao.selectAllBorrowType();
    }

    @Override
    public boolean updBorrowType(BorrowType borrowType) {
        return updBorrowType(borrowType);
    }

    @Override
    public List<BorrowState> selectAllBorrowState() {
        return borrowStateDao.selectAllBorrowState();
    }

    @Override
    public boolean updBorrowState(BorrowState borrowState) {
        return updBorrowState(borrowState);
    }

    @Override
    public boolean addReserveState(ReserveState reserveState) {
        return reserveStateDao.addReserveState(reserveState);
    }

    @Override
    public boolean delReserveState(String[] rsids) {
        return reserveStateDao.delReserveState(rsids);
    }

    @Override
    public boolean updReserveState(ReserveState reserveState) {
        return reserveStateDao.updReserveState(reserveState);
    }
    @Override
    public List<ReserveState> selectAllReserveState() {
        return reserveStateDao.selectAllReserveState();
    }

    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public boolean delUser(String[] uids) {
        return userDao.delUser(uids);
    }

    @Override
    public boolean updUser(Map<String,String> map) {
        return userDao.updUser(map);
    }
    @Override
    public boolean resertPwds(@Param("uids") String[] uids){
        return userDao.resertPwds(uids);
    }
}
