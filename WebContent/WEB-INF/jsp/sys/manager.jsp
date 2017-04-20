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
<script type="text/javascript">
$(function(){  
    $('#tt').tree({      
      url: '${pageContext.request.contextPath }/smanager/show',      
      loadFilter: function(data){      
          if (data.d){      
              return data.d;      
          } else {      
              return data;      
          }     
      }      
 	});   
});  

</script>
</head>
<body>
	<ul id="tt" class="easyui-tree"></ul>
	
</body>
</html>