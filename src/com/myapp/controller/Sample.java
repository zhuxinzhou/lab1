package com.myapp.controller;

import com.myapp.dao.DAOFactory;
import com.myapp.dao.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        String path = "view/login2.jsp" ;
        String userid = req.getParameter("userid") ;
        String userpass = req.getParameter("userpass") ;
        List<String> info = new ArrayList<>() ;   // 收集错误

        if(userpass=="123456" || "123456".equals(userpass)){
            info.add("LOGIN SUCCSSFUL") ;
        }

        req.setAttribute("info",info) ;
        req.getRequestDispatcher(path).forward(req,resp) ;
    }
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        this.doGet(req,resp) ;
    }

}

