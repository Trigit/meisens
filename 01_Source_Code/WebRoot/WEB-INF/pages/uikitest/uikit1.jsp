<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@include file="/common/jsp/uikit.jspf"%>
<link href="common/css/Sang Jeon.css" rel="stylesheet" type="text/css" />
<title>uikit1</title>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<div id="logo">
				<div id="inner">
					<img id="portrait" src="${webroot}/common/images/Jack.jpg" />
					<div id="info">
						<p style="color:#fffdff">Jack Sparrow</p>
						<p style="color:#348a87">boki@email.com</p>
					</div>
				</div>
			</div>
			<div id="uniedit">
				<img src="site/20140926035518165_easyicon_net_24.png" />
				<i class="uk-icon-home uk-icon-medium"></i>
				<img src="site/20140926035525158_easyicon_net_24.png" />
				<i class="uk-icon-github uk-icon-medium"></i>
			</div>
			<div id="uninav"></div>
			<div id="searchbar">
				<input type="text" placeholder="Search" />
			</div>
		</div>
		<div id="nav">
			<div>
				<a class="pmenu">Mailboxes</a>
			</div>
			<ul>
				<li><a href="#"><span><i class="uk-icon-github"></i>&nbsp;&nbsp;&nbsp;&nbsp;Inbox</span></a></li>
				<li><a href="#"><span><i class="uk-icon-paw"></i>&nbsp;&nbsp;&nbsp;&nbsp;Started</span></a></li>
				<li><a href="#"><span><i class="uk-icon-paper-plane-o"></i>&nbsp;&nbsp;&nbsp;&nbsp;Drafts</span></a></li>
				<li><a href="#"><span><i class="uk-icon-share-alt-square"></i>&nbsp;&nbsp;&nbsp;&nbsp;Send Mail</span></a></li>
				<li><a href="#"><span><i class="uk-icon-university"></i>&nbsp;&nbsp;&nbsp;&nbsp;Archive</span></a></li>
			</ul>
			<div id="navfooter">
				<i class="uk-icon-paw"></i> <i class="uk-icon-paw"></i>
			</div>
		</div>
		<div id="article">
			<div id="banner">
				<span>Inbox</span>
			</div>
			<ul id="brief">
				<li>
					<div class="itemframe">
						<div class="lititle">
							Dribble <span class="date">★&nbsp;&nbsp;&nbsp;4/28,07:13AM ∨<span>
						</div>
						<div class="title">[Dribble]Invitation from Kevin Harris to be a player.</div>
						<p>Visit BBC News for up-to-the-minute news, breaking news, video, audio and feature stories. BBC News provides trusted World and UK news as well as</p>
						</span>
				</li>
				<li>
					<div class="itemframe" style="border-left: solid #5fc8ff 3px;">
						<div class="lititle">
							Dribble <span class="date">★&nbsp;&nbsp;&nbsp;4/28,07:13AM ∨<span>
						</div>
						<div class="title">[Dribble]Invitation from Kevin Harris to be a player.</div>
						<p>Visit BBC News for up-to-the-minute news, breaking news, video, audio and feature stories. BBC News provides trusted World and UK news as well as</p>
						</span>
				</li>
			</ul>
		</div>
		<div id="sidebar">
			<div id="banner2">
				<span>[Dribble]Invitation from Kevin Harris to be a player.</span>
			</div>
			<div id="title2">
				<div id="imgwrapper">
					<img src="site/book_128.ico" />
				</div>
				<div>
					<p style="color:#53596f;font-size:14px;margin-top:15px;font-weight:bold;line-height:25px">Dribble</p>
					<p style="color:#979a9f;font-size:14px;font-weight:bold; line-height:25px">
						from <a style="color:#368b88;text-decoration:none;" href="#">Enathord@yeah.net</a> to me
					</p>
				</div>
			</div>
			<div id="content" style="padding:0 10px; font-size:13px">
				<p>
					<strong>Kevin Harris</strong> <a href="#" style="color:#e74f88">http://www.baiidu.com</a> Indian Mars probe sends first images
				</p>
				<p>India's space agency releases its first pictures of Mars as its satellite begins work a day after entering orbit around the Red Planet.</p>
				<p>India Mars mission arrives in orbit</p>
				<p>Mars on a budget</p>
				<p>Indians tweet Mars success</p>
			</div>
		</div>
</body>
</html>
