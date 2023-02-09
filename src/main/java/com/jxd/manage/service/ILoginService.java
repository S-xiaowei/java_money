package com.jxd.manage.service;
import com.jxd.manage.model.User;
import java.util.Map;

public interface ILoginService {
   /**
    * 登录
    * @param user
    * @return job,uid,uname的集合
    */
   Integer  login(User user);
   /**
    * 根据uid查询emp
    * @param uid
    */
   Map<String,String> getEmpByUid(Integer uid);
   /**
    * 根据uid获取Admin
    * @param uid
    * @return
    */
   Map<String, String> getAdminByUid (Integer uid);

}
