
<%@ page import="com.inkleinations.Publication" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'publication.label', default: 'Publication')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-publication" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-publication" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="description" title="${message(code: 'publication.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="author" title="${message(code: 'publication.author.label', default: 'Author')}" />
					
						<g:sortableColumn property="imageName" title="${message(code: 'publication.imageName.label', default: 'Image Name')}" />
					
						<g:sortableColumn property="pages" title="${message(code: 'publication.pages.label', default: 'Pages')}" />
					
						<g:sortableColumn property="pdfName" title="${message(code: 'publication.pdfName.label', default: 'Pdf Name')}" />
					
						<g:sortableColumn property="priority" title="${message(code: 'publication.priority.label', default: 'Priority')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${publicationInstanceList}" status="i" var="publicationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${publicationInstance.id}">${fieldValue(bean: publicationInstance, field: "description")}</g:link></td>
					
						<td>${fieldValue(bean: publicationInstance, field: "author")}</td>
					
						<td>${fieldValue(bean: publicationInstance, field: "imageName")}</td>
					
						<td>${fieldValue(bean: publicationInstance, field: "pages")}</td>
					
						<td>${fieldValue(bean: publicationInstance, field: "pdfName")}</td>
					
						<td>${fieldValue(bean: publicationInstance, field: "priority")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${publicationInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
