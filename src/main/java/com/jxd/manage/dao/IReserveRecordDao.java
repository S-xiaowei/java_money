package com.jxd.manage.dao;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.BorrowDateSet;
import com.jxd.manage.ds.ReserveDateSet;
import com.jxd.manage.model.BorrowRecord;
import com.jxd.manage.model.ReserveRecord;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface IReserveRecordDao {
    /**
     * 分页查询
     * @param reserveDateSet 查询条件
     * @return
     */
    IPage<ReserveRecord> selectReserveByPage(IPage<ReserveRecord> pages, @Param("ds")ReserveDateSet reserveDateSet);
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
    boolean addReserve(@Param("reserveRecord")ReserveRecord recordRecord);
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
    boolean updReserve(@Param("reserveRecord")ReserveRecord reserveRecord);

    /**
     * 批量修改还款信息的还款状态
     * @param reserveRecord
     * @return
     */
    boolean updReserves(@Param("reserveRecord") ReserveRecord reserveRecord);
}
