<!doctype html>
<html>
	<head>
		<meta name="layout" content="public"/>
		<title>inKLEINations: Missionary books</title>
    </head>
    <body>
        <section:content for="missionary" />
        <g:if test="${audiobookInstanceList}">
            <h4>Audiobooks</h4>
            <g:each in="${audiobookInstanceList}" var="audiobook">
                <p><strong><a href="${resource(dir:'audio', file:audiobook.bookName)}">${audiobook.title}</a></strong></p>
                <p><i>${audiobook.title}</i>, by ${audiobook.author}. Read by ${audiobook.reader}. (${audiobook.time})${audiobook.description ? '<br />' + audiobook.description : ''} </p>
                <br />
            </g:each>
        </g:if>
        <g:if test="${talkInstanceList}">
            <h4>Conference talks</h4>
            <g:each in="${talkInstanceList}" var="talk">
                <p><strong><a href="${resource(dir:'audio', file:talk.talkName)}">${talk.title}</a></strong> (${talk.name})</p>
                <p>${talk.description} (${talk.time})</p>
                <br />
            </g:each>
        </g:if>
        <g:if test="${songInstanceList}">
            <h4>Music</h4>
            <g:each in="${songInstanceList}" var="song">
                <p><strong><a href="${resource(dir:'audio', file:song.songName)}">${song.title}</a></strong></p>
                <p>${song.description} (${song.time})</p>
                <br />
            </g:each>
        </g:if>
        <g:if test="${publicationInstanceList}">
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
        </g:if>
    </body>
</html>
