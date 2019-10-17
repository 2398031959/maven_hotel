<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<title>管理员管理界面</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-8"><h1>欢迎进入管理登录界面</h1></div>
		<div class="col-md-2"><a href="${pageContext.request.contextPath}/logout">注销</a></div>
		<div class="col-md-2">管理员：${adminLogin.username}</div>
	</div>
	<div class="row">
		<div class="col-md-3 col-md-offset-1">
			<ul class="nav nav-pill nav-stacked">
				<li><a href="#">客房查询</a></li>
			</ul>
		</div>
		<div class="col-md-8">
			<table>
				<tr>
					<td>客人编号</td>
					<td>姓名</td>
					<td>地址</td>
					<td>客房号</td>
					<td>客房描述</td>
					<td>客房类型</td>
					<td>客房状态</td>
					<td>床位数</td>
					<td>价格</td>
					<td>入住人数</td>
				</tr>
				<tr>
					<td>客人编号</td>
					<td>姓名</td>
					<td>地址</td>
					<td>客房号</td>
					<td>客房描述</td>
					<td>客房类型</td>
					<td>客房状态</td>
					<td>床位数</td>
					<td>价格</td>
					<td>入住人数</td>
				</tr>
			</table>
		</div>
	</div>
</div>
</body>
</html>