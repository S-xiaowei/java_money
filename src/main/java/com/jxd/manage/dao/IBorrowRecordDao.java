package com.jxd.manage.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.BorrowDateSet;
import com.jxd.manage.model.BorrowRecord;
import com.jxd.manage.model.ReserveRecord;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface IBorrowRecordDao {
    /**
     * 分页查询
     * @param borrowDateSet 查询条件
     * @return
     */
    IPage<BorrowRecord> selectBorrowByPage(IPage<BorrowRecord> pages, @Param("ds")BorrowDateSet borrowDateSet);
    /**
     * 根据编号获取借款记录
     * @param bid 编号
     * @return
     */
    List<BorrowRecord> getBorrowByBid(Integer bid);
    /**
     * 新增借款
     * @param borrowRecord
     * @return
     */
    boolean addBorrow(@Param("borrowRecord") BorrowRecord borrowRecord);
    /**
     * 按照借款编号，批量删除
     * @param bids 选中的借款编号数组
     * @return 返回是否删除成功
     */
    boolean delBorrows(@Param("bids") List<Integer> bids);
    /**
     * 修改借款信息
     * @param borrowRecord
     * @return
     */
    boolean updBorrow(@Param("borrowRecord") BorrowRecord borrowRecord);
    /**
     * 批量修改借款信息的借款状态
     * @param borrowRecord
     * @return
     */
    boolean updBorrows( BorrowRecord borrowRecord);
}
