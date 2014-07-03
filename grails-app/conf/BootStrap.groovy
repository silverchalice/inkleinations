import com.inkleinations.*

class BootStrap {

    def init = { servletContext ->

        if(!Section.findByName("events"){
            new Section(name:"events", html:"""<h3><a style="text-decoration:underline;" href="mailto:daveanddebklein@yahoo.com?Subject=Reasons%20For%20Hope%20event%20at%20Family%20Vision%20Library">Register for Reasons For Hope event at Family Vision Library</a> (September 12&#8211;13)</h3>""").save(failOnError:true)
        }
        if(!User.findByUsername('adminiii')){
            def adminRole = Role.findByAuthority('ROLE_ADMIN')
            def adminUser2 = new User(username: 'adminiii', enabled: true, accountExpired: false, accountLocked: false, passwordExpired: false, password: 'password071985')
            adminUser2.save(flush: true, failOnError:true)

            UserRole.create adminUser2, adminRole, true
        }

        if(!Section.findByName("subheader")){
            def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true, failOnError:true)
            def adminUser = new User(username: 'admini', enabled: true, accountExpired: false, accountLocked: false, passwordExpired: false, password: 'password')
            adminUser.save(flush: true, failOnError:true)

            UserRole.create adminUser, adminRole, true

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
            new Section(name:"link1image", html:"dscn1377.jpg").save(failOnError:true)
            new Section(name:"link2image", html:"BIBLE-copy.jpg").save(failOnError:true)
            new Section(name:"link3image", html:"map-anciently.jpg").save(failOnError:true)
            new Section(name:"link1text", html:"""
<h2>&#8220;Seek ye first&#8221; homeschooling</h2> <p>We have tried to make the study of God’s Word the focus of our children’s education. It is the most important thing they can learn, so it is the thing they spend most of their study time on.</p>
""").save(failOnError:true)
            new Section(name:"link2text", html:"""
                    <a href="/about-us"><h2>Copying the Bible</h2>
                    <p>Copying the Bible produces two copies: a copy in the book and a copy in the heart.</p></a>
""").save(failOnError:true)
            new Section(name:"link3text", html:"""
<h2>Missionary books</h2> <p>We find missionary stories to be about the most profitable reading outside the Bible. There is much to be gained by the example of those who attempted to seek first the kingdom of God (Matt 6:33).</p>
""").save(failOnError:true)
            new Section(name:"footer1text", html:"""
            <a href="/about-us"><h2>About us</h2>
            <p>&#8220;Not that we are sufficient of ourselves to think any thing as of ourselves; but our sufficiency is of God&#8230;&#8221;
            </p></a>
""").save(failOnError:true)
            new Section(name:"footer2text", html:"""
            <h2>Fellowship schedule</h2>
                        <p>We travel frequently, and love to take the opportunity to meet other families at our destinations or along the way.  If we are in your area or passing through, let us know! Email</p>
            <ul class="list-style2">
                <li class="first">March:   Chicago, Washington DC</li>
                <li>April:  Dallas, San Jose</li>
                <li>May:  Wisconsin</li>
                <li>June:</li>
                <li>July:</li>
                <li>August:  (tentatively) Oregon</li>
                <li>September:  (tentatively) Portland</li>
                <li>October:   (tentatively) Atlanta; Las Vegas</li>
                <li>November:  (tentatively) Dublin, OH</li>
                <li>December:  </li>
            </ul>
""").save(failOnError:true) 
            new Section(name:"footer3text", html:"""
            <h2>FAQs</h2>

            <ul class="list-style2">
                <li class="first"><a href="/faq#work">&#8220;Isn&#8217;t it a lot of work?&#8221;</a></li>
                <li><a href="/faq#good">&#8220;Your children are so good! Do they always get along?&#8221;</a></li>
                <li><a href="/faq#rich">&#8220;Are you rich?&#8221;</a></li>
                <li><a href="/faq#break">&#8220;Don&#8217;t you ever want a break?&#8221;</a></li>
                <li><a href="/faq#homeschool">&#8220;And you homeschool, too?!&#8221;</a></li>
            </ul>
""").save(failOnError:true)
            new Section(name:"footer4text", html:"""
<p>copyright © 2013 inKLEINations | site by <a href="http://silver-chalice.com">Silver Chalice</a> | <a href="http://www.freecsstemplates.org/preview/enchanting/">original design</a> by <a href="http://www.freecsstemplates.org">FCT</a> | <a href="/login">log in</a></p>
""").save(failOnError:true)
            new Section(name:"family", html:"""
<div class="post">
                <h2 class="title">About Us</h2>
                <div class="entry">
                    <p>Hi, we&#8217;re Dave and Debbie Klein and family. We were married in 1985 and planned on being your average American family, a nice house, two cars, 2.5 kids. Normal. But then we realized from God&#8217;s Word, the Bible, that there was a lot more to life than that.  That we, just like you, were created for a purpose.  In order to fulfill that purpose, we needed to let God take the lead in our lives.  So far, that has led to 14 dearly loved children, a school bus in the driveway, and an average wait for the bathroom of just under 17 minutes.</p>
                    <p>But children are a gift from God, a blessing, and not a burden.  We never expected to have 14, but the Lord hasn&#8217;t given us one yet that we wanted to send back. &#9786;</p>
                    <p>We have been blessed with 8 boys and 6 girls.  Being a larger than average family, we often get asked certain questions.  We&#8217;d like to answer a few of them in advance here.</p>
                    <br />
                    <div style="width:590px; margin-left:auto; margin-right: auto;">
                    <table border="0">
                        <tr>
                            <td>No, we are not Mormons.</td>
                            <td style="padding-left:40px;">Yes, they are all ours.</td>
                        </tr>
                        <tr>
                            <td>No, we are not Catholics.</td>
                            <td style="padding-left:40px;">Yes, we have a big house.</td>
                        </tr>
                        <tr>
                            <td>No, we are not Amish or Mennonite.</td>
                            <td style="padding-left:40px;">Yes, we teach our children at home.</td>
                        </tr>
                        <tr>
                            <td>No, no twins or adoptions.</td>
                            <td style="padding-left:40px;">Yes, we&#8217;re rich (just not in money).</td>
                        </tr>
                        <tr>
                            <td>No, we don&#8217;t have a TV show.</td>
                            <td style="padding-left:40px;">No, we&#8217;re not crazy.</td>
                        </tr>
                    </table><br />
                    </div>
                    <br />
                    <p>Well, that last one is kind of a subjective thing, isn&#8217;t it?</p>
                    <p>Actually, there is a lot of subjectivity going on in this world.  Where are the absolutes?  We see them when water freezes or the birds fly south, but in human life, are there any absolutes?  Is there any plan for people, just like there is for penguins?  Some say &#8220;Absolutely not!&#8221;  But that is kind of subjective, too, isn&#8217;t it?</p>
                    <p>God&#8217;s design for the family is perfect, and even though we&#8217;re not a perfect family (not even close), we do have a perfect God who will help us and as we follow Him and His Word, we can begin to fulfill the purpose we were created for.  We&#8217;re counting on it!</p>
                    <p>More about this in a minute, but first we&#8217;d like to introduce you to our gang.  This may take a few minutes, so you may want to sit down.</p>
                    <br />
                    <p><img src="/images/family/zak.png" height="70" width="70" style="float:left;margin-right:10px;" />Zak, our oldest, loves kids, has his own software consulting firm, has been known to convert school buses to RVs, enjoys serving others, and frets without fretting.</p>
                    <br />
                    <p><img src="/images/family/abi.png" height="90" width="70" style="float:right;margin-left:10px;" />Abi, our oldest daughter, loves kids, helps in menu planning, and enjoys graphic arts, sewing, writing, video editing, Spanish translation, piano and arranging music.</p>
                    <br />
                    <p><img src="/images/family/ben.png" height="73" width="70" style="float:left;margin-right:10px;" /> Ben loves kids, also works in the consulting firm, writes a news column in a software journal, makes great photos, and can sometimes be convinced to play harmonica in public.</p>
                    <br />
                    <p><img src="/images/family/sarah.png" height="83" width="70" style="float:right;margin-left:10px;" />Sarah loves kids, likes figuring out new things, is studying Swahili and ASL, and is a fledgling soap-maker.  She helps us stay organized, which is a huge job, and she can find things.  Very important.</p>
                    <br />
                    <p><img src="/images/family/solomon.png" height="75" width="70" style="float:left;margin-right:10px;" /> Solomon loves kids.  He is our chief mechanic and consumer of ketchup.  Firewood and squirrels fear him.  He plays and sings bass, enjoys photography and is studying programming. He can talk while inhaling.</p>
                    <br />
                    <p><img src="/images/family/hannah.png" height="81" width="70" style="float:right;margin-left:10px;" /> Hannah loves kids, writes poetry, enjoys piano, sings loudly and speaks quietly.  She is diligent in the kitchen and loves sewing, cooking, and having people not write about her.</p>
                    <br />
                    <p><img src="/images/family/joanna.png" height="83" width="70" style="float:left;margin-right:10px;" />Joanna loves kids, is very outgoing, enjoys singing, is learning Mandarin, and can play two recorders at the same time.  She makes magnificent muffins and can crochet a replica of just about any carbon-based life form.</p>
                    <br />
                    <p><img src="/images/family/bekah.png" height="84" width="70" style="float:right;margin-left:10px;" />Rebekah loves kids, enjoys singing and piano and mimicking loved ones, crochets very capably, and has good sentence construction skills.  She can clean a bathroom in under 30 minutes, accompanied by a 4 year old.</p>
                    <br />
                    <p><img src="/images/family/suby.png" height="79" width="70" style="float:left;margin-right:10px;" />Susanna loves kids and is a popular sibling due to her generosity in serving grated cheese.  She is known to be quiet and loud, at different times.  She enjoys drawing, paper crafting, crochet, and photography.</p>
                    <br />
                    <p><img src="/images/family/noah.png" height="89" width="70" style="float:right;margin-left:10px;" />Noah loves kids.  He has his own toolbox, in which he keeps tools, parts of broken objects, old keys, old padlocks and possibly lots of Chapstick.  We&#8217;re not sure; it&#8217;s locked. He is a helper and enjoys accessing problems and suggesting solutions.</p>
                    <br />
                    <p><img src="/images/family/sammy.png" height="78" width="70" style="float:left;margin-right:10px;" />Sammy loves kids and tries to patiently wait for a turn to hold the baby.  He has a toolbox, but it&#8217;s not locked.  He enjoys reading, working in the garage, and dismantling flashlights, but cannot yet be trusted with grated cheese.</p>
                    <br />
                    <p><img src="/images/family/giddy.png" height="84" width="70" style="float:right;margin-left:10px;" />Gideon loves kids.  He crochets, and has been known to say, &#8220;That&#8217;s pretty good for a boy my age.&#8221; He keeps many of his personal possessions on his person.  This sometimes leads to a visit from the washing machine repair person.  Evidently he needs to use his toolbox more often.</p>
                    <br />
                    <p><img src="/images/family/joshie.png" height="81" width="70" style="float:left;margin-right:10px;" />Joshua loves kids, of course.  He is a chief reason Noah keeps his toolbox locked.  He enjoys going on errands with Zak, listening to a sister tell him stories, and being rocked and sang to.</p>
                    <br />
                    <p><img src="/images/family/daniel.png" height="66" width="70" style="float:right;margin-left:10px;" />Daniel is very loved and may be one of the most photographed babies in modern history.  His dimples can be spotted in satellite photos.</p>
                    <br /><br />
                    <p>Our family works together each day, and we also operate a family business, which has been an adventure.</p>
                    <p>Trees in the fall don&#8217;t deliberate about changing color, do they?  Caterpillars don&#8217;t opt out of making a cocoon.  You don&#8217;t hear of the disintegration of the porcupine family unit.  God has laid out intricate plans for all of life.  But He didn&#8217;t stop that plan with people.  However, He did give people a choice, whether or not to follow His plan for their lives.</p>
                    <p>We look around and notice that some people make pretty bad choices, choices that affect others, sometimes for the worse.  The Bible calls that sin, and it doesn&#8217;t just affect ourselves and others, but actually causes God&#8217;s condemnation.  There really is evil in this world, and if we were each honest with ourselves, we would admit that we are a part of it.  We have 14 children, and we have never had to teach them to sin.  The root of Cain&#8217;s sin in killing his brother is at work in every human heart.  And we are in big trouble because of it.</p>
                    <p>We are all guaranteed to face death. &#8220;It is appointed unto men once to die, but after this the judgment&#8221; (Hebrews 9:27).  None of us want to be judged, but we probably wouldn&#8217;t mind a few (or many) others we know being judged.  We have a sense of right and wrong.  Our sense of right and wrong is often subjective, but there is a perfect Judge.  We have not followed his plan for life, in fact, we have rejected it.   We know good we should do and yet don&#8217;t do it.   We do things we wish we could forget.  One day, we will each be judged.</p>
                    <p>God is love, and God is just.  His love provided away for us to escape judgment.His own Son took our place when He died on the cross.  In speaking of His death, Jesus said, &#8220;Greater love hath no man than this, that a man lay down his life for his friends. Ye are my friends, if ye do whatsoever I command you.&#8221; John 15:13</p>
                    <p>We couldn&#8217;t possibly tell you everything we would like to about our need for a savior and God&#8217;s gift of salvation, about God&#8217;s wonderful provision and help in every situation, or about our hope of His coming again, but we can and do encourage you to read it for yourself, in the Bible.  God is not far off, nor hard to find. &#8220;Faith comes by hearing and hearing by the Word of God&#8221; Romans 10:17</p>
                    <p>&nbsp;</p>
                    <p id="sig">Dave and Debbie Klein</p>
                    <p>October, 2012<br />
                    St. Louis, Missouri <span style="float:right;">daveanddebklein@yahoo.com</span</p>
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
            new Section(name:"faq", html:"""
<div class="post">
                <h2 class="title">Frequently asked questions</h2>
                <div class="entry">
                    <a name="work"></a>
                    <br />
                    <h3>&#8220;Isn't it a lot of work?&#8221;</h3><br />
                    <p>Yes, we have a lot to do as a family of 16. However, we have changed a lot since were first married. We have learned that laziness and leisure are not really the best for us. But even more, children truly are blessings. We don't feel we are babysitting everyday; these little people are our treasures. God has used them, and the demands of parenting, to help us see our need for the Lord's strength. We are not perfect parents. God is still working in our lives and never gives up on us, even though we are very unworthy! &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="good"></a>
                    <h3>&#8220;Your children are so good! Do they always get along?&#8221;</h3><br />
                    <p>Our children are normal children and we are normal people. The Bible says that normal people are sinners by nature.</p>
                    <p>One investment we have had to make is discipline. Our children are born desiring their own way, and we have to lovingly and patiently train them that their obedience is required. It is hard work! Rather than giving in to their every wish, spoiling them, trying to "keep them quiet" or "keep them out of our hair," we must choose to love them by training them in the way they should go. It is not loving our children to indulge them, to teach them that in order to be happy, they must have their way. This only leads to selfish, unhappy adulthood!</p>
                    <p>We love our children unconditionally, but we understand that they have the same tendency to be self-seeking as we do. One major purpose of our outings (shopping, etc.) is to teach and practice loving one another as ourselves. We sure need the practice!</p>
                    <p>We don't believe that perfect parenting produces perfect children. Rather, our goal in parenting is to show our children that they need the Lord in order to live a life pleasing to Him. Jesus called this being "born again." &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="rich"></a>
                    <h3>&#8220;Are you rich?&#8221;</h3><br />
                    <p>God has always provided for our family. He has miraculously given Dave a career which usually requires a college degree, though he has none. Supporting a family our size does take money, but God has always provided what we needed when we needed it.</p>
                    <p>In our early years of marriage, when we just had ourselves to spend on, we were terrible in handling our money. We always ran out, and had nothing to show for it!</p>
                    <p>Jesus said to not lay up for ourselves treasures on earth, where moth and rust destroy and thieves break in and steal. He said to lay up for ourselves treasures in heaven. Our true riches are our children, and they are the only things we can take with us to heaven. It is our prayer that they will each put their faith in Christ our Savior. Our main financial goal has always been that Debbie would stay home with our children. By eliminating a lot of other non-necessities, we have found a lot of ways to help with this goal! &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="break"></a>
                    <h3>&#8220;Don&#8217;t you ever want a break?&#8221;</h3><br />
                    <p>Truthfully, no. We get tired; we get stressed; we get discouraged sometimes. We have to choose to believe what God has said about children over what we feel in our selfish hearts! We see so much that the Lord wants to do in our family and are thankful for what He has already done. We have so much hope in God's promises for us and our children.</p>
                    <p>And we see that we are not perfect parents! We haven't done everything perfectly. When we have challenges with our children, it's not usually too hard to see where we have slacked off in following the directions in the Bible.</p>
                    <p>Maybe you could say we've been "re-programmed." We believe children (even handicapped, retarded, or "unwanted" children) are a blessing from God. They are His creation. Children are not the problem, but our society's attitude towards them often can be. For example, we are repulsed by public school programs where students are given an electronic "baby" which must be held and fed when the alarm goes off.to show young adults how their lives will be weighed down by a child! Such an experience can only contribute to a terrible attitude towards parenthood.</p>
                    <p>By following God's plan, including loving, prompt and attentive discipline and parental instruction based on God's Word, we spare ourselves so many unnecessary struggles with our children. Parenting is hard work, but it is a privilege and well worth it. &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="homeschool"></a>
                    <h3>&#8220;And you homeschool, too?!&#8221;</h3><br />
                    <p>Parenting requires that we prepare our children for life. School is one part of that preparation. It is not the only thing, nor is it necessarily the most important thing.</p>
                    <p>What we mean by "homeschool" may not be the common perception of homeschool. It is not a school in our home. Traditional schools are set up for the convenience of school staff handling huge numbers of children. They are not set up that way because it is the best way to educate a child.</p>
                    <p>We simply include our children in our daily life. We use various tools to equip them, spiritually and academically. We teach them parenting skills (using live children!!), home making, technical things, whatever we feel the Lord would have them learn to serve Him. We want them to learn that work is something God provides for us, and doing what God wants is not drudgery. We want them to see real life and share in the lives of people God has put in their lives. We want to teach them that the purpose of life is not leisure and play.</p>
                    <p>Homeschooling allows us as parents to be the primary influence over our children, and we feel that is very important, given our directions in the Bible. Truly, our example is their biggest teacher, and that is a very intimidating fact! Our daily involvement, we feel, is really the only way to carry out our job descriptions as given in the Bible. &nbsp; <a href="#footer">Return</a></p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"missionary", html:"""
<div class="post">
                <h2 class="title">Missionary books</h2>
                <div class="entry">
                    <a name="work"></a>
                    <br />
                    <h3>&#8220;Isn't it a lot of work?&#8221;</h3><br />
                    <p>Yes, we have a lot to do as a family of 16. However, we have changed a lot since were first married. We have learned that laziness and leisure are not really the best for us. But even more, children truly are blessings. We don't feel we are babysitting everyday; these little people are our treasures. God has used them, and the demands of parenting, to help us see our need for the Lord's strength. We are not perfect parents. God is still working in our lives and never gives up on us, even though we are very unworthy! &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="good"></a>
                    <h3>&#8220;Your children are so good! Do they always get along?&#8221;</h3><br />
                    <p>Our children are normal children and we are normal people. The Bible says that normal people are sinners by nature.</p>
                    <p>One investment we have had to make is discipline. Our children are born desiring their own way, and we have to lovingly and patiently train them that their obedience is required. It is hard work! Rather than giving in to their every wish, spoiling them, trying to "keep them quiet" or "keep them out of our hair," we must choose to love them by training them in the way they should go. It is not loving our children to indulge them, to teach them that in order to be happy, they must have their way. This only leads to selfish, unhappy adulthood!</p>
                    <p>We love our children unconditionally, but we understand that they have the same tendency to be self-seeking as we do. One major purpose of our outings (shopping, etc.) is to teach and practice loving one another as ourselves. We sure need the practice!</p>
                    <p>We don't believe that perfect parenting produces perfect children. Rather, our goal in parenting is to show our children that they need the Lord in order to live a life pleasing to Him. Jesus called this being "born again." &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="rich"></a>
                    <h3>&#8220;Are you rich?&#8221;</h3><br />
                    <p>God has always provided for our family. He has miraculously given Dave a career which usually requires a college degree, though he has none. Supporting a family our size does take money, but God has always provided what we needed when we needed it.</p>
                    <p>In our early years of marriage, when we just had ourselves to spend on, we were terrible in handling our money. We always ran out, and had nothing to show for it!</p>
                    <p>Jesus said to not lay up for ourselves treasures on earth, where moth and rust destroy and thieves break in and steal. He said to lay up for ourselves treasures in heaven. Our true riches are our children, and they are the only things we can take with us to heaven. It is our prayer that they will each put their faith in Christ our Savior. Our main financial goal has always been that Debbie would stay home with our children. By eliminating a lot of other non-necessities, we have found a lot of ways to help with this goal! &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="break"></a>
                    <h3>&#8220;Don&#8217;t you ever want a break?&#8221;</h3><br />
                    <p>Truthfully, no. We get tired; we get stressed; we get discouraged sometimes. We have to choose to believe what God has said about children over what we feel in our selfish hearts! We see so much that the Lord wants to do in our family and are thankful for what He has already done. We have so much hope in God's promises for us and our children.</p>
                    <p>And we see that we are not perfect parents! We haven't done everything perfectly. When we have challenges with our children, it's not usually too hard to see where we have slacked off in following the directions in the Bible.</p>
                    <p>Maybe you could say we've been "re-programmed." We believe children (even handicapped, retarded, or "unwanted" children) are a blessing from God. They are His creation. Children are not the problem, but our society's attitude towards them often can be. For example, we are repulsed by public school programs where students are given an electronic "baby" which must be held and fed when the alarm goes off.to show young adults how their lives will be weighed down by a child! Such an experience can only contribute to a terrible attitude towards parenthood.</p>
                    <p>By following God's plan, including loving, prompt and attentive discipline and parental instruction based on God's Word, we spare ourselves so many unnecessary struggles with our children. Parenting is hard work, but it is a privilege and well worth it. &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="homeschool"></a>
                    <h3>&#8220;And you homeschool, too?!&#8221;</h3><br />
                    <p>Parenting requires that we prepare our children for life. School is one part of that preparation. It is not the only thing, nor is it necessarily the most important thing.</p>
                    <p>What we mean by "homeschool" may not be the common perception of homeschool. It is not a school in our home. Traditional schools are set up for the convenience of school staff handling huge numbers of children. They are not set up that way because it is the best way to educate a child.</p>
                    <p>We simply include our children in our daily life. We use various tools to equip them, spiritually and academically. We teach them parenting skills (using live children!!), home making, technical things, whatever we feel the Lord would have them learn to serve Him. We want them to learn that work is something God provides for us, and doing what God wants is not drudgery. We want them to see real life and share in the lives of people God has put in their lives. We want to teach them that the purpose of life is not leisure and play.</p>
                    <p>Homeschooling allows us as parents to be the primary influence over our children, and we feel that is very important, given our directions in the Bible. Truly, our example is their biggest teacher, and that is a very intimidating fact! Our daily involvement, we feel, is really the only way to carry out our job descriptions as given in the Bible. &nbsp; <a href="#footer">Return</a></p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"bible", html:"""
<div class="post">
                <h2 class="title">Bible copy</h2>
                <div class="entry">
                    <a name="work"></a>
                    <br />
                    <h3>&#8220;Isn't it a lot of work?&#8221;</h3><br />
                    <p>Yes, we have a lot to do as a family of 16. However, we have changed a lot since were first married. We have learned that laziness and leisure are not really the best for us. But even more, children truly are blessings. We don't feel we are babysitting everyday; these little people are our treasures. God has used them, and the demands of parenting, to help us see our need for the Lord's strength. We are not perfect parents. God is still working in our lives and never gives up on us, even though we are very unworthy! &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="good"></a>
                    <h3>&#8220;Your children are so good! Do they always get along?&#8221;</h3><br />
                    <p>Our children are normal children and we are normal people. The Bible says that normal people are sinners by nature.</p>
                    <p>One investment we have had to make is discipline. Our children are born desiring their own way, and we have to lovingly and patiently train them that their obedience is required. It is hard work! Rather than giving in to their every wish, spoiling them, trying to "keep them quiet" or "keep them out of our hair," we must choose to love them by training them in the way they should go. It is not loving our children to indulge them, to teach them that in order to be happy, they must have their way. This only leads to selfish, unhappy adulthood!</p>
                    <p>We love our children unconditionally, but we understand that they have the same tendency to be self-seeking as we do. One major purpose of our outings (shopping, etc.) is to teach and practice loving one another as ourselves. We sure need the practice!</p>
                    <p>We don't believe that perfect parenting produces perfect children. Rather, our goal in parenting is to show our children that they need the Lord in order to live a life pleasing to Him. Jesus called this being "born again." &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="rich"></a>
                    <h3>&#8220;Are you rich?&#8221;</h3><br />
                    <p>God has always provided for our family. He has miraculously given Dave a career which usually requires a college degree, though he has none. Supporting a family our size does take money, but God has always provided what we needed when we needed it.</p>
                    <p>In our early years of marriage, when we just had ourselves to spend on, we were terrible in handling our money. We always ran out, and had nothing to show for it!</p>
                    <p>Jesus said to not lay up for ourselves treasures on earth, where moth and rust destroy and thieves break in and steal. He said to lay up for ourselves treasures in heaven. Our true riches are our children, and they are the only things we can take with us to heaven. It is our prayer that they will each put their faith in Christ our Savior. Our main financial goal has always been that Debbie would stay home with our children. By eliminating a lot of other non-necessities, we have found a lot of ways to help with this goal! &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="break"></a>
                    <h3>&#8220;Don&#8217;t you ever want a break?&#8221;</h3><br />
                    <p>Truthfully, no. We get tired; we get stressed; we get discouraged sometimes. We have to choose to believe what God has said about children over what we feel in our selfish hearts! We see so much that the Lord wants to do in our family and are thankful for what He has already done. We have so much hope in God's promises for us and our children.</p>
                    <p>And we see that we are not perfect parents! We haven't done everything perfectly. When we have challenges with our children, it's not usually too hard to see where we have slacked off in following the directions in the Bible.</p>
                    <p>Maybe you could say we've been "re-programmed." We believe children (even handicapped, retarded, or "unwanted" children) are a blessing from God. They are His creation. Children are not the problem, but our society's attitude towards them often can be. For example, we are repulsed by public school programs where students are given an electronic "baby" which must be held and fed when the alarm goes off.to show young adults how their lives will be weighed down by a child! Such an experience can only contribute to a terrible attitude towards parenthood.</p>
                    <p>By following God's plan, including loving, prompt and attentive discipline and parental instruction based on God's Word, we spare ourselves so many unnecessary struggles with our children. Parenting is hard work, but it is a privilege and well worth it. &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="homeschool"></a>
                    <h3>&#8220;And you homeschool, too?!&#8221;</h3><br />
                    <p>Parenting requires that we prepare our children for life. School is one part of that preparation. It is not the only thing, nor is it necessarily the most important thing.</p>
                    <p>What we mean by "homeschool" may not be the common perception of homeschool. It is not a school in our home. Traditional schools are set up for the convenience of school staff handling huge numbers of children. They are not set up that way because it is the best way to educate a child.</p>
                    <p>We simply include our children in our daily life. We use various tools to equip them, spiritually and academically. We teach them parenting skills (using live children!!), home making, technical things, whatever we feel the Lord would have them learn to serve Him. We want them to learn that work is something God provides for us, and doing what God wants is not drudgery. We want them to see real life and share in the lives of people God has put in their lives. We want to teach them that the purpose of life is not leisure and play.</p>
                    <p>Homeschooling allows us as parents to be the primary influence over our children, and we feel that is very important, given our directions in the Bible. Truly, our example is their biggest teacher, and that is a very intimidating fact! Our daily involvement, we feel, is really the only way to carry out our job descriptions as given in the Bible. &nbsp; <a href="#footer">Return</a></p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"first", html:"""
<div class="post">
                <h2 class="title">&#8220;Seek ye first&#8221; homeschooling</h2>
                <div class="entry">
                    <a name="work"></a>
                    <br />
                    <h3>&#8220;Isn't it a lot of work?&#8221;</h3><br />
                    <p>Yes, we have a lot to do as a family of 16. However, we have changed a lot since were first married. We have learned that laziness and leisure are not really the best for us. But even more, children truly are blessings. We don't feel we are babysitting everyday; these little people are our treasures. God has used them, and the demands of parenting, to help us see our need for the Lord's strength. We are not perfect parents. God is still working in our lives and never gives up on us, even though we are very unworthy! &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="good"></a>
                    <h3>&#8220;Your children are so good! Do they always get along?&#8221;</h3><br />
                    <p>Our children are normal children and we are normal people. The Bible says that normal people are sinners by nature.</p>
                    <p>One investment we have had to make is discipline. Our children are born desiring their own way, and we have to lovingly and patiently train them that their obedience is required. It is hard work! Rather than giving in to their every wish, spoiling them, trying to "keep them quiet" or "keep them out of our hair," we must choose to love them by training them in the way they should go. It is not loving our children to indulge them, to teach them that in order to be happy, they must have their way. This only leads to selfish, unhappy adulthood!</p>
                    <p>We love our children unconditionally, but we understand that they have the same tendency to be self-seeking as we do. One major purpose of our outings (shopping, etc.) is to teach and practice loving one another as ourselves. We sure need the practice!</p>
                    <p>We don't believe that perfect parenting produces perfect children. Rather, our goal in parenting is to show our children that they need the Lord in order to live a life pleasing to Him. Jesus called this being "born again." &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="rich"></a>
                    <h3>&#8220;Are you rich?&#8221;</h3><br />
                    <p>God has always provided for our family. He has miraculously given Dave a career which usually requires a college degree, though he has none. Supporting a family our size does take money, but God has always provided what we needed when we needed it.</p>
                    <p>In our early years of marriage, when we just had ourselves to spend on, we were terrible in handling our money. We always ran out, and had nothing to show for it!</p>
                    <p>Jesus said to not lay up for ourselves treasures on earth, where moth and rust destroy and thieves break in and steal. He said to lay up for ourselves treasures in heaven. Our true riches are our children, and they are the only things we can take with us to heaven. It is our prayer that they will each put their faith in Christ our Savior. Our main financial goal has always been that Debbie would stay home with our children. By eliminating a lot of other non-necessities, we have found a lot of ways to help with this goal! &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="break"></a>
                    <h3>&#8220;Don&#8217;t you ever want a break?&#8221;</h3><br />
                    <p>Truthfully, no. We get tired; we get stressed; we get discouraged sometimes. We have to choose to believe what God has said about children over what we feel in our selfish hearts! We see so much that the Lord wants to do in our family and are thankful for what He has already done. We have so much hope in God's promises for us and our children.</p>
                    <p>And we see that we are not perfect parents! We haven't done everything perfectly. When we have challenges with our children, it's not usually too hard to see where we have slacked off in following the directions in the Bible.</p>
                    <p>Maybe you could say we've been "re-programmed." We believe children (even handicapped, retarded, or "unwanted" children) are a blessing from God. They are His creation. Children are not the problem, but our society's attitude towards them often can be. For example, we are repulsed by public school programs where students are given an electronic "baby" which must be held and fed when the alarm goes off.to show young adults how their lives will be weighed down by a child! Such an experience can only contribute to a terrible attitude towards parenthood.</p>
                    <p>By following God's plan, including loving, prompt and attentive discipline and parental instruction based on God's Word, we spare ourselves so many unnecessary struggles with our children. Parenting is hard work, but it is a privilege and well worth it. &nbsp; <a href="#footer">Return</a></p><br />
                    <a name="homeschool"></a>
                    <h3>&#8220;And you homeschool, too?!&#8221;</h3><br />
                    <p>Parenting requires that we prepare our children for life. School is one part of that preparation. It is not the only thing, nor is it necessarily the most important thing.</p>
                    <p>What we mean by "homeschool" may not be the common perception of homeschool. It is not a school in our home. Traditional schools are set up for the convenience of school staff handling huge numbers of children. They are not set up that way because it is the best way to educate a child.</p>
                    <p>We simply include our children in our daily life. We use various tools to equip them, spiritually and academically. We teach them parenting skills (using live children!!), home making, technical things, whatever we feel the Lord would have them learn to serve Him. We want them to learn that work is something God provides for us, and doing what God wants is not drudgery. We want them to see real life and share in the lives of people God has put in their lives. We want to teach them that the purpose of life is not leisure and play.</p>
                    <p>Homeschooling allows us as parents to be the primary influence over our children, and we feel that is very important, given our directions in the Bible. Truly, our example is their biggest teacher, and that is a very intimidating fact! Our daily involvement, we feel, is really the only way to carry out our job descriptions as given in the Bible. &nbsp; <a href="#footer">Return</a></p>
                </div>
            </div>
""").save(failOnError:true)
            new Section(name:"sessions", html:"""
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
