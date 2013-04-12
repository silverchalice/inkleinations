<%@ page import="com.inkleinations.Publication" %>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="publication.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${publicationInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'author', 'error')} ">
	<label for="author">
		<g:message code="publication.author.label" default="Author" />
		
	</label>
	<g:textField name="author" value="${publicationInstance?.author}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="publication.description.label" default="Description" />
		
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="50000" value="${publicationInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'body', 'error')} ">
	<label for="body">
		<g:message code="publication.body.label" default="Body" />
		
	</label>
	<g:textArea name="body" cols="40" rows="5" maxlength="5000000000000000000000000000000000000" value="${publicationInstance?.body}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'pages', 'error')} required">
	<label for="pages">
		<g:message code="publication.pages.label" default="Pages" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="pages" required="" value="${publicationInstance.pages}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'pdfName', 'error')} ">
	<label for="pdfName">
		<g:message code="publication.pdfName.label" default="PDF" />
		
	</label>
    <input type="file" id="pdf" name="pdf" />
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'imageName', 'error')} ">
	<label for="imageName">
		<g:message code="publication.imageName.label" default="Image" />
		
	</label>
    <input type="file" id="image" name="image" />
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'priority', 'error')} required">
	<label for="priority">
		<g:message code="publication.priority.label" default="Priority" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="priority" required="" value="${publicationInstance.priority}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'tags', 'error')} required">
	<label for="tags">
		<g:message code="publication.tags.label" default="Tags" />
	</label>
	<g:textField name="tags" value="${publicationTags ?: ''}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: publicationInstance, field: 'slug', 'error')} ">
	<label for="slug">
		<g:message code="publication.slug.label" default="Slug" />
		
	</label>
	<g:textField name="slug" value="${publicationInstance?.slug}"/>
</div>

