<%@ page import="com.inkleinations.Song" %>


<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="song.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${songInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="song.description.label" default="Description" />
		
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="50000" value="${songInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'songName', 'error')} ">
	<label for="songName">
		<g:message code="song.songName.label" default="File" />
		
	</label>
    <input type="file" id="song" name="song" />
</div>

<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'time', 'error')} ">
	<label for="time">
		<g:message code="song.time.label" default="Time" />
		
	</label>
	<g:textField name="time" value="${songInstance?.time}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: songInstance, field: 'tags', 'error')} required">
	<label for="tags">
		<g:message code="song.tags.label" default="Tags" />
	</label>
	<g:textField name="tags" value="${songTags ?: ''}"/>
</div>

