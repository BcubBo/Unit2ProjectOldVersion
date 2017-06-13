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
	<form id="userForm" name="userForm" method="post" action="${pageContext.request.contextPath}/user.do">
		<input type="hidden" name="method" value="modifyexe">
		<input type="hidden" name="uid" value="${user.id }"/>
		<div class="content">
			<table class="box">
			   <tbody><tr>
					<td class="field">用户登陆名：</td>
					<td><input type="text" name="userCode" class="text" id="userCode" value=""><font color="red"></font></td>
				</tr>
				
				 <tr>
					<td class="field">用户名称：</td>
					<td><input type="text" name="userName" class="text" id="userName" value="${user.userName }"><font color="red"></font></td>
				</tr>

				<tr>
					<td class="field">用户性别：</td>
					<td><select name="gender" id="gender">
					<!-- c:choose 相当于if条件句 -->
					<c:choose>
					
						<c:when test="${user.gender ==1 }">						    <option value="1" selected="selected">男</option>
						    <option value="2">女</option></c:when>
						<c:otherwise>
										<option value="1" >男</option>
						    <option value="2" selected="selected">女</option>
						
						
						</c:otherwise>
					
					</c:choose>

						 </select>
						 </td>
				</tr>
				<tr>
					<td class="field">出生日期：</td>
					<td><input type="text" name="bornDate" class="Wdate" id="bornDate" value="${user.bornDate }" readonly="readonly" onclick="WdatePicker();"> <font color="red"></font></td>
				</tr>
				<tr>
					<td class="field">用户电话：</td>
					<td><input type="text" name="phone" class="text" id="phone" value="${user.phone }"><font color="red"></font></td>

				</tr>
				<tr>
					<td class="field">用户地址：</td>
					<td><input name="address" id="address" class="text" value="${user.address }"></td>
				</tr>
				<tr>
					<td class="field">用户类别：</td>

					<td><input type="radio" name="userType" value="1"
					
					<c:if test="${user.userType == 1 }">checked="true"</c:if>
					
					
					
					>管理员<input type="radio" name="userType" value="2" <c:if test="${user.userType == 2 }">checked="true"</c:if>>经理
					<input type="radio" name="userType" value="3" <c:if test="${user.userType == 3 }">checked="true"</c:if>>普通用户</td>
				</tr>
			</tbody></table>
		</div>
		<div class="buttons">
			<input type="button" name="save" id="saveBtn" value="保存" class="input-button">
			<input type="button" name="button" id="button" onclick="history.back(-1)" value="返回" class="input-button"> 
		</div>

	</form>
</div>









</body>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/user/userModify.js" >

</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/calendar/WdatePicker.js" ></script>
</html>

