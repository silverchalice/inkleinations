<%@ page import="com.inkleinations.Audiobook" %>

<div class="fieldcontain ${hasErrors(bean: audiobookInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="audiobook.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${audiobookInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: audiobookInstance, field: 'author', 'error')} ">
	<label for="author">
		<g:message code="audiobook.author.label" default="Author" />
		
	</label>
	<g:textField name="author" value="${audiobookInstance?.author}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: audiobookInstance, field: 'reader', 'error')} ">
	<label for="reader">
		<g:message code="audiobook.reader.label" default="Reader" />
		
	</label>
	<g:textField name="reader" value="${audiobookInstance?.reader}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: audiobookInstance, field: 'time', 'error')} ">
	<label for="time">
		<g:message code="audiobook.time.label" default="Time" />
		
	</label>
	<g:textField name="time" value="${audiobookInstance?.time}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: audiobookInstance, field: 'bookName', 'error')} ">
	<label for="bookName">
		<g:message code="audiobook.bookName.label" default="File" />
		
	</label>
    <input type="file" id="audiobook" name="audiobook" />
</div>

<div class="fieldcontain ${hasErrors(bean: audiobookInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="audiobook.description.label" default="Description" />
		
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="50000" value="${audiobookInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: audiobookInstance, field: 'priority', 'error')} required">
	<label for="priority">
		<g:message code="audiobook.priority.label" default="Priority" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="priority" required="" value="${audiobookInstance.priority}"/>
</div>

