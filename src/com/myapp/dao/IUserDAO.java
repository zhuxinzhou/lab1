package com.myapp.dao;
import com.myapp.dao.user;
public interface IUserDAO {
    // 现在完成的是登陆验证，那么登陆操作只有两种返回结果
    public boolean findLogin(user user) throws Exception ;

    public boolean regerster(user user) throws Exception ;
}
