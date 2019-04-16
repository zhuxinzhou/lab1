package com.myapp.controller;

import com.myapp.dao.DAOFactory;
import com.myapp.dao.user;
import com.mysql.fabric.Response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class regersterservlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "view/regerster.jsp" ;
        String userid = req.getParameter("userid") ;
        String userpass = req.getParameter("userpass") ;
        String email = req.getParameter("email") ;
        String gender = req.getParameter("gender") ;
        List<String> info = new ArrayList<>() ;   // 收集错误
        if(userid==null || "".equals(userid)){
            info.add("NAME IS NONE") ;
        }
        if(userpass==null || "".equals(userpass)){
            info.add("PASSWORD IS NONE") ;
        }
        if(info.size()==0){ // 里面没有记录任何的错误
            user user = new user() ;
            user.setId(userid); ;
            user.setPassword(userpass) ;
            user.setemail(email); ;
            user.setGender(gender); ;
            try{
                if(DAOFactory.getIUserDAOInstance().regerster(user)){
                    info.add("regerster sucessful，welcome" + user.getusername() + "！") ;
                } else {
                    info.add("login wrong") ;
                }
            }catch(Exception e){
                e.printStackTrace() ;
            }
        }
        req.setAttribute("info",info) ;
        req.getRequestDispatcher(path).forward(req,resp) ;

    }
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        this.doGet(req,resp) ;
    }}
