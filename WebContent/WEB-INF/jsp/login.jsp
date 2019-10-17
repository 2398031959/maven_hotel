<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
<title>管理员登录界面</title>
</head>
<script type="text/javascript">
	function login(){
		var username=$("#username").val();
		var password=$("#password").val();
		$.ajax({
			url:"${pageContext.request.contextPath}/login",
			type:"post",
			data:JSON.stringify({
				username:username,
				password:password
			}),
			contentType:"application/json;charset=UTF-8",
			dataType:"json",
			success:function(dataJson){
				if(dataJson.code==200){
					window.location.href="${pageContext.request.contextPath}/management";
				}
			}
		});
	}
</script>
<body>
	<div class="container">
		<div class="row" style="margin-top: 20px">
			<div class="col-md-4 col-md-offset-3">
				<h1>管理登录界面</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 col-md-offset-3">
				<p style="color:red;">${msg}<p>
				用户名：<input type="text" id="username">
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 col-md-offset-3">
				密码：<input type="text" id="password">
			</div>
		</div>
		<div class="row">
			<div class="col-md-1 col-md-offset-3">
				<button class="btn btn-primary" onclick="login()">
					登录
				</button>
			</div>
		</div>
	</div>
</body>
</html>