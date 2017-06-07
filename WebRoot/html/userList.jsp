<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>超市账单管理系统-用户管理</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">


</head>
<body>

	<div class="menu">

		<table>
			<tbody>
				<tr>
					<td><form method="post" action="user.do">
							<input name="method" value="query" class="input-text" type="hidden"> 用户名：<input name="queryname" class="input-text" type="text" value="${queryUserName }">&nbsp;&nbsp;&nbsp;&nbsp;
							<input value="查 询" type="submit">
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="main">

		<div class="optitle clearfix">
			<em><input value="添加用户" class="input-button" onclick="window.location='${pageContext.request.contextPath}/html/userAdd.jsp'" type="button">
			</em>
			<div class="title">用户管理&gt;&gt;</div>
		</div>
		<div class="content">
			<table class="list">
				<tbody>
					<tr>
						<td width="70" height="29"><div  align="center">编号</div>
						</td>
						<td width="80"><div align="center">用户名</div>
						</td>
						<td width="80"><div  align="center">用户账号</div>
						</td>
						<td width="100"><div  align="center">性别</div>
						</td>
						<td width="100"><div  align="center">年龄</div>
						</td>
						<td width="150"><div  align="center">电话</div>
						</td>
						<td width="150"><div  align="center">用户类型</div>
						</td>
						<td width="150"><div  align="center">操作</div>
						</td>
					</tr>
					<c:forEach var ="user" items="${userList }" varStatus="status">
						<tr>
							<td>
								<span>
									${user.id}
								</span>
							</td>
							<td>
								<span>
									${user.userCode }
								</span>
							</td>
							<td>
								<span>
									${user.userName }
								</span>
							</td>
							<td>
							<span>
									<c:if test="${user.gender==1 }">男</c:if>
									<c:if test="${user.gender==1 }">女</c:if>
							</span>
							</td>
							<td>
								<span>
									${user.age }
								</span>							
							
							</td>
							<td>
								<span>
									${user.phone }
								</span>
							</td>
							<td>
								<span>
								<c:if test="${user.userType==1}">系统管理</c:if>
								<c:if test="${user.userType==2}">经理</c:if>
								<c:if test="${user.userType==3}">普通员工</c:if>
									
								</span>
							</td>
							
							<td>
								<span>查看</span>
								<span>修改</span>
								<span>删除</span>
							</td>

						
						</tr>
						
					
					
					
					
					
					</c:forEach>
					<tr>
						<td height="23"><span class="STYLE1">-1</span>
						</td>
						<td><span class="STYLE1"> 管理员(html硬编码位置) </span>
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
					
					

					
					
					
				</tbody>
			</table>
		</div>
	</div>

</body></html>