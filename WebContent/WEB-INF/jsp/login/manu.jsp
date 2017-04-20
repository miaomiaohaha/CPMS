<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/manu.css"/>
<script type="text/javascript">
	function changeMain1(){
		self.parent.frames["main"].location.href="personnalindex";
	}
	function changeMain2(){
		self.parent.frames["main"].location.href="salaryindex";
	}
	function changeMain3(){
		self.parent.frames["main"].location.href="sysindex";
	}
	function changeMain4(){
		self.parent.frames["main"].location.href="userindex";
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>
			<a href="javascript:void(0);" onclick="changeMain1()">
				人事管理
			</a>
			</td>
		</tr>
		<tr>
			<td>
			<a href="javascript:void(0);" onclick="changeMain2()">
			工资管理
			</a>
			</td>
		</tr>
		<tr>
			<td>
			<a href="javascript:void(0);" onclick="changeMain3()">
			系统管理
			</a>
			</td>
		</tr>
		<tr>
			<td>
			<a href="javascript:void(0);" onclick="changeMain4()">
			用户管理
			</a>
			</td>
		</tr>
	</table>
</body>
</html>