package com.jxd.manage.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.BorrowState;
import com.jxd.manage.model.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBorrowStateDao {
    /**
     * 分页查询
     * @param manageDateSet 查询条件
     * @return
     */
    IPage<BorrowState> selectBStateByPage(IPage<BorrowState> pages, @Param("ds") ManageDateSet manageDateSet);
    /**
     * 查询所有借款状态
     * @return 查询到的集合
     */
    List<BorrowState> selectAllBorrowState();
    /**
     * 新增借款状态
     * @param borrowState
     * @return
     */
    boolean addBorrowState(@Param("borrowState") BorrowState borrowState);
    /**
     * 按照借款状态编号，批量删除
     * @param bsids 选中的借款状态编号数组
     * @return 返回是否删除成功
     */
    boolean delBorrowState(@Param("bsids") String[] bsids);
    /**
     * 修改借款状态信息
     * @param borrowState
     * @return
     */
    boolean updBorrowState(@Param("borrowState") BorrowState borrowState);
}
