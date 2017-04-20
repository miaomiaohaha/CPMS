<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/login.css"/>
	<title>Insert title here</title>
	<script type="text/javascript">
	  function show(){
			 var u = document.getElementById("username").value;
			var m = document.getElementById("password").value;
			if(u == null || u.trim() == '' || u.length == 0){
				alert("用户名不能为空");
				return false;
			}else if(m == null || m.trim() == '' || m.length == 0){
				alert("密码不能为空");
				return false;
			}
			return true;
		}
	  </script>
	</head>
	<body>
	  <div id="login" align="center">
          <sf:form action="${pageContext.request.contextPath }/login" method="post" modelAttribute="actors" onsubmit="return show();">
			<br/>
			权&nbsp;&nbsp;&nbsp;限：&nbsp;&nbsp;
			<select name="limited" id="limited">
				<option value="0">管理员</option>
				<option value="1">普通</option>
			</select><br/>
			用户名：&nbsp;&nbsp;
			<input type="text" id="username" name="username"/>
			密&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;
			<input type="password" id="password" name="password"/>
			<br/>
			<input type="submit" value="登录" id="submit"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="重置" id="reset"/>
          </sf:form>
	 </div>
	</body>
</html>