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
		<h2 style="color: purple;font-weight: bold;">人事管理</h2>
	</div>
	<hr/>
	<div>
		<div id="box">
			<img align="middle" alt="人员档案管理"  src="${pageContext.request.contextPath }/resources/img/personManager.jpg"><br/>
			<p align="center"><a href="personnal/pmanager">人员档案管理</a></p>
		</div>
		<div id="box">
			<img align="middle" alt="人员考评管理"  src="${pageContext.request.contextPath }/resources/img/personexam.jpg"><br/>
			<p align="center"><a href="personnal/pexam">人员考评管理</a></p>
		</div>
		<div id="box">
			<img align="middle" alt="人员培训管理"  src="${pageContext.request.contextPath }/resources/img/persontrain.jpg"><br/>
			<p align="center"><a href="personnal/ptrain">人员培训管理</a></p>
		</div>
		<div id="box">
			<img align="middle" alt="人员职称评定"  src="${pageContext.request.contextPath }/resources/img/persontitle.jpg"><br/>
			<p align="center"><a href="personnal/ptitle">人员职称评定</a></p>
		</div>
	</div>
</body>
</html>