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
$(document).ready(function(){
	var action;
	var limited = $("#code").val();
	
	$("#items").datagrid({
		url:"${pageContext.request.contextPath }/user/manager/find",
		columns:[[
		          {field:"userid",title:"操作员编号",width:100},       
		          {field:"username",title:"操作员姓名",width:100,
		        	  editor:{type:'text',options:{required:true}}}, 
		          {field:"password",title:"密码",width:100},     
		          {field:"limited",title:"权限编号",width:100,hidden:true},     
		          {field:"limitedStr",title:"权限",width:100,
		        		  editor: {  
                              type: 'combobox',  
                              options: {                               
                                         valueField: 'text',  
                                         textField: 'text',  
                                         method: 'get',  
                                         url: '${pageContext.request.contextPath }/News/limitedStr',  
                                         required: true,  
                                        }  
                             } 
		        	  }     
		          ]],
		          toolbar: [
				 	          {
								iconCls: 'icon-add',
						  		text: '添加',
						 		 handler: function(){
							 	/*
							 	1、添加新行(inserRow)
							 	2、可编辑列：editor
							 	3、点击保存进行提交
							 	4、响应onAfterEdit事件
							 	 */
							 	if("0"== limited){
							 		$("#items").datagrid("insertRow",
											 {index:0,
										 	  row:{
										 		 'username':'', 
										 		 'password':'',
										 		 'limitedStr':'',
											 	}
											 }
									 );
									 $("#items").datagrid("beginEdit", 0);
									 action = 0;
									 rowIndex = 0;
								  }else{
									  alert("对不起，您没有此权限！");
								  }
							 	}
						 	},'-',
								 {iconCls: 'icon-remove',
									  text: '删除',
									  handler: function(){
										  if("0"== limited){
											  var row = $("#items").datagrid("getSelected");
											  var userid = row.userid;
											  $.messager.confirm("提示", "您确定要删除这些数据吗？", function (res) {//提示是否删除
						                            if (res) {
						                            	$.ajax({
						                					url: "${pageContext.request.contextPath}/user/manager/remove",
						                					data:{'userid':userid},
						                					type:"post",
						                					success:function(data){
						                						// 数据提交成功后，需要刷新表格
						                						$("#items").datagrid("reload", {});
						                						alert("删除成功!");
						                					},
						                					error:function(){
						                						alert("删除失败!");
						                					}});
						                              	$("#items").datagrid('deleteRow', rowIndex);
						                            }
						                        }); 
										  }else{
											  alert("对不起，您没有此权限！");
										  }
									  }
									 },'-',
			                  {
			    				text : '保存',
			    				iconCls: 'icon-save',
			    				handler: function(){
			    		            /* $("#items").datagrid('endEdit',index); */
			    					var rows = $("#items").datagrid('getRows');
			    		            for ( var i = 0; i < rows.length; i++) {
			    		            	$("#items").datagrid('endEdit', i);
			    		            }
			    			  }}
				    	  ],
				    	  onLoadSuccess:function(data){
			    				if(data.total>0)return;
			    				else
			    					alert("没有查询到相关信息！");
			    				},
			    			idField: "userid",
		    				striped:true,
		    				pagination:true,
		    				pageSize:5,
		    				pageList:[5,10,15],
		    				singleSelect:true ,
		    				onAfterEdit: function(rowIndex, rowData, changes){
		    					var url;
		    					if(action == 1)
		    						url = "modify";
		    					else if (action == 0)
		    						url = "add";
		    					$.ajax({
		    						url: "${pageContext.request.contextPath}/user/manager/" + url,
		    						data: rowData,
		    						type:"POST",
		    						dataType:"json",
		    						success:function(data){
		    							// 数据提交成功后，需要刷新表格
		    							$("#items").datagrid("reload", {});
		    							alert("保存成功!");
		    						},
		    						error:function(){
		    							alert("保存失败!");
		    						}
		    					});
		    				}
			});
		});
</script>
</head>
<body>
	<input type="hidden" id="code" value="${actors.limited}"/>
	<table id="items">
	</table>
</body>
</html>