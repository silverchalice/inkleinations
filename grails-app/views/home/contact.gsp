<!doctype html>
<html>
	<head>
		<meta name="layout" content="public"/>
		<title>inKLEINations: Contact</title>
    </head>
    <body>
        <section:content for="contact" />
        <br />
        <g:if test="message">
            <p><i>${message}</i></p>
            <br />
        </g:if>
        <g:form method="post" name="contact" controller="home" action="contact">
            <p>
                Subject: &nbsp;
                <select name="subject" id="subject" style="width: 530px;">
                    <option value="A question" selected="">Question</option>
                    <option value="A request for media">Request media</option>
                    <option value="A testimony">Testimony</option>
                    <option value="A request to join the mailing list">Join our mailing list</option>
                    <option value="A question about your hair">Who does your hair?</option>
                </select>&nbsp;
            </p>
            <br />
            <p>
                Your email address: &nbsp;
                <input type="text" name="email" id="email" style="width: 435px;" />
            </p>
            <br />
            <p>Your message:</p>
            <textarea name="message" style="width:600px; height:300px;"></textarea><br />
            <br />
            <p><g:actionSubmit controller="home" action="contact" value="Send email" /></p>
        </g:form>
        <p>&nbsp;</p>
    </body>
</html>
