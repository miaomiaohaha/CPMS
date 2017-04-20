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
		url:"${pageContext.request.contextPath }/personnal/exam/findexam",
		columns:[[
		          {field:"examno",title:"考评编号",width:100,hidden:true},       
		          {field:"eno",title:"编号",width:100,
		        	  editor:{type:'numberbox',options:{required:true}}},       
		          {field:"ename",title:"姓名",width:100,
		        	  editor:{type:'text',options:{required:true}}},       
		          {field:"epname",title:"部门",width:100,
		        	  editor:{type:'text',options:{required:true}}},
		          {field:"examdatefrom",title:"考评开始时间",width:100,
		        	  editor:{type:'datebox',options:{required:true}}},
		          {field:"examdateto",title:"考评结束时间",width:100,
		        	  editor:{type:'datebox',options:{required:true}}},
		          {field:"examname",title:"考评内容",width:100,
		        	  editor:{type:'text',options:{required:true}}},
		          {field:"examresult",title:"考评结果",width:100,
		        	  editor:{type:'text',options:{required:true}}},
		          {field:"examlevel",title:"考评等级",width:100,
		        	  editor:{type:'text',options:{required:true}}},
		          {field:"examscore",title:"考评分数",width:130,
		        	  editor:{type:'numberbox',options:{required:true}}},
		          {field:"remark",title:"备注",width:100,
		        	  editor:{type:'text',options:{required:true}}},      
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
										 		 'eno':'',
										 		 'epname':'', 
										 		 'examdatefrom':'',
										 		 'examdateto':'',
										 		 'examname':'',
										 		 'examresult':'',
										 		 'examlevel':'',
										 		 'examscore':'',
										 		 'remark':'',
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
					        {iconCls: 'icon-edit',
								text: '修改',
							 handler: function(){
									  if("0"== limited){
										  var row = $("#items").datagrid("getSelected");
										  rowIndex = $("#items").datagrid("getRowIndex", row);
										  $("#items").datagrid("beginEdit", rowIndex);
										  action = 1;
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
											  var examno = row.examno;
											  $.messager.confirm("提示", "您确定要删除这些数据吗？", function (res) {//提示是否删除
						                            if (res) {
						                            	$.ajax({
						                					url: "${pageContext.request.contextPath}/personnal/exam/remove",
						                					data:{'examno':examno},
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
			    			idField: "examno",
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
		    						url: "${pageContext.request.contextPath}/personnal/exam/" + url,
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