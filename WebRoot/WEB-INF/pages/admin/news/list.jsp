<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>新闻管理</title>
	<%@include file="/commons/public.jsp" %>
	<script type="text/javascript" src="js/jquery.pagination.js"></script>
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
       	  <p>共计<span id="totalNum">${pageInfo.itemCount}</span>个结果</p>
          <table class="news_list">
          <thead>
          <tr>
          <th>序号</th>
          <th>标题</th>
          <th>时间</th>
          <th>操作</th>
          </tr>
          </thead>
          <tbody id="tbody">
          <jsp:include page="listTemplate.jsp"></jsp:include>
          </tbody>
          </table>
          <div id="page" class="page" style="margin-top: 5px;float: right;"></div>
     </div>
</div>
<jsp:include page="/commons/admin/bottom.jsp"></jsp:include>
<script>
	$(function(){
		var itemCount=$("#totalNum").text();
		tm_initPage(itemCount,0,12);
	});
	/* 删除  */
	function tm_delete(obj){
		//不管是什么删除一定要给提示，防止误操作
		tm_dialog({content:"您确定删除吗?",width:300,callback:function(ok){
			if(ok){
				var id = $(obj).closest("tr").data("id");
				var options={
					url:basePath+"ajax/admin/news/delete/"+id,
					callback:function(data){
						if(data.result=="success"){
							var pnum=$("#page").find(".tm_number").val();
							var pn=pnum*1-1;
							var ps=$("#page").find(".tm_psize_go").val();
							tm_loadTemplate(pn, ps); 
						}else{
							alert("删除失败!");
						}
					}
				};
				$.yj_utils.yj_ajax(options);
			}
		}});
	}
	/* 分页 */
	function tm_initPage(itemCount,pn,ps){
		$(".page").pagination(itemCount, {
			num_display_entries : 3, //主体页数
			num_edge_entries : 4,//边缘页数
			current_page : pn,//指明选中页码
			items_per_page : ps, //每页显示多少条
			prev_text : "上一页",
			next_text : "下一页",
			showGo:true,//控制是否显示go 页 ,默认是true
			showSelect:true,//控制是否现在下拉框 默认是true
			callback : function(pageNum, pageSize) {//会回传两个参数一个当前页，显示的页数
				//执行模板数据回调的方法
				tm_loadTemplate(pageNum, pageSize); 
			}
		});
	}
	/* 加载模板 */
	function tm_loadTemplate(pageNum,pageSize,callback){
		var options={
			url:basePath+"admin/news/listTemplate",
			data:{"pageInfo.firstResult":pageNum*pageSize,"pageInfo.maxResults":pageSize},
			callback:function(data){
				$("#tbody").html(data);
			}
		};
		$.yj_utils.yj_ajax(options);
	};
</script>
</body>
</html>
