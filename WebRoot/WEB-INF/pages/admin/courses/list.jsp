<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>课程管理</title>
<%@include file="/commons/public.jsp" %>
</head>

<body>
<div class="container">
     <jsp:include page="/commons/admin/header.jsp"></jsp:include>
     <div class="ht_con clearfix">
          <a href="javascript:void(0);" class="add_btn btn">增加课程</a>
          <div class="add_nr">
               <div class="row_sty clearfix">
                   <p>课程标题：</p>
                   <input type="text" class="text_box" placeholder="请在此输入标题--">
               </div>
               <div class="row_sty clearfix">
                    <p>&nbsp;</p>
                    <div class="pic_show">
                         <a href="javascript:void(0);" class="up_img btn_up btn">上传图片</a>
                         <div id="kecheng"><img src="images/pic1.jpg" alt=""/></div>
                    </div>
               </div>
               <div class="row_sty clearfix">
                   <p>&nbsp;</p>
                   <a href="javascript:void(0);" class="submit btn">立即提交</a>
               </div>               
          </div>
          <div class="kc_list">
               <ul>
                   <li><p><img src="images/pic1.jpg" alt=""/>课程标题1</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic2.jpg" alt=""/>课程标题2</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic3.jpg" alt=""/>课程标题3</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic4.jpg" alt=""/>课程标题4</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic5.jpg" alt=""/>课程标题5</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
                   <li><p><img src="images/pic6.jpg" alt=""/>课程标题6</p><a href="#" class="btn edit">编辑</a><a href="#" class="btn delet">删除</a></li>
               </ul>
          </div>
     </div>
</div>
<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
</body>
</html>
