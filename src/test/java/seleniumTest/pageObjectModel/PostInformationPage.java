package seleniumTest.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PostInformationPage {
    WebDriver driver;
    public PostInformationPage(WebDriver driver){
        this.driver = driver;
    }
    private  By sellOption = By.xpath(".//input[@id='listingType-1']");
    private By rentOption = By.xpath(".//input[@id='listingType-2']");
    private By sellApartmentOption = By.xpath(".//input[@id='propertyType-8']");
    private By sellHomeOption = By.xpath(".//input[@id='propertyType-11']");
    private By sellGroundOption = By.xpath(".//input[@id='propertyType-13']");
    private By rentApartmentOption = By.xpath(".//input[@id='propertyType-1']");
    private By rentHomeOption = By.xpath(".//input[@id='propertyType-2']");
    public void clickSellOption(){

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(sellOption);
        actions.moveToElement(element).click().perform();
    }
    public void clickRentOption(){

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(rentOption);
        actions.moveToElement(element).click().perform();
    }
    public WebElement getSellApartmentOption(){
        return driver.findElement(sellApartmentOption);
    }
    public WebElement getSellHomeOption(){
        return driver.findElement(sellHomeOption);
    }
    public WebElement getSellGroundOption(){
        return driver.findElement(sellGroundOption);
    }
    public WebElement getRentApartmentOption(){
        return driver.findElement(rentApartmentOption);
    }
    public WebElement getRentHomeOption(){
        return driver.findElement(rentHomeOption);
    }
}
