package com.jxd.manage.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.Dept;
import com.jxd.manage.model.ReserveState;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IReserveStateDao  {
    /**
     * 分页查询
     * @param manageDateSet 查询条件
     * @return
     */
    IPage<ReserveState> selectRStateByPage(IPage<ReserveState> pages, @Param("ds") ManageDateSet manageDateSet);
    /**
     * 查询所有还款状态
     * @return 查询到的集合
     */
    List<ReserveState> selectAllReserveState();
    /**
     * 新增还款状态
     * @param reserveState
     * @return
     */
    boolean addReserveState(@Param("reserveState") ReserveState reserveState);
    /**
     * 按照还款状态编号，批量删除
     * @param rsids 选中的还款状态编号数组
     * @return 返回是否删除成功
     */
    boolean delReserveState(@Param("rsids") String[] rsids);
    /**
     * 修改还款状态信息
     * @param reserveState
     * @return
     */
    boolean updReserveState(@Param("reserveState") ReserveState reserveState);
}
