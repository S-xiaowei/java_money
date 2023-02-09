package com.jxd.manage.dao;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.Dept;
import com.jxd.manage.model.User;
import com.jxd.manage.model.User;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface IUserDao {
    /**
     * 分页查询
     * @param userDateSet 查询条件
     * @return
     */
    IPage<User> selectUserByPage(IPage<User> pages, @Param("ds") ManageDateSet userDateSet);
    /**
     * 登录时候获取User
     * @param user
     * @return
     */
    Integer  getUId (@Param("user") User user);
    /**
     * 查询所有用户
     * @return 查询到的集合
     */
    List<User> selectAllUser();
    /**
     * 查询是否有对应用户
     * @return 查询到的
     */
    Integer selectUser(User user);
    /**
     * 新增用户
     * @param User
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "uid", keyColumn = "uid")
    boolean addUser(User User);
    /**
     * 按照员工编号，批量删除
     * @param eids 选中的员工编号数组
     * @return 返回是否删除成功
     */
    boolean delUser(@Param("uids") String[] eids);
    /**
     * 修改员工信息
     * @param map
     * @return
     */
    boolean updUser(@Param("user") Map<String,String> map);

    /**
     * 查询用户名是否重复
     * @param uname
     * @return
     */
    Integer selectUname(String uname);
    /**
     * 重置用户密码
     * @param uids
     * @return
     */
    boolean resertPwds(@Param("uids") String[] uids);

}
