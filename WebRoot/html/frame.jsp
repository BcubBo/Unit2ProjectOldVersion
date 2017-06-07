<!-- <html>
<head>
<style>
* {padding:0px; margin:0px;height:100%; width:100%;}
.content  {padding-top:100px;box-sizing:border-box}
.top {height:100px; width:100%;position:absolute; top:0px;}
.left{ float:left;width:20%;}
.right{ float:left;width:80%;}
#top{height:100px;}
</style>
</head>
<body>
<div class="content">
			<div class="top">
				<iframe src="top.html"  scrolling="No"  id="top" noresize="noresize">
				</iframe>
			</div>
				<div class="main">
					<div class="left">
						<iframe src="left.html" scrolling="No"  id="left" noresize="noresize">
					  </iframe>
						</div>
					<div class="right">
						<iframe src="main.html"  id="mainFrame" name="mainFrame" noresize="noresize" > 
					  </iframe>
						</div>
				</div>
</div>

</body>
</html> -->

<!-- 使用frame进行创建 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html><head><title>超市库存管理系统</title></head>
<frameset rows="102,*">

	<frame src="top.jsp" id="top"
	/>
	<frameset cols="20%,*">
	
	<frame src="left.jsp" id="left" noresize frameborder="0"/>
	<frame src="main.jsp" id="mainFrame" name="mainFrame" frameborder="0"/>
	
	</frameset>


</frameset>


</html>


















