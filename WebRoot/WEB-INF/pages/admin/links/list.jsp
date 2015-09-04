<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>友情链接管理</title>
<%@include file="/commons/public.jsp" %>
</head>

<body>
<div class="container">
     <jsp:include page="/commons/admin/header.jsp"></jsp:include>
     <div class="ht_con clearfix">
          <a href="javascript:void(0);" class="add_btn btn">增加友情链接</a>
          <div class="add_nr">
               <div class="row_sty clearfix">
                   <p>链接标题：</p>
                   <input type="text" class="text_box" placeholder="请在此输入标题--">
               </div>
               <div class="row_sty clearfix">
                   <p>链接地址：</p>
                   <input type="text" class="text_box" placeholder="请在此输入地址--">
               </div>
               <div class="row_sty clearfix">
                   <p>&nbsp;</p>
                   <a href="javascript:void(0);" class="submit btn">立即提交</a>
               </div>               
          </div>
          <table class="news_list">
          <tr>
          <th>序号</th>
          <th>友情链接标题</th>
          <th>链接地址</th>
          <th>创建时间</th>
          <th>操作</th>
          </tr>
          <tr>
          <td>1</td>
          <td>潭州软件学院</td>
          <td>http://www.tanzhouedu.com/</td>
          <td>2015-04-28</td>
          <td><a href="javascript:void(0);" class="edit_w">编辑</a><a href="javascript:void(0);">删除</a></td>
          </tr>
          <tr>
          <td>2</td>
          <td>腾讯课堂</td>
          <td>http://ke.qq.com/</td>
          <td>2015-04-28</td>
          <td><a href="javascript:void(0);" class="edit_w">编辑</a><a href="javascript:void(0);">删除</a></td>
          </tr>
          <tr>
          <td>3</td>
          <td>百度每日讲坛</td>
          <td>http://www.baidu.com/</td>
          <td>2015-04-28</td>
          <td><a href="javascript:void(0);" class="edit_w">编辑</a><a href="javascript:void(0);">删除</a></td>
          </tr>
          <tr>
          <td>4</td>
          <td>优酷</td>
          <td>http://www.youku.com/</td>
          <td>2015-04-28</td>
          <td><a href="javascript:void(0);" class="edit_w">编辑</a><a href="javascript:void(0);">删除</a></td>
          </tr>
          <tr>
          <td>5</td>
          <td>湖南教育网</td>
          <td>http://www.hunan.com/</td>
          <td>2015-04-28</td>
          <td><a href="javascript:void(0);" class="edit_w">编辑</a><a href="javascript:void(0);">删除</a></td>
          </tr>
          <tr>
          <td>6</td>
          <td>苹果官方论坛</td>
          <td>http://www.apple.com/</td>
          <td>2015-04-28</td>
          <td><a href="javascript:void(0);" class="edit_w">编辑</a><a href="javascript:void(0);">删除</a></td>
          </tr>
          </table>
     </div>
</div>
<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
</body>
</html>
