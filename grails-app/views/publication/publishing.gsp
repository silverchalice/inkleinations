<%@ page import="org.apache.commons.lang.WordUtils" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="public"/>
		<title>inKLEINations: Publishing</title>
    </head>
    <body>
        <section:content for="publishing" />
        <br />
        <g:if test="message">
            <p><i>${message}</i></p>
            <br />
        </g:if>
        <g:form name="tagged" controller="publication" action="publishing">
            Display: &nbsp;
            <select name="tag" id="tag" style="width: 480px;">
                <option value="" ${!currentTag ? 'selected=""' : ''}>All</option>
                <g:each in="${currentlyUsedTags}" var="tag">
                    <option value="${tag}" ${currentTag == tag.toString() ? 'selected=""' : ''}>${org.apache.commons.lang.WordUtils.capitalizeFully(tag?.toString())}</option>
                </g:each>
            </select>&nbsp;
            <g:actionSubmit controller="publication" action="publishing" value="Select" />
        </g:form>
        <p>&nbsp;</p>
        <g:if test="${publicationInstanceList}">
            <table>
                <g:each in="${publicationInstanceList}" var="publicationInstance">
                    <tr class="pub">
                        <td>
                            <a href="${publicationInstance.pdfName}"><img height="269" width="180" border="0" src="${publicationInstance.imageName}" class="thumbnail"></a>
                        </td>
                        <td><p><a href="${publicationInstance.pdfName}"><strong>${publicationInstance.title}</strong></a> <br /> <small>${publicationInstance.author}</small><br /></p>
                            ${publicationInstance.description}<br />
                            <br />
                            ${publicationInstance.pages} ${publicationInstance.pages > 1 ? "pages" : "page"}.</p>
                            <p>Tags: <g:each in="${publicationInstance.tags}" var="tag" status="i"><g:link controller='publication' action='publishing' params='[tag: "${tag}"]'>${tag}</g:link>${i == (publicationInstance.tags.size() - 1) ? '' : ', '}</g:each></p>
                        </td>
                    </tr>
                </g:each>
            </table>
        </g:if>
    </body>
</html>
