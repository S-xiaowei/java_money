package com.jxd.manage.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.BorrowDateSet;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.BorrowRecord;
import com.jxd.manage.model.Emp;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IEmpDao {
    /**
     * 分页查询
     * @param empDateSet 查询条件
     * @return
     */
    IPage<Emp> selectEmpByPage(IPage<Emp> pages, @Param("ds") ManageDateSet empDateSet);
    /**
     * 查询所有员工
     * @return 查询到的集合
     */
    List<Emp> selectAllEmp();
    /**
     * 新增员工
     * @param emp
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "eid", keyColumn = "eid")
    boolean addEmp( Emp emp);
    /**
     * 按照员工编号，批量删除
     * @param eids 选中的员工编号数组
     * @return 返回是否删除成功
     */
    boolean delEmp(@Param("eids") String[] eids);
    /**
     * 修改员工信息
     * @param emp
     * @return
     */
    boolean updEmp(@Param("emp") Emp emp);
    /**
     * 根据uid查询emp
     * @param uid
     */
    Map<String,String> getEmpByUid(Integer uid);
}
