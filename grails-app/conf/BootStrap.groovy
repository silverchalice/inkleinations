import com.inkleinations.*

class BootStrap {

    def init = { servletContext ->
        if(!Section.findByName("subheader")){
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
        }
    }
    def destroy = {
    }
}
