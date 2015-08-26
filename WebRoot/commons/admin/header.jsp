<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/yj.tld" prefix="yj"%>
<div class="dh clearfix">
     <div class="dh_left fl"><img src="images/logo.png" alt=""/></div>
     <div class="dh_list fl">
          <ul>
          	  <li <yj:links url="admin/index">class="select"</yj:links>><a href="admin/index">首页</a></li>
              <yj:permission url="admin/banners/list">
              	<li <yj:links url="admin/banners">class="select"</yj:links>><a href="admin/banners/list">banner管理</a></li>
              </yj:permission>
              <yj:permission url="admin/courses/list">
             	<li <yj:links url="admin/courses">class="select"</yj:links>><a href="admin/courses/list">课程管理</a></li>
              </yj:permission>
              <yj:permission url="admin/news/list">
              	<li <yj:links url="admin/news">class="select"</yj:links>><a href="admin/news/list">新闻管理</a></li>
              </yj:permission>
              <yj:permission url="admin/teachers/list">
              	<li <yj:links url="admin/teachers">class="select"</yj:links>><a href="admin/teachers/list">讲师管理</a></li>
              </yj:permission>
              <yj:permission url="admin/company/list">
             	<li <yj:links url="admin/company">class="select"</yj:links>><a href="admin/company/list">公司介绍管理</a></li>
             </yj:permission>
              <yj:permission url="admin/links/list">
              	<li <yj:links url="admin/links">class="select"</yj:links>><a href="admin/links/list">友情链接管理</a></li>
              </yj:permission>
          </ul>
          <div class="admin_exit"><p class="info">${sessionScope.adminSession.username }</p><a href="admin/login/exit" class="iconfont">&#xe61b;</a></div>
     </div>
</div>