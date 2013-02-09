<!doctype html>
<html>
	<head>
		<meta name="layout" content="public"/>
		<title>inKLEINations: Contact</title>
    </head>
    <body>
        <section:content for="contact" />
        <br />
        <g:if test="msg">
            <p><i>${msg}</i></p>
            <br />
        </g:if>
        <g:form method="post" name="contact" controller="home" action="contact">
            <p>
                Subject: &nbsp;
                <select name="subject" id="subject" style="width: 530px;">
                    <option value="A question" ${(subject == '' || subject == 'A question') ? 'selected=""' : ''}>Question</option>
                    <option value="A request for media" ${subject == 'A request for media' ? 'selected=""' : ''}>Request media</option>
                    <option value="A testimony" ${subject == 'A testimony' ? 'selected=""' : ''}>Testimony</option>
                    <option value="A request to join the mailing list" ${subject == 'A request to join the mailing list' ? 'selected=""' : ''}>Join our mailing list</option>
                    <option value="A question about your hair" ${subject == 'A question about your hair' ? 'selected=""' : ''}>Who does your hair?</option>
                </select>&nbsp;
            </p>
            <br />
            <p>
                Your email address: &nbsp;
                <input type="text" name="email" id="email" style="width: 435px;" value="${email}" />
            </p>
            <br />
            <p>Your message:</p>
            <textarea name="message" style="width:600px; height:300px;">${message}</textarea><br />
            <br />
            <p>
                ${firstValue} + ${secondValue} is: &nbsp;
                <input type="text" name="answer" id="answer" style="width: 527px;" />
                <input type="hidden" name="firstValue" id="firstValue" value="${firstValue}" />
                <input type="hidden" name="secondValue" id="secondValue" value="${secondValue}" />
            </p>
            <p><g:actionSubmit controller="home" action="contact" value="Send email" /></p>
        </g:form>
        <p>&nbsp;</p>
    </body>
</html>
