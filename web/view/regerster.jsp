<%--
  Created by IntelliJ IDEA.
  User: customer
  Date: 19-4-16
  Time: ����9:10
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
    if(info != null){   // ����Ϣ����
        Iterator<String> iter = info.iterator() ;
        while(iter.hasNext()){
%>
<h4><%=iter.next()%></h4>
<%
        }
    }
%>
<form action="regerster" method="post" onSubmit="return validate(this)">
    USERname��<input type="text" name="userid"><br>
    PASSWORD��<input type="password" name="userpass"><br>
    email��<input type="text" name="email"><br>
    gender��<input type="text" name="gender"><br>

    <input type="submit" value="REGERISTER">

</form>
</body>
</html>
