package com.jxd.manage.service;

import com.jxd.manage.dao.IUserDao;
import com.jxd.manage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface ISelfService {
    /**
     * 修改用户信息
     * @param map 用户名/密码
     * @return
     */
    boolean updUser(Map<String,String> map);

    /**
     * 查询用户名是否重复
     * @param uname
     * @return
     */
    Integer selectUname(String uname);

    /**
     * 查找数据库对应user的pwd是否正确
     * @param user
     * @return
     */
    Integer selectUser(User user);


}
