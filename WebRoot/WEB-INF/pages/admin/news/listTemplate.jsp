<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<c:forEach items="${newses}" var="news">
  <tr data-id="${news.id}">
	  <td>${news.id}</td>
	  <td>${news.title}</td>
	  <td>${yj:formatDate(news.createTime,"yyyy年MM月dd日 HH:mm:ss")}</td>
	  <td><a href="javascript:void(0);" class="edit_w">编辑</a><a href="javascript:void(0);" onclick="tm_delete(this)">删除</a></td>
  </tr>
</c:forEach>
