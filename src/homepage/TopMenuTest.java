package homepage;

import browseraction.BrowserAction;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BrowserAction
{

    String baseurl = "https://mobile.x-cart.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseurl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException
    {
        Thread.sleep(5000);
        clickOnElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]"));

        String expectedMessage = "Shipping";
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Wrong Text match....", expectedMessage, actualMessage);
        closeBrowser();
    }

   /*@Test
    public void UserShouldNavigateToNewPageSuccessfully() throws InterruptedException
    {
        Thread.sleep(5000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]"));

        String expectedMessage1 = "New arrivals";
        String actualMessage1 = getTextFromElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/h1[1]"));
        Assert.assertEquals("Wrong Text match....", expectedMessage1, actualMessage1);
        closeBrowser();
    }*/

    @Test
    public void UserShouldNavigateToComingsoonPageSuccessfully() throws InterruptedException
    {
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
    }

    @Test
    public void UserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException
    {
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]"));
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }


}
