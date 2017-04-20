<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/view.css"/>
<title>Insert title here</title>
</head>
<body>
	<div>
		<h2 style="color: purple;font-weight: bold;">系统管理</h2>
	</div>
	<hr/>
	<div>
		<div id="box">
			<img align="middle" alt="部门管理"  src="${pageContext.request.contextPath }/resources/img/sysmanager.jpg"><br/>
			<p align="center"><a href="sys/smanager">部门管理</a></p>
		</div>
		<div id="box">
			<img align="middle" alt="基本资料管理"  src="${pageContext.request.contextPath }/resources/img/sysinfor.jpg"><br/>
			<p align="center"><a href="sys/sinfor" >基本资料管理</a></p>
		</div>
	</div>
</body>
</html>