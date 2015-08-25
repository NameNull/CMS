<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>讲师管理</title>
<%@include file="/commons/public.jsp" %>
</head>

<body>
<div class="container">
     <jsp:include page="/commons/admin/header.jsp"></jsp:include>
     <div class="ht_con clearfix">
          <a href="javascript:void(0);" class="add_btn btn">增加讲师</a>
          <div class="add_nr">
               <div class="row_sty clearfix">
                   <p>讲师名称：</p>
                   <input type="text" class="text_box" placeholder="请在此输入名称--">
               </div>
               <div class="row_sty clearfix">
                    <p>&nbsp;</p>
                    <div class="pic_show">
                         <a href="javascript:void(0);" class="up_img btn_up btn">上传图片</a>
                         <div id="kecheng"><img src="images/pic7.jpg" alt=""/></div>
                    </div>
               </div>
               <div class="row_sty clearfix">
                   <p>讲师介绍：</p>
                   <textarea class="textarea_nr"></textarea>
               </div>
               <div class="row_sty clearfix">
                   <p>&nbsp;</p>
                   <a href="javascript:void(0);" class="submit btn">立即提交</a>
               </div>               
          </div>
          <div class="kc_list">
               <ul>
                   <li><p><img src="images/pic8.jpg" alt=""/>讲师1</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic9.jpg" alt=""/>讲师2</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic10.jpg" alt=""/>讲师3</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic11.jpg" alt=""/>讲师4</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic12.jpg" alt=""/>讲师5</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic13.jpg" alt=""/>讲师6</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
               </ul>
          </div>
     </div>
</div>
<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
</body>
</html>
