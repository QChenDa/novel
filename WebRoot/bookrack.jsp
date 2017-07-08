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
    
    <title>My JSP 'readerlogin.jsp' starting page</title>
    
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
  										<p align="right"><a href="">完善信息</a></p>
  			<table align="center">
  			<s:iterator  value="list">
  			<tr>
   			<td><a href="CatalogAction?bookid=<s:property value='book.bookId'/>"><s:property value='book.bookName'/></a></td> 				
			<td><s:property value ="book.bookType"/></td>  			
  			<td><s:property value ="book.latestChapter"/></td>  
  			<td><s:property value ="book.frequency"/></td>  
  			<td><a href="DeleteBookToRackAction?bookname=<s:property value='book.bookName'/>">删除</a></td>
  			<td><a href="comment.jsp">评论</a></td> 			
  			</tr>			
  			</s:iterator>
  			</table>
  </body>
</html>
