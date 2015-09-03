<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>新闻管理</title>
<%@include file="/commons/public.jsp" %>
</head>

<body>
<div class="container">
     <jsp:include page="/commons/admin/header.jsp"></jsp:include>
     <div class="ht_con clearfix">
          <a href="javascript:void(0);" class="add_btn btn">增加新闻</a>
          <div class="add_nr">
               <div class="row_sty clearfix">
                   <p>新闻标题：</p>
                   <input type="text" class="text_box" placeholder="请在此输入标题--">
               </div>
               <div class="row_sty clearfix">
                   <p>作者：</p>
                   <input type="text" class="text_box" placeholder="请在此输入作者--">
               </div>
               <div class="row_sty clearfix">
                   <p>新闻内容：</p>
                   <textarea class="textarea_nr"></textarea>
               </div>
               <div class="row_sty clearfix">
                   <p>&nbsp;</p>
                   <a href="javascript:void(0);" class="submit btn">立即提交</a>
               </div>               
          </div>
          <table class="news_list">
          <tr>
          <th>序号</th>
          <th>标题</th>
          <th>时间</th>
          <th>操作</th>
          </tr>
          <c:forEach items="${newses}" var="news">
          	  <tr>
		          <td>${news.id}</td>
		          <td>${news.title}</td>
		          <td>${yj:formatDate(news.createTime,"yyyy年MM月dd日 HH:mm:ss")}</td>
		          <td><a href="javascript:void(0);" class="edit_w">编辑</a><a href="javascript:void(0);">删除</a></td>
	          </tr>
          </c:forEach>
          </table>
     </div>
</div>
<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
</body>
</html>
