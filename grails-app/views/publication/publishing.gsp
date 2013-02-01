<!doctype html>
<html>
	<head>
		<meta name="layout" content="public"/>
		<title>inKLEINations: Publishing</title>
    </head>
    <body>
        <section:content for="publishing" />
        <br />
        <table>
            <g:each in="${publicationInstanceList}" var="publicationInstance">
                <tr class="pub">
                    <td>
                        <a href="${resource(dir:'pdf', file: publicationInstance.pdfName)}"><img height="269" width="180" border="0" src="${resource(dir:'images/covers', file: publicationInstance.imageName)}" class="thumbnail"></a>
                    </td>
                    <td><p><a href="${resource(dir:'pdf', file: publicationInstance.pdfName)}"><strong>${publicationInstance.title}</strong></a></p>
                        ${publicationInstance.description}<br />
                        <br />
                        ${publicationInstance.pages} ${publicationInstance.pages > 1 ? "pages" : "page"}.
                    </td>
                </tr>
            </g:each>
        </table>
    </body>
</html>
