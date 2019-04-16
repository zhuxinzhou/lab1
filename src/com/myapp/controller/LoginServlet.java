package com.myapp.controller;

import java.io.* ;
import java.util.* ;
import javax.servlet.* ;
import javax.servlet.http.* ;

import com.myapp.dao.*;
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        String path = "view/login.jsp" ;
        String userid = req.getParameter("userid") ;
        String userpass = req.getParameter("userpass") ;
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
            try{
                if(DAOFactory.getIUserDAOInstance().findLogin(user)){
                    info.add("lOgin sucessful，welcome" + user.getusername() + "！") ;
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
