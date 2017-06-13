<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
</head>
<body>
<form id="passwordSubmit" action="${pageContext.request.contextPath }/user.do" method="post">
<input type="hidden" name="path" id="path" value="${pageContext.request.contextPath }"/>
<input type="hidden" name="method" value="savepwd"/>
	<div class="main">
		<div class="optitle clearfix">
			<div class="title">密码修改&gt;&gt;</div>
		</div>
			<div class="content">
							  <input  type="hidden" id="userId" value="${userInfo.userId}"/>
				<table class="box"> 

					 <tr>
					<td class="field">旧密码：</td>
					<td><input type="password" name="oldPassword" class="text" id="oldPassword" value="" /> <font color="red">*</font><font color="red" id="password_span"></font></td>
				</tr>
				 <tr>
					<td class="field">新密码：</td>
					<td><input type="password" name="newPassword" class="text" id="newPassword"  /> <font color="red">*</font></td>
				</tr>
				<tr>
					<td class="field">确认新密码：</td>
					<td><input type="password" name="rnewPassword" class="text" id="rnewPassword"  value=""/> <font color="red">*</font></td>
				</tr>
				</table>
			</div>
			<div class="buttons">
				<input type="button" id="save" value="修改" class="input-button" />
			</div>
	</div>
	</form>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/user/pwdmodify.js"></script>
</body>
</html>
