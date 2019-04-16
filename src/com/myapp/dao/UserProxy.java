package com.myapp.dao;
import com.myapp.model.*;
import com.myapp.model.*;
import java.sql.* ;
public class UserProxy implements IUserDAO {
    private DatabaseConnection dbc = null ;
    private IUserDAO dao = null ;
    public UserProxy(){
        try{
            this.dbc = new DatabaseConnection() ;
        }catch(Exception e){
            e.printStackTrace() ;
        }
        this.dao = new UserDAOImpl(dbc.getConnection()) ;
    }
    public boolean findLogin(user user) throws Exception{
        boolean flag = false ;
        try{
            flag = this.dao.findLogin(user) ;   // 调用真实主题，完成操作
        }catch(Exception e){
            throw e ;
        }finally{
            this.dbc.close() ;
        }
        return flag ;
    }

    public boolean regerster(user user) throws Exception{
        boolean flag = true ;
        try{
            this.dao.regerster(user) ;   // 调用真实主题，完成操作
        }catch(Exception e){
            throw e ;
        }finally{
            this.dbc.close() ;
        }
        return flag ;
    }
}
