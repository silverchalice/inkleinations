
<%@ page import="com.inkleinations.Audiobook" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'audiobook.label', default: 'Audiobook')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-audiobook" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-audiobook" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list audiobook">
			
				<g:if test="${audiobookInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="audiobook.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${audiobookInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${audiobookInstance?.author}">
				<li class="fieldcontain">
					<span id="author-label" class="property-label"><g:message code="audiobook.author.label" default="Author" /></span>
					
						<span class="property-value" aria-labelledby="author-label"><g:fieldValue bean="${audiobookInstance}" field="author"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${audiobookInstance?.bookName}">
				<li class="fieldcontain">
					<span id="bookName-label" class="property-label"><g:message code="audiobook.bookName.label" default="Book Name" /></span>
					
						<span class="property-value" aria-labelledby="bookName-label"><g:fieldValue bean="${audiobookInstance}" field="bookName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${audiobookInstance?.reader}">
				<li class="fieldcontain">
					<span id="reader-label" class="property-label"><g:message code="audiobook.reader.label" default="Reader" /></span>
					
						<span class="property-value" aria-labelledby="reader-label"><g:fieldValue bean="${audiobookInstance}" field="reader"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${audiobookInstance?.time}">
				<li class="fieldcontain">
					<span id="time-label" class="property-label"><g:message code="audiobook.time.label" default="Time" /></span>
					
						<span class="property-value" aria-labelledby="time-label"><g:fieldValue bean="${audiobookInstance}" field="time"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${audiobookInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="audiobook.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${audiobookInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${audiobookInstance?.id}" />
					<g:link class="edit" action="edit" id="${audiobookInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
