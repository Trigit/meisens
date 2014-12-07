<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>welcome.jsp</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="uikit-2.8.0/css/uikit.almost-flat.min.css" />
<script src="jquery-1.10.2.js"></script>
<script src="uikit-2.8.0/js/uikit.min.js"></script>
</head>
<body>

	<nav class="uk-navbar"> <a class="uk-navbar-brand" href="#"><img src="logo.png" height="32" width="32" /><span style="color:#009D96">美森园林</span></a>

	<ul class="uk-navbar-nav">
		<li class="uk-parent uk-active" data-uk-dropdown=""><a href=""><i class="uk-icon-home"></i> Level1</a>

			<div style="" class="uk-dropdown uk-dropdown-navbar">
				<ul class="uk-nav uk-nav-navbar">
					<li><a href="#">Item</a></li>
					<li><a href="#">Another item</a></li>
					<li class="uk-nav-header">Header</li>
					<li><a href="#">Item</a></li>
					<li><a href="#">Another item</a></li>
					<li class="uk-nav-divider"></li>
					<li><a href="#">Separated item</a></li>
				</ul>
			</div></li>

		<li class="uk-parent" data-uk-dropdown=""><a href=""><i class="uk-icon-cubes"></i> Smart</a></li>
		<li class="uk-parent" data-uk-dropdown=""><a href=""><i class="uk-icon-envelope"></i> Smart</a></li>
		<li class="uk-parent" data-uk-dropdown=""><a href=""><i class="uk-icon-shopping-cart"></i> Smart</a></li>
	</ul>

	<div class="uk-navbar-content">
		Some <a href="#">link</a>.
	</div>

	<div class="uk-navbar-content uk-hidden-small">
		<form class="uk-form uk-margin-remove uk-display-inline-block">
			<input placeholder="Search" type="text">
			<button class="uk-button uk-button-primary">
				<i class="uk-icon-search"></i>&nbsp;&nbsp;搜&nbsp;&nbsp;索
			</button>
		</form>
	</div>

	<div class="uk-navbar-content uk-navbar-flip  uk-hidden-small">
		<div class="uk-button-group">
			<a class="uk-button uk-button-danger" href="#">Link</a>
			<button class="uk-button uk-button-danger">Button</button>
		</div>
	</div>

	</nav>



	<div class="uk-width-medium-1-3">

		<div class="uk-panel uk-panel-box">

			<h3 class="uk-panel-title">Nav side in panel</h3>

			<ul class="uk-nav uk-nav-side uk-nav-parent-icon" data-uk-nav="">
				<li class="uk-active"><a href="">Active</a></li>

				<li class="uk-parent"><a href="#">Parent</a>
					<div style="overflow:hidden;height:0;position:relative;">
						<ul class="uk-nav-sub">
							<li><a href="">Sub item</a></li>
							<li><a href="">Sub item</a>
								<ul>
									<li><a href="">Sub item</a></li>
									<li><a href="">Sub item</a></li>
								</ul></li>
						</ul>
					</div></li>

				<li class="uk-parent"><a href="#">Parent</a>
					<div style="overflow:hidden;height:0;position:relative;">
						<ul class="uk-nav-sub">
							<li><a href="">Sub item</a></li>
							<li><a href="">Sub item</a></li>
						</ul>
					</div></li>

				<li><a href="">Item</a></li>

				<li class="uk-nav-header">Header</li>
				<li class="uk-parent"><a href=""><i class="uk-icon-star"></i> Parent</a></li>
				<li><a href=""><i class="uk-icon-twitter"></i> Item</a></li>
				<li class="uk-nav-divider"></li>
				<li><a href=""><i class="uk-icon-rss"></i> Item</a></li>
			</ul>

		</div>

	</div>




	<!-- 这是用来触发弹出式边栏的按钮 -->
	<!-- 	<button class="uk-button" data-uk-offcanvas="{target:'#my-id'}">弹出</button> -->

	<!-- 	<div id="my-id__" class="uk-offcanvas uk-active"> -->

	<!-- 		<div class="uk-offcanvas-bar uk-offcanvas-bar-show"> -->

	<!-- 			<ul class="uk-nav uk-nav-offcanvas uk-nav-parent-icon" data-uk-nav=""> -->
	<!-- 				<li><a href="">Item</a></li> -->
	<!-- 				<li class="uk-active"><a href="">Active</a></li> -->

	<!-- 				<li class="uk-parent"><a href="#">Parent</a> -->
	<!-- 					<div style="overflow: hidden; height: 0px; position: relative;"> -->
	<!-- 						<ul class="uk-nav-sub"> -->
	<!-- 							<li><a href="">Sub item</a></li> -->
	<!-- 							<li><a href="">Sub item</a> -->
	<!-- 								<ul> -->
	<!-- 									<li><a href="">Sub item</a></li> -->
	<!-- 									<li><a href="">Sub item</a></li> -->
	<!-- 								</ul></li> -->
	<!-- 						</ul> -->
	<!-- 					</div></li> -->

	<!-- 				<li class="uk-parent uk-open"><a href="#">Parent</a> -->
	<!-- 					<div style="overflow: hidden; height: 59px; position: relative;"> -->
	<!-- 						<ul class="uk-nav-sub"> -->
	<!-- 							<li><a href="">Sub item</a></li> -->
	<!-- 							<li><a href="">Sub item</a></li> -->
	<!-- 						</ul> -->
	<!-- 					</div></li> -->

	<!-- 				<li><a href="">Item</a></li> -->

	<!-- 				<li class="uk-nav-header">Header</li> -->
	<!-- 				<li class="uk-parent"><a href=""><i class="uk-icon-star"></i> Parent</a></li> -->
	<!-- 				<li><a href=""><i class="uk-icon-twitter"></i> Item</a></li> -->
	<!-- 				<li class="uk-nav-divider"></li> -->
	<!-- 				<li><a href=""><i class="uk-icon-rss"></i> Item</a></li> -->
	<!-- 			</ul> -->

	<!-- 		</div> -->

	<!-- 	</div> -->

	<table class="uk-table uk-table-hover uk-table-striped " width="500">
		<caption>留言管理</caption>
		<thead>
			<tr>
				<th>姓名</th>
				<th>邮箱</th>
				<th>内容</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${messageList}" var="msg">
				<tr>
					<td><i class="uk-icon-cubes" />${msg.name}</td>
					<td>${msg.email}</td>
					<td>${msg.content}</td>
					<td><a href="javascript:void(0)">编辑</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<ul class="uk-pagination">
		<li><a href="#"><i class="uk-icon-step-backward"></i>&nbsp;&nbsp;&nbsp;首页</a></li>
		<li class="uk-active"><span><i class="uk-icon-chevron-left"></i>&nbsp;&nbsp;&nbsp;上一页</span></li>
		<li class="uk-disabled"><span>下一页&nbsp;&nbsp;&nbsp;<i class="uk-icon-chevron-right"></i></span></li>
		<li><span>尾页</span></li>
	</ul>

</body>
</html>
