<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>banner管理</title>
	<%@include file="/commons/public.jsp" %>
</head>
<body>
	<div class="container">
	     <jsp:include page="/commons/admin/header.jsp"></jsp:include>
	     <div class="nopermission">非常抱歉！404页面不存在！<span id="count">10</span>秒后回到首页~    </div>
	</div>
	<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
	<script type="text/javascript">
		$(function(){
			var count=$("#count").text();
			var timer=null;
			clearInterval(timer);
			timer=setInterval(function(){
		   		count--;
		   		if(count<1){location.href="<%=basePath%>"+"admin/index";}
		   		if(count==0){count++;}
		   		$("#count").text(count);
			},1000);
		});
	</script>
</body>
</html>
