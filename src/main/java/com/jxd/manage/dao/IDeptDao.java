package com.jxd.manage.dao;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.Dept;
import com.jxd.manage.model.Emp;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface IDeptDao {
    /**
     * 分页查询
     * @param manageDateSet 查询条件
     * @return
     */
    IPage<Dept> selectDeptByPage(IPage<Dept> pages, @Param("ds") ManageDateSet manageDateSet);
    /**
     * 查询所有部门
     * @return 查询到的集合
     */
    List<Dept> selectAllDept();
    /**
     * 新增部门
     * @param dept
     * @return
     */
    boolean addDept(@Param("dept") Dept dept);
    /**
     * 按照部门编号，批量删除
     * @param dids 选中的部门编号数组
     * @return 返回是否删除成功
     */
    boolean delDept(@Param("dids") String[] dids);
    /**
     * 修改部门信息
     * @param dept
     * @return
     */
    boolean updDept(@Param("dept") Dept dept);
}
