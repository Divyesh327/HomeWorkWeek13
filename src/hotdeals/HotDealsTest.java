package hotdeals;

import browseraction.BrowserAction;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HotDealsTest extends BrowserAction
{

    String baseurl = "https://mobile.x-cart.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseurl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically()
    {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        clickOnElement(By.xpath("//a[text()='Sale']"));
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickOnElement(By.linkText("Name A - Z"));
    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh()
    {

        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        clickOnElement(By.xpath("//a[text()='Sale']"));
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickOnElement(By.linkText("Price Low - High"));

    }
    @Test
    public void verifySaleProductsArrangeByRates()
    {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        clickOnElement(By.xpath("//a[text()='Sale']"));
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickOnElement(By.partialLinkText("Rates"));
    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA()
    {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        clickOnElement(By.xpath("//a[text()='Sale']"));
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickOnElement(By.linkText("Name Z - A"));
    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow()
    {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        clickOnElement(By.xpath("//a[text()='Sale']"));
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickOnElement(By.linkText("Price High - Low"));
    }
    @Test
    public void verifySaleProductArrangeByRates()
    {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        clickOnElement(By.xpath("//a[text()='Sale']"));
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickOnElement(By.partialLinkText("Rates"));
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }


}
