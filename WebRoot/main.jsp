<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  			<p align="right">
   			<a href="ShowRackAction" >个人空间</a>
  			</p>
  		<table align="left">
  			<tr>
  			<td><a href="">玄幻</a></td>
  			<td><a href="">科幻</a></td>
  			</tr>	
  			
  			<tr>
  			<td><a href="">都市</a></td>
  			<td><a href="">历史</a></td>
  			</tr>
  			
  			<tr>
  			<td><a href="">军事</a></td> 			
  			<td><a href="">奇幻</a></td> 			
  			</tr>
  			
  			<tr>
  			<td><a href="">武侠</a></td> 			
  			<td><a href="">仙侠</a></td> 			
  			</tr>
  			
  			<tr>
  			<td><a href="">职场</a></td> 			
  			<td><a href="">游戏</a></td> 
  			</tr>	
  			
  			<tr>
  			<td><a href="">体育</a></td> 			
  			<td><a href="">灵异</a></td> 			
  			</tr>		
  			
  			<tr>
  			<td><a href="">军事</a></td> 			
  			<td><a href="">奇幻</a></td> 			
  			</tr>
  			
  			<tr>
  			<td><a href="">女生网</a></td> 			
  			<td><a href="">二次元</a></td> 			
  			</tr>
  		</table>
  		
  		<table align="center">
  			<tr>
  			<td><a href="">全部作品</a></td> 	
  			<td><a href="">排行榜</a></td>	 	
  			</tr>
  			<tr>
  			<td colspan="3">1111111111111</td>
  			</tr>
  			
  			<tr>
  			<td colspan="3">222222222222</td>
  			</tr>
  		</table>
  </body>
</html>
