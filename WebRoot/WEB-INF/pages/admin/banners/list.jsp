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
     <div class="ht_con clearfix">
          <a href="javascript:void(0);" class="add_btn btn">增加banner</a>
          <div class="add_nr">
               <div class="row_sty clearfix">
                   <p>banner标题：</p>
                   <input type="text" class="text_box" placeholder="请在此输入标题--">
               </div>
               <div class="row_sty clearfix">
                    <p>&nbsp;</p>
                    <div class="pic_show">
                         <a href="javascript:void(0);" class="up_img btn_up btn">上传图片</a>
                         <div id="ban"><img src="images/banner.png" alt=""/></div>
                    </div>
               </div>
               <div class="row_sty clearfix">
                   <p>&nbsp;</p>
                   <a href="javascript:void(0);" class="submit btn">立即提交</a>
               </div>               
          </div>
          <div class="ban_list">
               <ul>
                   <li><p><img src="images/banner.png" alt=""/>banner标题</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/banner.png" alt=""/>banner标题</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/banner.png" alt=""/>banner标题</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/banner.png" alt=""/>banner标题</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
               </ul>
          </div>
     </div>
</div>
<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
</body>
</html>
