<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="dh clearfix">
     <div class="dh_left fl"><img src="images/logo.png" alt=""/></div>
     <div class="dh_list fl">
          <ul>
          	  <li class="select"><a href="admin/index">首页</a></li>
              <li><a href="admin/banners/list">banner管理</a></li>
              <li><a href="admin/courses/list">课程管理</a></li>
              <li><a href="admin/news/list">新闻管理</a></li>
              <li><a href="admin/teachers/list">讲师管理</a></li>
              <li><a href="admin/company/list">公司介绍管理</a></li>
              <li><a href="admin/links/list">友情链接管理</a></li>
          </ul>
          <div class="admin_exit"><p class="info">${sessionScope.adminSession.username }</p><a href="admin/login/exit" class="iconfont">&#xe61b;</a></div>
     </div>
</div>