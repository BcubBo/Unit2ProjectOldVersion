<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>超市账单管理系统-用户管理</title>
<link type="text/css" rel="stylesheet" href="../css/style.css">


</head>
<body>

	<div class="menu">

		<table>
			<tbody>
				<tr>
					<td><form method="post" action="user.do">
							<input name="method" value="query" class="input-text" type="hidden"> 用户名：<input name="name" class="input-text" type="text" value="">&nbsp;&nbsp;&nbsp;&nbsp;
							<input value="查 询" type="submit">
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="main">

		<div class="optitle clearfix">
			<em><input value="添加用户" class="input-button" onclick="window.location='userAdd.html'" type="button">
			</em>
			<div class="title">用户管理&gt;&gt;</div>
		</div>
		<div class="content">
			<table class="list">
				<tbody>
					<tr>
						<td width="70" height="29"><div class="STYLE1" align="center">编号</div>
						</td>
						<td width="80"><div class="STYLE1" align="center">用户名</div>
						</td>
						<td width="80"><div class="STYLE1" align="center">用户账号</div>
						</td>
						<td width="100"><div class="STYLE1" align="center">性别</div>
						</td>
						<td width="100"><div class="STYLE1" align="center">年龄</div>
						</td>
						<td width="150"><div class="STYLE1" align="center">电话</div>
						</td>
						<td width="150"><div class="STYLE1" align="center">权限</div>
						</td>
					</tr>
					
					<tr>
						<td height="23"><span class="STYLE1">-1</span>
						</td>
						<td><span class="STYLE1"> 管理员 </span>
						</td>
						<td><span class="STYLE1"><a href="user.do?method=getInfo&amp;userId=-1"> admin</a>
						</span>
						</td>

						<td><span class="STYLE1">
						
							男
							
						
						 </span>
						</td>
						<td><span class="STYLE1"> 2</span>
						</td>
						<td><span class="STYLE1">323232</span>
						</td>
						<td><span class="STYLE1">
						
						
							管理员
							
							
						
					     </span>
						</td>
					</tr>
					
					
					<tr>
						<td height="23"><span class="STYLE1">1</span>
						</td>
						<td><span class="STYLE1"> 秦守新 </span>
						</td>
						<td><span class="STYLE1"><a href="userView.html"  style="color:red"> shouxin.qin</a>
						</span>
						</td>

						<td><span class="STYLE1">
						
							男
							
						
						 </span>
						</td>
						<td><span class="STYLE1"> 2</span>
						</td>
						<td><span class="STYLE1">111</span>
						</td>
						<td><span class="STYLE1">
						
						
							
							普通员工
							
						
					     </span>
						</td>
					</tr>
					
					
					
				</tbody>
			</table>
		</div>
	</div>

</body></html>