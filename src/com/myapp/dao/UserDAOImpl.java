package com.myapp.dao;
import com.myapp.dao.*;
import com.myapp.model.*;
import java.sql.* ;
public class UserDAOImpl implements IUserDAO {
    private Connection conn = null ;
    private PreparedStatement pstmt = null ;
    private com.myapp.dao.user user;

    public UserDAOImpl(Connection conn){
        this.conn = conn ;
    }
    public boolean findLogin(user user) throws Exception{
        boolean flag = false ;
        String sql = "SELECT username FROM usertable WHERE username=? AND password=?" ;
        this.pstmt = this.conn.prepareStatement(sql) ;
        this.pstmt.setString(1,user.getId()) ;
        this.pstmt.setString(2,user.getPassword()) ;
        ResultSet rs = this.pstmt.executeQuery() ;
        if(rs.next()){
            user.setusername(rs.getString(1)) ; // 取出一个用户的真实姓名
            flag = true ;
        }
        this.pstmt.close() ;
        return flag ;
    }

    public boolean regerster(user user) throws Exception {
        boolean flag = false ;
        String sql = "insert into  usertable values (2,?,?,?,?, null )" ;
        this.pstmt = this.conn.prepareStatement(sql) ;
        this.pstmt.setString(1,user.getId()) ;
         this.pstmt.setString(2,user.getPassword()) ;
            this.pstmt.setString(3,user.getemail()) ;
            this.pstmt.setString(4,user.getGender()) ;
        int rs = this.pstmt.executeUpdate() ;



        this.pstmt.close() ;
        return flag ;
    }

}




