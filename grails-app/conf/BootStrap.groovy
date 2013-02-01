import com.inkleinations.*

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true, failOnError:true)

        def adminUser = new User(username: 'admini', enabled: true, accountExpired: false, accountLocked: false, passwordExpired: false, password: 'password')
        adminUser.save(flush: true, failOnError:true)

        UserRole.create adminUser, adminRole, true

        if(!Section.findByName("subheader")){
            new Section(name:"header", html:"inKLEINations").save(failOnError:true)
            new Section(name:"subheader", html:"Encouraging families to &#8220;seek first the kingdom of God&#8230;&#8221;").save(failOnError:true)
            new Section(name:"welcome", html:"""
<div class="post">
                <h2 class="title">Welcome to inKLEINations!</h2>
                <div class="entry">
                    <blockquote>
                        <p><strong>Q:</strong> What has 32 arms, has 32 legs, and uses <em>way</em> too much bathroom tissue?</p>
                        <p><strong>A:</strong> The Klein family!</p>
                    </blockquote><br />
                    <p>Welcome to our site!  It is all about encouraging Christian families to seek the Lord's guidance and to persevere!  We pray that you will be blessed by your time here.</p>
                    <p>The materials we offer are free.  Some are things we have produced, but many are things that others have produced which have been a blessing to us.  Our hope is that it will all just point you to our perfect source of wisdom and encouragement:  God's Word!</p>
                    <p>A goal for our family is to seek to apply Matthew 6:33 to all areas of life!  &#8220;But seek ye first the kingdom of God, and his righteousness; and all these things shall be added unto you.&#8221;  We are so encouraged to hear the testimonies of others who are likewise inclined!  Feel free to share your story with us at daveanddebklein@yahoo.com.</p>
                    <p>In Christ,</p>
                    <p id="sig">The Kleins of St Louis</p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"headerimage", html:"DSC_0059-2-rect.png").save(failOnError:true)
            new Section(name:"sidebar1image", html:"IMG_9351.png").save(failOnError:true)
            new Section(name:"sidebar2image", html:"DSC_1341.png").save(failOnError:true)
            new Section(name:"sidebar3image", html:"DSC_0082.jpeg").save(failOnError:true)
            new Section(name:"sidebar4image", html:"DSC_2056.jpeg").save(failOnError:true)
            new Section(name:"sidebar5image", html:"DSC_0239.png").save(failOnError:true)
            new Section(name:"sidebar6image", html:"0171.JPG").save(failOnError:true)
            new Section(name:"sidebar7image", html:"DSC_1057.JPG").save(failOnError:true)
            new Section(name:"sidebar8image", html:"DSC_0672.JPG").save(failOnError:true)
            new Section(name:"sidebar9image", html:"DSC_0366.png").save(failOnError:true)
            new Section(name:"sidebar10image", html:"IMG_0101.png").save(failOnError:true)
            new Section(name:"sidebar11image", html:"photo-5-4.jpeg").save(failOnError:true)
            new Section(name:"sidebar12image", html:"DSC_0154.JPG").save(failOnError:true)
            new Section(name:"link1image", html:"img07.jpg").save(failOnError:true)
            new Section(name:"link2image", html:"img08.jpg").save(failOnError:true)
            new Section(name:"link3image", html:"img09.jpg").save(failOnError:true)
            new Section(name:"link1text", html:"""
					<h2>Copying the Bible</h2>
					<p>Aliquam erat volutpat. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh. </p>
""").save(failOnError:true)
            new Section(name:"link2text", html:"""
					<h2>&#8220;Seek ye first&#8221; homeschooling</h2>
					<p>Aliquam erat volutpat. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh. </p>
""").save(failOnError:true)
            new Section(name:"link3text", html:"""
					<h2>Missionary books</h2>
					<p>Aliquam erat volutpat. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh.</p>
""").save(failOnError:true)
            new Section(name:"footer1text", html:"""
			<h2>About us</h2>
			<p>In posuere eleifend odio quisque semper augue mattis wisi maecenas ligula. Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum. Quisque dictum integer nisl risus, sagittis convallis, rutrum id, congue, and nibh. Pellentesque tristique ante ut risus. Quisque dictum. Integer nisl risus, sagittis convallis, rutrum id, elementum congue, nibh. Suspendisse dictum porta lectus.<br />
			</p>
""").save(failOnError:true)
            new Section(name:"footer2text", html:"""
			<h2>Fellowship schedule</h2>
			<ul class="list-style2">
				<li class="first"><a href="#">Pellentesque quis elit non lectus gravida blandit.</a></li>
				<li><a href="#">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</a></li>
				<li><a href="#">Phasellus nec erat sit amet nibh pellentesque congue.</a></li>
				<li><a href="#">Cras vitae metus aliquam risus pellentesque pharetra.</a></li>
				<li><a href="#">Maecenas vitae orci vitae tellus feugiat eleifend.</a></li>
			</ul>
""").save(failOnError:true) 
            new Section(name:"footer3text", html:"""
			<h2>FAQs</h2>
			<ul class="list-style2">
				<li class="first"><a href="#">Pellentesque quis elit non lectus gravida blandit.</a></li>
				<li><a href="#">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</a></li>
				<li><a href="#">Phasellus nec erat sit amet nibh pellentesque congue.</a></li>
				<li><a href="#">Cras vitae metus aliquam risus pellentesque pharetra.</a></li>
				<li><a href="#">Maecenas vitae orci vitae tellus feugiat eleifend.</a></li>
			</ul>
""").save(failOnError:true)
            new Section(name:"footer4text", html:"""
	<p>© 2012 Untitled Inc. All rights reserved. Lorem ipsum dolor sit amet nullam blandit consequat phasellus etiam lorem. Design by <a href="http://www.freecsstemplates.org">FCT</a>.  Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
""").save(failOnError:true)
            new Section(name:"family", html:"""
<div class="post">
                <h2 class="title">About Us</h2>
                <div class="entry">
                    <blockquote>
                        <p><strong>Q:</strong> What has 32 arms, has 32 legs, and uses <em>way</em> too much bathroom tissue?</p>
                        <p><strong>A:</strong> The Klein family!</p>
                    </blockquote><br />
                    <p>Welcome to our site!  It is all about encouraging Christian families to seek the Lord's guidance and to persevere!  We pray that you will be blessed by your time here.</p>
                    <p>The materials we offer are free.  Some are things we have produced, but many are things that others have produced which have been a blessing to us.  Our hope is that it will all just point you to our perfect source of wisdom and encouragement:  God's Word!</p>
                    <p>A goal for our family is to seek to apply Matthew 6:33 to all areas of life!  &#8220;But seek ye first the kingdom of God, and his righteousness; and all these things shall be added unto you.&#8221;  We are so encouraged to hear the testimonies of others who are likewise inclined!  Feel free to share your story with us at daveanddebklein@yahoo.com.</p>
                    <p>In Christ,</p>
                    <p id="sig">The Kleins of St Louis</p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"contact", html:"""
<div class="post">
                <h2 class="title">Welcome to inKLEINations!</h2>
                <div class="entry">
                    <blockquote>
                        <p><strong>Q:</strong> What has 32 arms, has 32 legs, and uses <em>way</em> too much bathroom tissue?</p>
                        <p><strong>A:</strong> The Klein family!</p>
                    </blockquote><br />
                    <p>Welcome to our site!  It is all about encouraging Christian families to seek the Lord's guidance and to persevere!  We pray that you will be blessed by your time here.</p>
                    <p>The materials we offer are free.  Some are things we have produced, but many are things that others have produced which have been a blessing to us.  Our hope is that it will all just point you to our perfect source of wisdom and encouragement:  God's Word!</p>
                    <p>A goal for our family is to seek to apply Matthew 6:33 to all areas of life!  &#8220;But seek ye first the kingdom of God, and his righteousness; and all these things shall be added unto you.&#8221;  We are so encouraged to hear the testimonies of others who are likewise inclined!  Feel free to share your story with us at daveanddebklein@yahoo.com.</p>
                    <p>In Christ,</p>
                    <p id="sig">The Kleins of St Louis</p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"publishing", html:"""
<div class="post">
                <h2 class="title">Publishing</h2>
                <div class="entry">
                    <p>These publications are all free of charge and available here in PDF format. Please <a href="http://inkleinations.com/contact">contact us</a> to obtain printed copies of any of these publications.</p>
                    <p><strong>To download these onto your computer, right-click and select &quot;Save Link As&quot; or &quot;Save Target As...&quot;</strong></p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"audiointro", html:"""
<div class="post">
                <h2 class="title">Audio</h2>
                <div class="entry">
                    <p>To open these files in your browser, click on the links. To download to your computer, right-click the links and choose 'Save Link As' or 'Save Target As'.</p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"audiobooks", html:"""
<br />
<h3>Audiobooks</h3>
<p>&nbsp;</p>
""").save(failOnError:true)
            new Section(name:"talks", html:"""
<br />
<h3>Conference talks</h3>
<p>&nbsp;</p>
""").save(failOnError:true)
            new Section(name:"songs", html:"""
<br />
<h3>Music</h3>
<p>&nbsp;</p>
""").save(failOnError:true)
            new Section(name:"links", html:"""
<div class="post">
                <h2 class="title">Welcome to inKLEINations!</h2>
                <div class="entry">
                    <blockquote>
                        <p><strong>Q:</strong> What has 32 arms, has 32 legs, and uses <em>way</em> too much bathroom tissue?</p>
                        <p><strong>A:</strong> The Klein family!</p>
                    </blockquote><br />
                    <p>Welcome to our site!  It is all about encouraging Christian families to seek the Lord's guidance and to persevere!  We pray that you will be blessed by your time here.</p>
                    <p>The materials we offer are free.  Some are things we have produced, but many are things that others have produced which have been a blessing to us.  Our hope is that it will all just point you to our perfect source of wisdom and encouragement:  God's Word!</p>
                    <p>A goal for our family is to seek to apply Matthew 6:33 to all areas of life!  &#8220;But seek ye first the kingdom of God, and his righteousness; and all these things shall be added unto you.&#8221;  We are so encouraged to hear the testimonies of others who are likewise inclined!  Feel free to share your story with us at daveanddebklein@yahoo.com.</p>
                    <p>In Christ,</p>
                    <p id="sig">The Kleins of St Louis</p>
                </div>
            </div>
""").save(failOnError:true)
        }
    }
    def destroy = {
    }
}
