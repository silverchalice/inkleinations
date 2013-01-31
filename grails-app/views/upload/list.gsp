
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'file.label', default: 'File')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-section" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-section" class="content scaffold-list" role="main">
			<h1>Images</h1>
			<g:if test="${flash.message}">
            <br />
			<div class="message" role="status">${flash.message}</div>
			</g:if>

             <p>&nbsp;</p>
			 <g:form method="post"  enctype="multipart/form-data">
	                <div class="dialog">
	                    <table>
	                        <tbody>
	                            <tr class="prop">
	                                <td valign="top" class="name">
	                                    <label for="fileUpload">Upload:</label>
	                                </td>
	                                <td valign="top" class="value ${hasErrors(bean:fileResourceInstance,field:'upload','errors')}">
	                                    <input type="file" id="fileUpload" name="fileUpload" />
	                                </td>
	                            </tr> 
	                        </tbody>
	                    </table>
	                </div>
	                <div class="buttons">
	                    <span class="button"><g:actionSubmit class="upload" value="Upload" action="upload" /></span>
	                </div>
	            </g:form>
                <p>&nbsp;</p>
            
			<table>
				<thead>
					<tr>
					
						<th>File (bold = in use)</th>
					
						<th>Thumbnail</th>

						<th>Path</th>

						<th>Actions</th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${fileResourceInstanceList}" status="i" var="fileResourceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td>
                            <g:if test="${fileResourceInstance.used}">
                                <strong>${fileResourceInstance.name.decodeURL()}</strong>
                            </g:if>
                            <g:else>
                                ${fileResourceInstance.name.decodeURL()}
                            </g:else>
                        </td>

                        <td><img src="${resource(dir:'images/family', file: fileResourceInstance.name.decodeURL())}" height="50" width="50" alt="" /></td> 
					
						<td><input type="text" value="/images/family/${fileResourceInstance.name.decodeURL()}" /></td>

                        <td><a href="${resource(dir:'images/family', file: fileResourceInstance.name.decodeURL(), absolute: true)}" target="_blank">View</a> | <g:if test="${fileResourceInstance.used}"> Delete </g:if> <g:else> <g:link action="delete" id="${fileResourceInstance.name.replace('.', '###')}" onclick="return confirm('Are you sure?');">Delete</g:link></g:else></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
		</div>
	</body>
</html>
