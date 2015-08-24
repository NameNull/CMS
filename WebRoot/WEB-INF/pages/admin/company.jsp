<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>公司简介</title>
<%@include file="/commons/public.jsp" %>
</head>

<body>
<div class="container">
     <jsp:include page="/commons/admin/header.jsp"></jsp:include>
     <div class="ht_con clearfix">
          <div class="add_nr">
               <div class="row_sty clearfix">
                   <p>公司简介：</p>
                   <textarea class="textarea_nr1"></textarea>
               </div>
               <div class="row_sty clearfix">
                   <p>&nbsp;</p>
                   <a href="javascript:void(0);" class="submit btn">立即提交</a>
               </div>               
          </div>
     </div>
</div>
<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
</body>
</html>
