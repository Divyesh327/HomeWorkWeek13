package shopping;

import browseraction.BrowserAction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


public class ShoppingTest extends BrowserAction
{
            String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test

    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException
    {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        clickOnElement(By.xpath("//a[text()='Sale']"));

        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickOnElement(By.linkText("Name A - Z"));

        Thread.sleep(100);
        mouseHoverToElement(By.xpath("//a[text()='Cup of Mojo Bluetooth Speaker']"));
        clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-31']"));
        clickOnElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

        driver.findElement(By.cssSelector("#amount31")).clear();
        sendTextToElement(By.cssSelector("#amount31"),  "2");
        Thread.sleep(5000);

        Thread.sleep(5000);

        clickOnElement(By.xpath("//span[contains(text(),'Go to checkout')]"));


        sendTextToElement(By.xpath("//input[@id='email']"), "div@gmail.com");
        clickOnElement(By.xpath("//tbody/tr[2]/td[1]/button[1]"));

        sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"),  "Div");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"),  "Son");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"),  "Morland Gardens");
        driver.findElement(By.xpath("//input[@id='shippingaddress-city']")).clear();
        Thread.sleep(5000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-city']"),  "London");
        selectByValueFromDropDown(By.xpath("//select[@id='shippingaddress-country-code']"),  "GB");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"),  "Hanwell");
        driver.findElement(By.xpath("//input[@id='shippingaddress-zipcode']")).clear();
        Thread.sleep(5000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"),  "UB1 3DY");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-phone']"),  "0578458545");
        clickOnElement(By.xpath("//input[@id='create_profile']"));
        sendTextToElement(By.xpath("//input[@id='password']"),  "abcdef@1234");
        Thread.sleep(5000);
        clickOnElement(By.cssSelector("#method128"));
        Thread.sleep(5000);
        clickOnElement(By.cssSelector("#pmethod6"));

        clickOnElement(By.xpath("//span[contains(text(),'Place order: $47.22')]"));
        Thread.sleep(100);
    }

    @Test
    public void  verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        clickOnElement(By.linkText("Bestsellers"));

        mouseHoverToElement(By.xpath("//span[contains(text(),'Sales ')]"));
        clickOnElement(By.linkText("Name A - Z"));

        mouseHoverToElement(By.xpath("//a[text()='Vinyl Idolz: Ghostbusters']"));
        clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']"));
        Thread.sleep(500);
        clickOnElement(By.xpath("//div[@id='status-messages']/a"));
        clickOnElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);


    }

    @After
    public void close_Browser()
    {
        super.closeBrowser();
    }
}

