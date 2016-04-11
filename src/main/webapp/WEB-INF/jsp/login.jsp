<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
</head>
<body>
    <form action="${pageContext.servletContext.contextPath}/dologin" method="post">
    	用户名：<input name="username" type="text" >
    	密码：<input name="password" type="password">
    	<button type="submit">登录</button>
    </form>
</body>
</html>
