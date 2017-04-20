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
	var text;
	var action;
	var limited = $("#code").val();
	$("#searchall").click(function(){
		$("#items").datagrid({
			url:"${pageContext.request.contextPath }/personnal/manager/findAll",
			columns:[[
			          {field:"eno",title:"编号",width:100,},
			          {field:"ename",title:"姓名",width:100,},       
			          {field:"epname",title:"部门",width:100,},       
			          {field:"esex",title:"性别",width:100,},
			          {field:"ebirth",title:"出生年月",width:130,},
			          {field:"nation",title:"民族",width:100,},      
			          {field:"registed",title:"籍贯",width:100,},
			          {field:"maritalStatus",title:"婚姻状况",width:100,},
			          {field:"education",title:"学历",width:100,},       
			          {field:"id",title:"身份证号",width:100,},
			          {field:"ejob",title:"职务",width:130,},
			          {field:"phone",title:"电话号码",width:100,},      
			          {field:"mobile",title:"电子邮件",width:100,},
			          {field:"email",title:"手机号码",width:100,},
			          {field:"address",title:"家庭住址",width:100,},
			          {field:"graduateDate",title:"毕业时间",width:100,},
			          {field:"graduateSchool",title:"毕业学校",width:100,},
			          {field:"major",title:"专业",width:130,},
			          {field:"positionalTitle",title:"职称",width:100,},      
			          {field:"jobDateFrom",title:"雇佣时间",width:100,},
			          {field:"contraceDateFrom",title:"合同签订时间",width:100,},
			          {field:"contraceDateTo",title:"合同结束时间",width:100,},
			          {field:"cardnum",title:"银行卡号",width:130,},
			          {field:"publicFundnum",title:"公积金账号",width:100,},      
			          {field:"nativePlace",title:"现住地",width:100,},
			          {field:"politicsStates",title:"社会面貌",width:100,}
			          ]],
	    			onLoadSuccess:function(data){
	    				if(data.total>0)
	    					return;
	    				else
	    					alert("没有查询到相关信息！");
	    				},
	    			striped:true,
	    			pagination:true,
	    			pageSize:5,
	    			pageList:[5,10,15],
	    			singleSelect:true ,
				});
			});
		$("#search").click(function(){
		text = $("#inp").val();
		text = $.trim(text);
		var con = $("input:radio:checked").val();
		if(text == ''){
			alert("请输入查询条件！");
		}else{
			if(con == 2){
				temp=parseInt(text);
			    if(isNaN(temp))
			    {
			        alert("请输入数值类型的数据！");
			    }
			}
			var url = "${pageContext.request.contextPath }/personnal/manager/findCatialAccount?con="+con+"&text="+text;
			url=encodeURI(url);
			url=encodeURI(url);	
			$("#items").datagrid({
				url:url,
				columns:[[
				          {field:"eno",title:"编号",width:100,},
				          {field:"ename",title:"姓名",width:100,
				        	  editor:{type:'text',options:{required:true}}},       
				          {field:"epname",title:"部门",width:100,
				        	  editor:{type:'text',options:{required:true}}},       
				          {field:"esex",title:"性别",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"ebirth",title:"出生年月",width:130,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"nation",title:"民族",width:100,
				        	  editor:{type:'text',options:{required:true}}},      
				          {field:"registed",title:"籍贯",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"maritalStatus",title:"婚姻状况",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"education",title:"学历",width:100,
				        	  editor:{type:'text',options:{required:true}}},       
				          {field:"id",title:"身份证号",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"ejob",title:"职务",width:130,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"phone",title:"电话号码",width:100,
				        	  editor:{type:'text',options:{required:true}}},      
				          {field:"mobile",title:"电子邮件",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"email",title:"手机号码",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"address",title:"家庭住址",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"graduateDate",title:"毕业时间",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"graduateSchool",title:"毕业学校",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"major",title:"专业",width:130,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"positionalTitle",title:"职称",width:100,
				        	  editor:{type:'text',options:{required:true}}},      
				          {field:"jobDateFrom",title:"雇佣时间",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"contraceDateFrom",title:"合同签订时间",width:100,
				        	  editor:{type:'text',options:{required:true}},},
				          {field:"contraceDateTo",title:"合同结束时间",width:100,
				        	  editor:{type:'text',options:{required:true}},},
				          {field:"cardnum",title:"银行卡号",width:130,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"publicFundnum",title:"公积金账号",width:100,
				        	  editor:{type:'text',options:{required:true}}},      
				          {field:"nativePlace",title:"现住地",width:100,
				        	  editor:{type:'text',options:{required:true}}},
				          {field:"politicsStates",title:"社会面貌",width:100,
				        	  editor:{type:'text',options:{required:true}}}
				          ]],
				          idField: "eno",
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
											 		 'ename':'',
											 		 'epname':'', 
											 		 'esex':'',
											 		 'ebirth':'',
											 		 'nation':'',
											 		 'registed':'',
											 		 'maritalStatus':'',
											 		 'education':'',
											 		 'id':'',
											 		 'ejob':'',
											 		 'phone':'',
											 		 'mobile':'',
											 		 'email':'',
											 		 'address':'',
											 		 'graduateDate':'',
											 		 'graduateSchool':'',
											 		 'major':'',
											 		 'positionalTitle':'',
											 		 'jobDateFrom':'',
											 		 'contraceDateFrom':'',
											 		 'contraceDateTo':'',
											 		 'cardnum':'',
											 		 'publicFundnum':'',
											 		 'nativePlace':'',
											 		 'politicsStates':'',
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
												  var eno = row.eno;
												  $.messager.confirm("提示", "您确定要删除这些数据吗？", function (res) {//提示是否删除
							                            if (res) {
							                            	$.ajax({
							                					url: "${pageContext.request.contextPath}/personnal/manager/remove",
							                					data:{'eno':eno},
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
	    						url: "${pageContext.request.contextPath}/personnal/manager/" + url,
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
			
				}
	});
});
</script>
</head>
<body>
	<input type="hidden" id="code" value="${actors.limited}"/>
	快速查找人员：
	<input type="button" value="查询全部" id="searchall"><hr/>
	按条件查询:
		按部门<input type="radio" name="condition" value="1" checked="checked"/>&nbsp;&nbsp;
		按编号<input type="radio" name="condition" value="2"/>&nbsp;&nbsp;
		按职位<input type="radio" name="condition" value="3"/>&nbsp;&nbsp;
		按姓名<input type="radio" name="condition" value="4"/>&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;
		查询条件：<input type="text" id="inp" >
		<input type="button" value="查询" id="search"><br/>
	<table id="items">
	</table>
</body>
</html>