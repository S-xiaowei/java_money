package com.jxd.manage.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IManageService {

    /**
     * 分页查询员工
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectEmpByPage(Map<String,String> queryMap);

    /**
     * 分页查询部门
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectDeptByPage(Map<String,String> queryMap);

    /**
     * 分页查询借款状态
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectBStateByPage(Map<String,String> queryMap);

    /**
     * 分页查询借款类型
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectBTypeByPage(Map<String,String> queryMap);

    /**
     * 分页查询还款状态
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectRStateByPage(Map<String,String> queryMap);


    /**
     * 查询所有部门
     * @return 查询到的集合
     */
    List<Dept> selectAllDept();
    /**
     * 按照编号，批量删除员工
     * @param eids 选中的部门编号数组
     * @return 返回是否删除成功
     */
    boolean delEmp(@Param("eids") String[] eids);
    /**
     * 修改员工信息
     * @param emp
     * @return
     */
    boolean updEmp(Emp emp);

    /**
     * 新增员工
     * @param emp
     * @return
     */
    boolean addEmp(Emp emp);
    /**
     * 新增部门
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);
    /**
     * 按照部门编号，批量删除
     * @param bids 选中的部门编号数组
     * @return 返回是否删除成功
     */
    boolean delDept(@Param("bids") String[] bids);
    /**
     * 修改部门信息
     * @param dept
     * @return
     */
    boolean updDept(Dept dept);
    /**
     * 新增借款类型
     * @param borrowType
     * @return
     */
    boolean addBorrowType(BorrowType borrowType);
    /**
     * 按照借款类型编号，批量删除
     * @param tids 选中的借款类型编号数组
     * @return 返回是否删除成功
     */
    boolean delBorrowType(@Param("tids") String[] tids);
    /**
     * 新增借款状态
     * @param borrowState
     * @return
     */
    boolean addBorrowState(BorrowState borrowState);
    /**
     * 按照借款状态编号，批量删除
     * @param bsids 选中的借款状态编号数组
     * @return 返回是否删除成功
     */
    boolean delBorrowState(@Param("bsids") String[] bsids);

    /**
     * 新增还款状态
     * @param reserveState
     * @return
     */
    boolean addReserveState(ReserveState reserveState);
    /**
     * 按照还款状态编号，批量删除
     * @param rsids 选中的还款状态编号数组
     * @return 返回是否删除成功
     */
    boolean delReserveState(@Param("bids") String[] rsids);
    /**
     * 修改还款状态信息
     * @param reserveState
     * @return
     */
    boolean updReserveState(ReserveState reserveState);
    /**
     * 查询所有借款类型
     * @return 查询到的集合
     */
    List<BorrowType> selectAllBorrowType();
    /**
     * 修改借款类型信息
     * @param borrowType
     * @return
     */
    boolean updBorrowType(BorrowType borrowType);
    /**
     * 查询所有借款状态
     * @return 查询到的集合
     */
    List<BorrowState> selectAllBorrowState();
    /**
     * 修改借款状态信息
     * @param borrowState
     * @return
     */
    boolean updBorrowState(BorrowState borrowState);
    /**
     * 查询所有还款状态
     * @return 查询到的集合
     */
    List<ReserveState> selectAllReserveState();

    /**
     * 分页查询用户
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectUserByPage(Map<String,String> queryMap);
    /**
     * 查询所有用户
     * @return 查询到的集合
     */
    List<User> selectAllUser();
    /**
     * 新增用户
     * @param user
     * @return 返回自增主键值
     */
    boolean addUser(User user);
    /**
     * 按照用户编号，批量删除
     * @param uids 选中的用户编号数组
     * @return 返回是否删除成功
     */
    boolean delUser(@Param("uids") String[] uids);
    /**
     * 修改用户信息
     * @param map
     * @return
     */
    boolean updUser(Map<String,String> map);

    /**
     * 重置用户密码
     * @param uids
     * @return
     */
    boolean resertPwds(@Param("uids") String[] uids);

}
