<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>


</head>
<body>

<div class="main">
<input type="hidden" id="path" name="path" value="${pageContext.request.contextPath}"/>
	<div class="optitle clearfix">
		<div class="title">用户管理&gt;&gt;</div>

	</div>
	<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/user.do">
		<input type="hidden" name="method" value="add">
		<div class="content">
			<table class="box">
			   <tbody><tr>
					<td class="field">用户登陆名：</td>
					<td><input type="text" name="userCode" class="text" id="userCode" value=""><font color="red"></font></td>
				</tr>
				 <tr>
					<td class="field">用户名称：</td>
					<td><input type="text" name="userName" class="text" id="userName" value=""><font color="red"></font></td>
				</tr>
				 <tr>
					<td class="field">用户密码：</td>
					<td><input type="password" name="userPassword" class="text" id="userPassword" value=""><font color="red"></font></td>
				</tr>
				 <tr>
					<td class="field">确认密码：</td>
					<td><input type="password" name="ruserPassword" class="text" id="ruserPassword" value=""><font color="red"></font></td>
				</tr>
				<tr>
					<td class="field">用户性别：</td>
					<td><select name="gender" id="gender">
						    <option value="1" selected="selected">男</option>
						    <option value="2">女</option>
						 </select></td>
				</tr>
				<tr>
					<td class="field">出生日期：</td>
					<td><input type="text" name="bornDate" class="Wdate" id="bornDate" value="" readonly="readonly" onclick="WdatePicker();"> <font color="red"></font></td>
				</tr>
				<tr>
					<td class="field">用户电话：</td>
					<td><input type="text" name="phone" class="text" id="phone" value=""><font color="red"></font></td>

				</tr>
				<tr>
					<td class="field">用户地址：</td>
					<td><input name="address" id="address" class="text" value=""></td>
				</tr>
				<tr>
					<td class="field">用户类别：</td>

					<td><input type="radio" name="userType" value="1">管理员<input type="radio" name="userType" value="2" checked="checked">经理
					<input type="radio" name="userType" value="3">普通用户</td>
				</tr>
			</tbody></table>
		</div>
		<div class="buttons">
			<input type="submit" name="add" id="add" value="保存" class="input-button">
			<input type="button" name="button" id="button" onclick="history.back(-1)" value="返回" class="input-button"> 
		</div>

	</form>
</div>









</body>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/user/add.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/calendar/WdatePicker.js" ></script>
</html>

