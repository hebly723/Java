<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>消息提示</title>
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/img/title.ico" media="screen" />
  </head>
  
  <body>
        ${message}
        <br/>
        <a href="${pageContext.request.contextPath}/upload.jsp">继续上传</a>
        <a href="${pageContext.request.contextPath}/servlet/ListFileServlet">已经上传的文件</a>
  </body>
</html>