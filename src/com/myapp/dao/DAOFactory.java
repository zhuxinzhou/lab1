package com.myapp.dao;
import com.myapp.dao.*;

public class DAOFactory {
    public static IUserDAO getIUserDAOInstance(){
        return new UserProxy() ;
    }}
