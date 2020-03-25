package Tests;

import org.junit.Test;

public class UsingGoogleHomePage extends BaseTest
{
    @Test
    public void test1()
    {
        home.gotoWebpage();
        home.typeInSearchbar();
        home.clickSearchButton();
        results.clickResult();
        park.closeAnnoyingPopUp();
        park.clickRandomEpisode();
        park.watchEpisode();
    }
}
