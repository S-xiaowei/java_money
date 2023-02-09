package com.jxd.manage.service;

import com.jxd.manage.model.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IBorrowService {
    /**
     * 分页查询
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectBorrowByPage(Map<String,String> queryMap);
    /**
     * 根据编号获取借款记录
     * @param bid 编号
     * @return
     */
    List<BorrowRecord> getBorrowByBid(String bid);
    /**
     * 新增借款
     * @param borrowRecord
     * @return
     */
    boolean addBorrow(BorrowRecord borrowRecord);
    /**
     * 按照借款编号，批量删除
     * @param bids 选中的借款编号数组
     * @return 返回是否删除成功
     */
    boolean delBorrows(List<Integer> bids);
    /**
     * 修改借款信息
     * @param borrowRecord
     * @return
     */
    boolean updBorrow(BorrowRecord borrowRecord);

    /**
     * 审核人员批量修改借款状态
     * @param list 传过来的借款记录集合
     * @return
     */
    boolean updBorrows(List<Map<String,String>> list);
}
