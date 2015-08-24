<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/commons/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录页面</title>
<%@include file="/commons/public.jsp" %>
<style type="text/css">
body{ background:#2b9c6b/* url(images/login_bg.jpg) no-repeat*/; color:#2f3437; font-size:12px;}
#login_div{ width:100%; height:100%;}
#login_div .login_bt{ width:100%; height:30%; position:relative;}
#login_div .login_logo{font-size:40px;color:#fff;line-height:65px;text-align:center; width:450px; height:65px; position:absolute; top:-85px; left:50%; margin-left:-225px; }
#login_div .login_nr{ width:100%; height:300px; background:rgba(47,52,55,0.8); filter:progid:DXImageTransform.Microsoft.gradient(startcolorstr=#7F2f3437,endcolorstr=#7F2f3437);}
#login_div .login_zi{ width:316px; margin:100px auto;}
#login_div .tishi{ width:100%; height:55px; line-height:55px; color:#ffffff;}
#login_div .tishi span{ display:block; width:16px; height:16px; margin-top:20px; float:left;}
#login_div .tishi p{ float:left; padding-left:5px;}
#login_div .icon_close{cursor:pointer; background:url(images/icon_close.png) no-repeat;}
#login_div .icon_ok{ background:url(images/icon_ok.png) no-repeat;}
#login_div .box{ width:100%; height:44px; margin-bottom:8px; background:#d3d5dc;-moz-border-radius:6px;-webkit-border-radius:6px;border-radius: 6px;}
#login_div .user_box{ width:252px; height:44px; line-height:44px; padding-left:12px; border:0px; background:none; float:left;}
#login_div .user_pic{ width:52px; height:44px; background:url(images/icon_username.png) no-repeat center; float:left;}
#login_div .password_pic{ width:52px; height:44px; background:url(images/icon_key.png) no-repeat center; float:left;}
#login_div .yanzheng,#login_div .yz_box{ width:62%; line-height:44px; background:none; border:0px; float:left;}
#login_div .yz_change,#login_div .yz_pic{ width:38%; line-height:44px; text-align:center; float:right;}
#login_div .yz_change a{ color:#ffffff;}
#login_div .yz_change span{ color:#28b779;}
#login_div .submit_btn{ width:100%; height:44px; text-align:center; color:#ffffff; font-size:18px; border:0px; background:#28b779;-moz-border-radius:6px;-webkit-border-radius:6px;border-radius: 6px; cursor:pointer;}
.copyright{text-align:center;width:100%;color:#fff;position:absolute;bottom:10px;}
</style>
</head>

<body>
<div id="login_div">
     <div class="login_bt">
          <div class="login_logo">CMS后台管理系统</div>
     </div>
     <div class="login_nr">
          <div class="login_zi">
          	   <div class="tishi">
          	    	<div class="tishi" id="tishi" style="display:none;"><span class="icon_close"></span><p></p></div>
          	   </div>
               <div class="box">
                    <input name="" type="text" id="account" placeholder="请输入账号"  maxlength="50" class="user_box" />
                    <div class="user_pic"></div>
               </div>
               <div class="box">
                    <input name="" type="password" id="password" placeholder="请输入密码"  maxlength="50" class="user_box" />
                    <div class="password_pic"></div>
               </div>
               <div class="yanzheng">
                    <div class="box">
                         <input name="" type="text" class="yz_box" />
                         <div class="yz_pic"></div>
                    </div>
               </div>
               <div class="yz_change"><a href="#">看不清，<span>换一张！</span></a></div>
               <div class="clearfix"></div>
               <input id="submit" name="" onclick="tz_login()" type="button" class="submit_btn" value="登 录" />
          </div>
     </div>
     <div class="copyright">Copyright &copy; 2015 www.yjava.cn All Rights Reserved</div>
</div>
<script type="text/javascript">
	function tz_login(){
		var account = $("#account").val();
		var password = $("#password").val();
		if(isEmpty(account)){
			$("#tishi").find("p").text("账号不能为空！");
			$("#tishi").show();
			return;
		}
		if(isEmpty(password)){
			$("#tishi").find("p").text("密码不能为空！");
			$("#tishi").show();
			return;
		}
		if(account.length>20){
			$("#tishi").find("p").text("账号也太长了吧！");
			$("#tishi").show();
			return;
		}
		if(password.length>20){
			$("#tishi").find("p").text("密码也太长了吧！");
			$("#tishi").show();
			return;
		}
		$("#submit").val("登 录 中...").off("click");
		var options={
			url:basePath+"ajax/loginValidate",
			data:{account:account,password:password},
			callback:function(data){
				if(data.result=="success"){
					location.href=basePath+"admin/index";
				}else{
					$("#tishi").find("p").text("您输入的用户名或密码不正确，请重新输入！");
					$("#tishi").show();	
					$("#submit").val("登 录").on("click",tz_login);
				}
			}
		};
		$.yj_utils.yj_ajax(options);
	}
	$(function(){
		$("#account").focus();
		$(".icon_close").click(function(){
			$(this).parent().hide();
		});
		$(document).keydown(function(e){
			if(e.keyCode==13){
				$("#submit").trigger("click");
			}
		});
		
	});
</script>
</body>
</html>