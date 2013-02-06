
<%@ page import="com.inkleinations.Publication" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'publication.label', default: 'Publication')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-publication" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-publication" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list publication">
			
				<g:if test="${publicationInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="publication.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${publicationInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publicationInstance?.author}">
				<li class="fieldcontain">
					<span id="author-label" class="property-label"><g:message code="publication.author.label" default="Author" /></span>
					
						<span class="property-value" aria-labelledby="author-label"><g:fieldValue bean="${publicationInstance}" field="author"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publicationInstance?.imageName}">
				<li class="fieldcontain">
					<span id="imageName-label" class="property-label"><g:message code="publication.imageName.label" default="Image Name" /></span>
					
						<span class="property-value" aria-labelledby="imageName-label"><g:fieldValue bean="${publicationInstance}" field="imageName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publicationInstance?.pages}">
				<li class="fieldcontain">
					<span id="pages-label" class="property-label"><g:message code="publication.pages.label" default="Pages" /></span>
					
						<span class="property-value" aria-labelledby="pages-label"><g:fieldValue bean="${publicationInstance}" field="pages"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publicationInstance?.pdfName}">
				<li class="fieldcontain">
					<span id="pdfName-label" class="property-label"><g:message code="publication.pdfName.label" default="Pdf Name" /></span>
					
						<span class="property-value" aria-labelledby="pdfName-label"><g:fieldValue bean="${publicationInstance}" field="pdfName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publicationInstance?.priority}">
				<li class="fieldcontain">
					<span id="priority-label" class="property-label"><g:message code="publication.priority.label" default="Priority" /></span>
					
						<span class="property-value" aria-labelledby="priority-label"><g:fieldValue bean="${publicationInstance}" field="priority"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${publicationInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="publication.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${publicationInstance}" field="title"/></span>
					
				</li>
				</g:if>

				<g:if test="${publicationInstance?.tags}">
				<li class="fieldcontain">
					<span id="tags-label" class="property-label"><g:message code="publication.tags.label" default="Tags" /></span>
					
						<span class="property-value" aria-labelledby="tags-label"><g:fieldValue bean="${publicationInstance}" field="tags"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${publicationInstance?.id}" />
					<g:link class="edit" action="edit" id="${publicationInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
