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
<a href="/add">添加</a>
    <form action="/list" method="post">
    <input type="text" name="name" value="${g.name }">
    <input type="submit" value="搜索" >
    <br>
     <c:forEach items="${list }" var="u" >
       
         <img alt="" src="/pic/${u.dfilev }" style="height: 100px;width: 100px;">
         <br>
          <input type="checkbox" value="${u.id }" class="pp"> ${u.dj }
         <br>
          ${u.name }${u.ename }${u.chi }<br>
          ${u.sj }${u.bq }
          
          <input type="button" value="修改" onclick="xiu(${u.id})">
          <input type="button" value="删除" onclick="shan(${u.id})">
          <input type="button" value="批除" onclick="pishan()">
          <input type="button" value="详情" onclick="xiang(${u.id})">
          <br>
       </c:forEach>
      <button name="pageNum" value="1">首页</button>
      <button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
      <button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage }">下一页</button>
      <button name="pageNum" value="${pg.pages }">尾页</button>
      </form>
      <script type="text/javascript">
        function xiu(id) {
        	alert(id)
		location="xiu?id="+id	
		}
        function shan(id) {
    
       if( confirm("确认删除")){
    		
       	$.post(
       			 "/shan",{id:id},
       			 function (date) {
       			
       				location="/list"
       			},"json"
       			 
       			) 
       }
        
        
		
		}
        function xiang(id) {
			location="xiang?id="+id
		}
        function pishan() {
		var j=	$(".pp").map(function(){
				return $(this).val()
			}).get().join()
			alert(j)
			location="pishan?id="+j
		}
      </script>
</body>
</html>