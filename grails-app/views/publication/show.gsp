<%@ page import="org.apache.commons.lang.WordUtils" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="public"/>
		<title>inKLEINations: Publishing</title>
    </head>
    <body>
      <div class="post">
        <g:link controller="publication" action="publishing">&#171; Publishing</g:link>
        <p>&nbsp;</p>
        <h2 class="title">${publicationInstance.title}</h2>
      </div>
        <g:if test="message">
            <p><i>${message}</i></p>
            <br />
        </g:if>
            <table>
                    <tr class="pub">
                        <td>
                            <g:if test="${publicationInstance.pdfName}"><a href="${publicationInstance.pdfName}"><img height="269" width="180" border="0" src="${publicationInstance.imageName}" class="thumbnail"></a></g:if>
                            <g:else><img height="269" width="180" border="0" src="${publicationInstance.imageName}" class="thumbnail"></g:else>
                        </td>
                        <td><p><a href="${publicationInstance.pdfName}"><strong>${publicationInstance.title}</strong></a> <br /> <small>${publicationInstance.author}</small><br /></p>
                            <br />
                            ${publicationInstance.pages} ${publicationInstance.pages > 1 ? "pages" : "page"}.<g:if test="${publicationInstance.pdfName}"> <a href="${publicationInstance.pdfName}"><button>Download</button></a></g:if><g:else> <g:link controller="home" action="contact" params="['subject':publicationInstance.title]"><button>Request copy</button></g:link></g:else></p>
                            <p>Tags: <g:each in="${publicationInstance.tags}" var="tag" status="i"><g:link controller='publication' action='publishing' params='[tag: "${tag}"]'>${tag}</g:link>${i == (publicationInstance.tags.size() - 1) ? '' : ', '}</g:each></p>
                            <p>
                        </td>
                    </tr>
            </table>
            <g:if test="${publicationInstance.pdfName}">
              <p><strong>To download this publication as a PDF, right-click the image above and select &#8220;Save Link As&#8230;&#8221; or &#8220;Save Target As&#8230;&#8221;.</strong></p>
            </g:if>
            <g:else>
              <p><strong>We can not currently offer this publication in PDF form. Please <g:link controller="home" action="contact" params="['subject':publicationInstance.title]">contact us</g:link> to request a paper copy.</strong></p>
            </g:else>
            <br />
            
            <g:if test="${publicationInstance.body}">
              ${publicationInstance.body}
            </g:if>
            <g:else>
              <p>${publicationInstance.description}</p>
            </g:else>
    </body>
</html>
