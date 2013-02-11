<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Enchanting
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20120818

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
<title><g:layoutTitle default="Grails"/></title>
<link href="http://fonts.googleapis.com/css?family=Dancing+Script|Open+Sans+Condensed:300" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" type="text/css">
<g:layoutHead/>
<r:layoutResources />
</head>
<body>
<div id="wrapper">
	<div id="menu" class="container">
		<ul>
			<li class="current_page_item"><a href="/">Home</a></li>
			<li><g:link controller="home" action="family">About Us</g:link></li>
			<li><a href="http://blog.inkleinations.com">Blog</a></li>
			<li><g:link controller="publication" action="publishing">Publishing</g:link></li>
			<li><g:link controller="home" action="audio">Audio</g:link></li>
			<li><g:link controller="home" action="conference_sessions">Sessions</g:link></li>
			<li><g:link controller="home" action="links">Links</g:link></li>
			<li><g:link controller="home" action="contact">Contact</g:link></li>
		</ul>
	</div>
	<div id="logo" class="container">
		<h1><a href="#"><section:content for="header" /> </a></h1>
        <p><section:content for="subheader" /></p>
	</div>
	<div id="page" class="container">
		<div id="banner"><section:image for="headerimage" width="959" height="380" alt="" /></div>
		<div id="content">
            <g:layoutBody />
			<div style="clear: both;">&nbsp;</div>
		</div>
		<!-- end #content -->
		<div id="sidebar">
			<div>
                <section:image for="sidebar1image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar2image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar3image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar4image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar5image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar6image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar7image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar8image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar9image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar10image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar11image" dir="family" width="145" height="145" alt="" />
                <section:image for="sidebar12image" dir="family" width="145" height="145" alt="" />
			</div>
            <p>&nbsp;</p>
		</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end #page -->
	<div id="three-column" class="container">
		<div id="tbox1">
			<div class="box-style">
                <div class="image"><section:image for="link1image" dir="family" width="320" height="170" alt="" /></div>
				<div class="arrow"></div>
				<div class="content">
                    <section:content for="link1text" />
				</div>
			</div>
		</div>
		<div id="tbox2">
			<div class="box-style">
                <div class="image"><section:image for="link2image" dir="family" width="320" height="170" alt="" /></div>
				<div class="arrow"></div>
				<div class="content">
                    <section:content for="link2text" />
				</div>
			</div>
		</div>
		<div id="tbox3">
			<div class="box-style">
                <div class="image"><section:image for="link3image" dir="family" width="320" height="170" alt="" /></div>
				<div class="arrow"></div>
				<div class="content">
                    <section:content for="link3text" />
				</div>
			</div>
		</div>
	</div>
</div>
<div id="footer">
    <section:content for="footer4text" />
</div>
<!-- end #footer -->
<div class="footer" role="contentinfo"></div>
<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
<g:javascript library="application"/>
<r:layoutResources />
</body>
</html>
