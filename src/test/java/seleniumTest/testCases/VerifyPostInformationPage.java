package seleniumTest.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumCore.drivers.DriverManager;
import seleniumCore.drivers.DriverManagerFactory;
import seleniumCore.drivers.DriverType;
import seleniumTest.pageObjectModel.PostInformationPage;

public class VerifyPostInformationPage {
    WebDriver driver;
    DriverManager driverManager;
    PostInformationPage postInformationPage;

    @BeforeMethod
    public void setUp(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://propzy.vn/dang-tin");
        driver.manage().window().maximize();
        postInformationPage = new PostInformationPage(driver);

    }
    @Test (description = "Verify there are 3 type of properties when sell Option is selected")
    public void verifyTypeOfPropertySellOption(){
        postInformationPage.clickSellOption();
        Assert.assertNotNull(postInformationPage.getSellApartmentOption());
        Assert.assertNotNull(postInformationPage.getSellHomeOption());
        Assert.assertNotNull(postInformationPage.getSellGroundOption());
    }
    @Test (description = "Verify there are 2 type of properties when sell Option is selected")
    public void verifyTypeOfPropertyRentOption(){
        postInformationPage.clickRentOption();
        Assert.assertNotNull(postInformationPage.getRentApartmentOption());
        Assert.assertNotNull(postInformationPage.getRentHomeOption());
    }
    @AfterMethod
    public void tearDown(){
        driverManager.quitWebDriver();
    }

}
