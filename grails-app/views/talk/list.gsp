
<%@ page import="com.inkleinations.Talk" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'talk.label', default: 'Talk')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-talk" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-talk" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="description" title="${message(code: 'talk.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'talk.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="talkName" title="${message(code: 'talk.talkName.label', default: 'Talk Name')}" />
					
						<g:sortableColumn property="time" title="${message(code: 'talk.time.label', default: 'Time')}" />
					
						<g:sortableColumn property="title" title="${message(code: 'talk.title.label', default: 'Title')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${talkInstanceList}" status="i" var="talkInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${talkInstance.id}">${fieldValue(bean: talkInstance, field: "description")}</g:link></td>
					
						<td>${fieldValue(bean: talkInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: talkInstance, field: "talkName")}</td>
					
						<td>${fieldValue(bean: talkInstance, field: "time")}</td>
					
						<td>${fieldValue(bean: talkInstance, field: "title")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${talkInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
