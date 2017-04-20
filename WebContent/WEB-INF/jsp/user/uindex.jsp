<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" 
	src="${pageContext.request.contextPath }/resources/easyui/jquery-1.8.0.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/easyui/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/easyui/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/easyui/icon.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/view.css"/>
<title>Insert title here</title>
</head>
<script type="text/javascript">
 $(document).ready(function(){
	var limited = $("#code").val();
	$("a").click(function(e){ 
		if(("0"!= limited)&&(e.target !=$("#ucifer")[0])){
			alert("您没有查看的权限！");
            return;
		}
	});
}); 
 
</script>
<body>
	<input type="hidden" id="code" value="${actors.limited}"/>
	<div>
		<h2 style="color: purple;font-weight: bold;">用户管理</h2>
	</div>
	<hr/>
	<div>
		<div id="box">
			<img align="middle" alt="操作员管理"  src="${pageContext.request.contextPath }/resources/img/useradminmanager.jpg"><br/>
			<p align="center"><a href="user/umanager" >操作员管理</a></p>
		</div>
		<div id="box">
			<img align="middle" alt="操作员权限管理"  src="${pageContext.request.contextPath }/resources/img/userlimit.jpg"><br/>
			<p align="center"><a href="user/ulimit">操作员权限管理</a></p>
		</div>
		<div id="box">
			<img align="middle" alt="修改口令"  src="${pageContext.request.contextPath }/resources/img/usercifer.jpg"><br/>
			<p align="center"><a id=ucifer href="user/ucifer">修改口令</a></p>
		</div>
	</div>
</body>
</html>