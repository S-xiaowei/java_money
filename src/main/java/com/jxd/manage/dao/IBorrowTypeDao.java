package com.jxd.manage.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.BorrowState;
import com.jxd.manage.model.BorrowType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBorrowTypeDao{
    /**
     * 分页查询
     * @param manageDateSet 查询条件
     * @return
     */
    IPage<BorrowType> selectBTypeByPage(IPage<BorrowType> pages, @Param("ds") ManageDateSet manageDateSet);
    /**
     * 查询所有借款类型
     * @return 查询到的集合
     */
    List<BorrowType> selectAllBorrowType();
    /**
     * 新增借款类型
     * @param borrowType
     * @return
     */
    boolean addBorrowType(@Param("borrowType")BorrowType borrowType);
    /**
     * 按照借款类型编号，批量删除
     * @param bids 选中的借款类型编号数组
     * @return 返回是否删除成功
     */
    boolean delBorrowType(@Param("bids") String[] bids);
    /**
     * 修改借款类型信息
     * @param borrowType
     * @return
     */
    boolean updBorrowType(@Param("borrowType") BorrowType borrowType);
}
