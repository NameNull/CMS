<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>后台首页</title>
<%@include file="/commons/public.jsp" %>
</head>

<body>
<div class="container">
     <jsp:include page="/commons/admin/header.jsp"></jsp:include>
     <div class="ht_con clearfix">
        <p class="text">CMS是Content Management System的缩写，意为"内容管理系统"。 内容管理系统是企业信息化建设和电子政务的新宠，也是一个相对较新的市场。对于内容管理，业界还没有一个统一的定义，不同的机构有不同的理解。</p>
     	<p class="text">隐藏在内容管理系统(CMS)之后的基本思想是分离内容的管理和设计。页面设计存储在模板里，而内容存储在数据库或独立的文件中。 当一个用户请求页面时，各部分联合生成一个标准的 HTML 页面。</p>
     </div>
</div>
<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
</body>
</html>
