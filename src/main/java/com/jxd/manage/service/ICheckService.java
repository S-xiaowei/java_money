package com.jxd.manage.service;

import com.jxd.manage.model.BorrowRecord;
import java.util.Map;

public interface ICheckService {
    /**
     * 分页查询
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectBorrowByPage(Map<String,String> queryMap);
    /**
     * 修改借款信息
     * @param borrowRecord
     * @return
     */
    boolean updBorrow(BorrowRecord borrowRecord);
}
