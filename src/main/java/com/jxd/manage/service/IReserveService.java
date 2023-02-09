package com.jxd.manage.service;

import com.jxd.manage.model.ReserveRecord;
import com.jxd.manage.model.ReserveState;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface IReserveService {
    /**
     * 分页查询
     * @param queryMap 查询条件
     * @return
     */
    Map<String,Object> selectReserveByPage(Map<String,String> queryMap);
    /**
     * 根据编号获取还款记录
     * @param rid 编号
     * @return
     */
    List<ReserveRecord> getReserveByRid(String rid);
    /**
     * 新增还款
     * @param recordRecord
     * @return
     */
    boolean addReserve(ReserveRecord recordRecord);
    /**
     * 按照还款编号，批量删除
     * @param rids 选中的还款编号数组
     * @return 返回是否删除成功
     */
    boolean delReserves(@Param("rids") List<Integer> rids);
    /**
     * 修改还款信息
     * @param reserveRecord
     * @return
     */
    boolean updReserve(ReserveRecord reserveRecord);

    /**
     * 审核人员批量修改还款状态
     * @param list 传过来的map的list集合
     * @return
     */
    boolean updReserves(List<Map<String,String>> list);

}
