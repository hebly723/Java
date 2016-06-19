<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="loginServlet" method="post">  
    <div>  
        姓名：<input type="text" name="name"/><br/>  <br/>
        密码：<input type="text" name="pas"/><br/>  <br/>
     <input type="submit" value="登录"/>  
     <input type="hidden" value="login" name="typeId"/>    
   </div>  
  </form>  
  </body>
</html>
