
<%@ page import="com.inkleinations.Audiobook" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'audiobook.label', default: 'Audiobook')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-audiobook" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-audiobook" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="description" title="${message(code: 'audiobook.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="author" title="${message(code: 'audiobook.author.label', default: 'Author')}" />
					
						<g:sortableColumn property="bookName" title="${message(code: 'audiobook.bookName.label', default: 'Book Name')}" />
					
						<g:sortableColumn property="reader" title="${message(code: 'audiobook.reader.label', default: 'Reader')}" />
					
						<g:sortableColumn property="time" title="${message(code: 'audiobook.time.label', default: 'Time')}" />
					
						<g:sortableColumn property="title" title="${message(code: 'audiobook.title.label', default: 'Title')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${audiobookInstanceList}" status="i" var="audiobookInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${audiobookInstance.id}">${fieldValue(bean: audiobookInstance, field: "description")}</g:link></td>
					
						<td>${fieldValue(bean: audiobookInstance, field: "author")}</td>
					
						<td>${fieldValue(bean: audiobookInstance, field: "bookName")}</td>
					
						<td>${fieldValue(bean: audiobookInstance, field: "reader")}</td>
					
						<td>${fieldValue(bean: audiobookInstance, field: "time")}</td>
					
						<td>${fieldValue(bean: audiobookInstance, field: "title")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${audiobookInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
