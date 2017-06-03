<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<html><head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>è¶å¸è´¦åç®¡çç³»ç»-ä¾åºåç®¡ç</title>
<link type="text/css" rel="stylesheet" href="../css/style.css">
</head>
<body>

	<div class="menu">

		<table>
			<tbody>
				<tr>
					<td><form method="post" action="provider.do">
							<input name="method" value="query" class="input-text" type="hidden"> ä¾åºååç§°ï¼<input name="proName" class="input-text" type="text" value="">&nbsp;&nbsp;&nbsp;&nbsp;
							<input value="æ¥ è¯¢" type="submit">
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="main">

		<div class="optitle clearfix">
			<em><input value="æ·»å ä¾åºå" class="input-button" onclick="window.location='providerAdd.html'" type="button">
			</em>
			<div class="title">ä¾åºåç®¡ç&gt;&gt;</div>
		</div>
		<div class="content">
			<table class="list">
				<tbody>
					<tr>
						<td width="70" height="29"><div class="STYLE1" align="center">ç¼å·</div>
						</td>
						<td width="80"><div class="STYLE1" align="center">ä¾åºååç§°</div>
						</td>
						<td width="80"><div class="STYLE1" align="center">èç³»äºº</div>
						</td>
						<td width="100"><div class="STYLE1" align="center">èç³»çµè¯</div>
						</td>
						<td width="100"><div class="STYLE1" align="center">ä¼ ç</div>
						</td>
						<td width="100"><div class="STYLE1" align="center">æä½æ¶é´</div>
						</td>
					</tr>
					
					<tr>
						<td height="23"><span class="STYLE1">5</span>
						</td>
						<td><span class="STYLE1"><a href="providerView.html" style="color:red"> åäº¬å¸ç²®æ²¹æ»å¬å¸</a>
						</span>
						</td>
						<td><span class="STYLE1"> é»ä¸æ¸</span>
						</td>
						<td><span class="STYLE1">18900000000</span>
						</td>
						<td><span class="STYLE1"></span>
						</td>
						<td><span class="STYLE1">2014-10-09</span>
						</td>
					</tr>
					
					<tr>
						<td height="23"><span class="STYLE1">7</span>
						</td>
						<td><span class="STYLE1"><a href="provider.do?method=getInfo&amp;proId=7"> é¯é¸å¸äºå¾å©é¢ç²å</a>
						</span>
						</td>
						<td><span class="STYLE1"> ç¨æµ·æ´</span>
						</td>
						<td><span class="STYLE1">18900000000</span>
						</td>
						<td><span class="STYLE1"></span>
						</td>
						<td><span class="STYLE1">2014-10-09</span>
						</td>
					</tr>
					
					<tr>
						<td height="23"><span class="STYLE1">6</span>
						</td>
						<td><span class="STYLE1"><a href="provider.do?method=getInfo&amp;proId=6"> é¡ºä¹çäº¬å¤éæ¹å3é¨</a>
						</span>
						</td>
						<td><span class="STYLE1"> æ¨å</span>
						</td>
						<td><span class="STYLE1">18900000000</span>
						</td>
						<td><span class="STYLE1"></span>
						</td>
						<td><span class="STYLE1">2014-10-10</span>
						</td>
					</tr>
					
					
				</tbody>
			</table>
		</div>
	</div>

</body></html>