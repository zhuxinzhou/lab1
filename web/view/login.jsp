<%--
  Created by IntelliJ IDEA.
  User: customer
  Date: 19-4-16
  Time: 上午12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<html>
<head><title>LAB SIX</title></head>
<body>
<script language="javascript">
    function validate(f){


    }
</script>
<%
    request.setCharacterEncoding("GBK") ;
%>
<%
    List<String> info = (List<String>) request.getAttribute("info") ;
    if(info != null){   // 有信息返回
        Iterator<String> iter = info.iterator() ;
        while(iter.hasNext()){
%>
<h4><%=iter.next()%></h4>
<%
        }
    }
%>
<form action="Login" method="post" onSubmit="return validate(this)">
    USERID：<input type="text" name="userid"><br>
    PASSWORD：<input type="password" name="userpass"><br>
    <input type="submit" value="LOGIN">
    <input type="reset" value="REGERISTER">
</form>
</body>
</html>
