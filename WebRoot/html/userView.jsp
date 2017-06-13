<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户展示</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>


</head>
<body>

<div class="main">
<input type="hidden" id="path" name="path" value="${pageContext.request.contextPath}"/>
	
		<div class="content">
			<table class="box">
			   <tbody><tr>
					<td class="field">用户登陆名：</td>
					<td>${user.userCode }</td>
				</tr>
				 <tr>
					<td class="field">用户名称：</td>
					<td>${user.userName }</td>
				</tr>
				
				<tr>
					<td class="field">用户性别：</td>
				<td>
					<c:if test="${user.gender ==1 }">男</c:if>
					<c:if test="${user.gender ==2 }">女</c:if>
				</td>   
				</tr>
				<tr>
					<td class="field">出生日期：</td>
					<td>${user.bornDate }</td>
				</tr>
				<tr>
					<td class="field">用户电话：</td>
					<td>${user.phone }</td>

				</tr>
				<tr>
					<td class="field">用户地址：</td>
					<td>${user.address }</td>
				</tr>
				<tr>
					<td class="field">用户类别：</td>

					<td><c:if test = "${user.userType ==1 }">管理员</c:if>
					<c:if test = "${user.userType ==2 }">经理</c:if>
					<c:if test = "${user.userType ==3 }">普通员工</c:if>
				</tr>
			</tbody></table>
		</div>
		<div class="buttons">

			<input type="button" name="button" id="button" onclick="history.back(-1)" value="返回" class="input-button"> 
		</div>

</div>








</body>


</html>

