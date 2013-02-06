<%@ page import="com.inkleinations.Talk" %>



<div class="fieldcontain ${hasErrors(bean: talkInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="talk.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${talkInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: talkInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="talk.name.label" default="By" />
		
	</label>
	<g:textField name="name" value="${talkInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: talkInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="talk.description.label" default="Description" />
		
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="50000" value="${talkInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: talkInstance, field: 'talkName', 'error')} ">
	<label for="talkName">
		<g:message code="talk.talkName.label" default="File" />
		
	</label>
    <input type="file" id="talk" name="talk" />
</div>

<div class="fieldcontain ${hasErrors(bean: talkInstance, field: 'time', 'error')} ">
	<label for="time">
		<g:message code="talkInstance.time.label" default="Time" />
		
	</label>
	<g:textField name="time" value="${talkInstance?.time}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: talkInstance, field: 'priority', 'error')} required">
	<label for="priority">
		<g:message code="talkInstance.priority.label" default="Priority" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="priority" required="" value="${talkInstance.priority}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: talkInstance, field: 'tags', 'error')} required">
	<label for="tags">
		<g:message code="talk.tags.label" default="Tags" />
	</label>
	<g:textField name="tags" value="${talkTags ?: ''}"/>
</div>


