<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@include file="/common/jsp/uikit.jspf"%>
<title>uikit2</title>
</head>

<body>
	<div class="uk-margin">
		<nav class="uk-navbar"> <a class="uk-navbar-brand" href="#">Brand</a>

		<ul class="uk-navbar-nav">
			<li class="uk-parent uk-active" data-uk-dropdown=""><a href=""><i class="uk-icon-home"></i> Level1</a>

				<div class="uk-dropdown uk-dropdown-navbar">
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

		</ul>

		<div class="uk-navbar-content">
			Some <a href="#">link</a>.
		</div>

		<div class="uk-navbar-content uk-hidden-small">
			<form class="uk-form uk-margin-remove uk-display-inline-block">
				<input placeholder="Search" type="text">
				<button class="uk-button uk-button-primary">Submit</button>
			</form>
		</div>

		<div class="uk-navbar-content uk-navbar-flip  uk-hidden-small">
			<div class="uk-button-group">
				<a class="uk-button uk-button-danger" href="#">Link</a>
				<button class="uk-button uk-button-danger">Button</button>
			</div>
		</div>

		</nav>

	</div>

	<%
		
	%>

	<table border="0" width="100%">
		<tr>
			<td width="250" valign="top">
				<ul class="uk-nav uk-nav-side">
					<li><a href="#">...</a></li>
					<li class="uk-active"><a href="#">...</a></li>
				</ul>
			</td>
			<td style="padding:30px"><table class="uk-table uk-table-hover uk-table-striped " width="500">
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
				</table></td>
		</tr>
	</table>

</body>
</html>
