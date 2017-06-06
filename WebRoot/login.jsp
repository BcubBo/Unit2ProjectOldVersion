<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统登录 - 超市账单管理系统</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
<script type="text/javascript">
  function validate(){
		//window.location.href="html/frame.jsp"
		var actionForm = document.getElementById("actionForm");
		actionForm.submit();
		
	}
  </script>
</head>
<body class="blue-style">
<div id="login">
	<div class="icon"></div>
	<div class="login-box">
		<form  action="${pageContext.request.contextPath }/login.do"  name="actionForm" id="actionForm"  method="post" >
			<dl>
				<dt>用户名：</dt>
				<dd><input type="text" class="input-text" id="userCode" name="userCode"/> <span id="userCodeSpan"></span></dd>
				<dt>密　码：</dt>
				<dd><input type="password"  class="input-text" id="userPassword" name="userPassword"/><span id="userPasswordSpan"></span></dd>
			</dl>
			<div class="buttons">
				<input type="button"   value="登录系统" class="input-button" onclick="validate();" />
				<input type="reset"  value="重　　填" class="input-button" />
			</div>
		</form>
	</div>
</div>
</body>
</html>