<%@ page import="com.inkleinations.Section" %>

<style type="text/css">
    textarea {
        width: 856px;
        height: 450px;
        font-size: 14px;
        font-family: "Monaco", "Courier New", Courier, monospace;
    }
</style> 

<div class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="section.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" readonly="" value="${sectionInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'html', 'error')} ">
	<label for="html">
		<g:message code="section.html.label" default="Html" />
		
	</label>
	<g:textArea name="html" value="${sectionInstance?.html}" rows="5" cols="40"/>
</div>

