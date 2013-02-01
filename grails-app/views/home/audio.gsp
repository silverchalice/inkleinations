<!doctype html>
<html>
	<head>
		<meta name="layout" content="public"/>
		<title>inKLEINations: Audio</title>
    </head>
    <body>
        <section:content for="audiointro" />
        <section:content for="audiobooks" />
        <g:each in="${audiobookInstanceList}" var="audiobook">
            <p><strong><a href="${resource(dir:'audio', file:audiobook.bookName)}">${audiobook.title}</a></strong></p>
            <p><i>${audiobook.title}</i>, by ${audiobook.author}. Read by ${audiobook.reader}. (${audiobook.time})${audiobook.description ? '<br />' + audiobook.description : ''} </p>
            <br />
        </g:each>
        <section:content for="talks" />
        <g:each in="${talkInstanceList}" var="talk">
            <p><strong><a href="${resource(dir:'audio', file:talk.talkName)}">${talk.title}</a></strong> (${talk.name})</p>
            <p>${talk.description} (${talk.time})</p>
            <br />
        </g:each>
        <section:content for="songs" />
        <g:each in="${songInstanceList}" var="song">
            <p><strong><a href="${resource(dir:'audio', file:song.songName)}">${song.title}</a></strong></p>
            <p>${song.description} (${song.time})</p>
            <br />
        </g:each>
    </body>
</html>
