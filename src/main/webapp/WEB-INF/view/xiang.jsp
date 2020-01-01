<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- ?? css -->
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- ??js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
 商品名称:<input type="text" name="name" value="${g.name }"><br>
     英文名称:<input type="text" name="ename" value="${g.ename }"><br>
     商品品牌:<input type="text" value="${g.bname }">
     <br>
     商品种类
     <input type="text" value="${g.jname }"><br>
     
     尺寸:<input type="text" name="chi" value="${g.chi }"><br>
     单元(元):<input type="text" name="dj" value="${g.dj }"><br>
    数量:<input type="text" name="sj" value="${g.sj }"><br>
     标签:<input type="text" name="bq" value="${g.bq }"><br>
  商品图片:  <img alt="" src="/pic/${g.dfilev }" style="height: 100px;width: 100px;">
</body>
</html>