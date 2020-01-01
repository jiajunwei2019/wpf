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
<form id="form1">
<input type="hidden" name="id" value="${g.id }">

     商品名称:<input type="text" name="name" value="${g.name }"><br>
     英文名称:<input type="text" name="ename" value="${g.ename }"><br>
     商品品牌:<select name="bid" id="bid">
     
     </select>
     <br>
     商品种类
     <select id="lid" name="lid">
       
     </select><br>
     
     尺寸:<input type="text" name="chi" value="${g.chi }"><br>
     单元(元):<input type="text" name="dj" value="${g.dj }"><br>
    数量:<input type="text" name="sj" value="${g.sj }"><br>
     标签:<input type="text" name="bq" value="${g.bq }"><br>
  商品图片:  <input type="file" name="file"><br>
  <button type="button" onclick="add()">修改添加</button>
     </form>
     
     <script type="text/javascript">
     function add() {
    	 var formData=new FormData($("#form1")[0])
			$.ajax({
				type:"post",
				url:"/update",
				data:formData,
				processData:false,
				contentType:false,
				success:function(flag){
					if(flag){
					alert("修改成功")
					location="/list";
				}else{
					alert("修改失败")
				}
			}
			
			}); 
	}
         $(function(){
        	$.post(
        	 "/brand",function(date){
        		 for ( var i in date) {
					$("#bid").append("<option value='"+date[i].bid+"'>"+date[i].bname+"</option>")
				}
        		  
        		 $("#bid [value='${g.bid}']").attr("selected",true)
        		 
        	 }	,"json"	
        	
        	) 
        	$.post(
               	 "/kind",function(date){
               		 for ( var i in date) {
       					$("#lid").append("<option value='"+date[i].jid+"'>"+date[i].jname+"</option>")
       				}
               		 $("#lid [value='${g.lid}']").attr("selected",true)
               	 }	,"json"	
               	
               	) 
        	 
         })
     
     </script>
</body>
</html>