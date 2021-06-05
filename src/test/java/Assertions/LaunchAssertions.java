package Assertions;

import models.Launch;
import org.junit.Assert;

public class LaunchAssertions {
    public void verifyResponse(Launch launch){
        Assert.assertEquals(launch.getLinks().getPatch().getSmall(),"https://imgur.com/o6zaoex.png");
        Assert.assertTrue(launch.getLinks().getReddit().getCampaign().startsWith("https://www.reddit.com/r/spacex/comments"));
        Assert.assertEquals(launch.getLinks().getFlickr().getOriginal().length,0);
        Assert.assertEquals(launch.getShips().length,3);
        Assert.assertEquals(launch.getLinks().getWebcast(),"https://youtu.be/QXf9mRWbXDM");
        Assert.assertEquals(launch.getLinks().getYoutube_id(),"QXf9mRWbXDM");
        Assert.assertEquals(launch.getLinks().getWikipedia(),"https://en.wikipedia.org/wiki/SpaceX_CRS-22");
    }
}
