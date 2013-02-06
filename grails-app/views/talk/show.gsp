
<%@ page import="com.inkleinations.Talk" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'talk.label', default: 'Talk')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-talk" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-talk" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list talk">
			
				<g:if test="${talkInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="talk.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${talkInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${talkInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="talk.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${talkInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${talkInstance?.talkName}">
				<li class="fieldcontain">
					<span id="talkName-label" class="property-label"><g:message code="talk.talkName.label" default="Talk Name" /></span>
					
						<span class="property-value" aria-labelledby="talkName-label"><g:fieldValue bean="${talkInstance}" field="talkName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${talkInstance?.time}">
				<li class="fieldcontain">
					<span id="time-label" class="property-label"><g:message code="talk.time.label" default="Time" /></span>
					
						<span class="property-value" aria-labelledby="time-label"><g:fieldValue bean="${talkInstance}" field="time"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${talkInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="talk.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${talkInstance}" field="title"/></span>
					
				</li>
				</g:if>

				<g:if test="${talkInstance?.tags}">
				<li class="fieldcontain">
					<span id="tags-label" class="property-label"><g:message code="talk.tags.label" default="Tags" /></span>
					
						<span class="property-value" aria-labelledby="tags-label"><g:fieldValue bean="${talkInstance}" field="tags"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${talkInstance?.id}" />
					<g:link class="edit" action="edit" id="${talkInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
