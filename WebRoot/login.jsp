<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ç³»ç»ç»å½ - è¶å¸è´¦åç®¡çç³»ç»</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript">
  function validate(){
		window.location.href="frame.jsp"
	}
  </script>
</head>
<body class="blue-style">
<div id="login">
	<div class="icon"></div>
	<div class="login-box">
		<form  action=""  name="actionForm" id="actionForm"  method="post" >
			<dl>
				<dt>ç¨æ·åï¼</dt>
				<dd><input type="text" class="input-text" /> <span id="loginNameSpan"></span></dd>
				<dt>å¯ãç ï¼</dt>
				<dd><input type="password"  class="input-text" /><span id="passwordSpan"></span></dd>
			</dl>
			<div class="buttons">
				<input type="button"   value="ç»å½ç³»ç»" class="input-button" onclick="validate();" />
				<input type="reset"  value="éããå¡«" class="input-button" />
			</div>
		</form>
	</div>
</div>
</body>
</html>
