package com.javafortesters.junit;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static junit.framework.Assert.assertTrue;

public class FirstTest {

    @Test
    public void driverIsTheKing(){
        WebDriver driver = new  HtmlUnitDriver(); //Headless browser
        driver.get("http://www.compendiumdev.co.uk/selenium");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified")); //Test Pass
        //assertTrue(driver.getTitle().startsWith("Random Text")); //Test Fails
    }

    @Test
    public void firefoxIsSupportedByWebDriver(){
        //if you didn't update the Path system variable to add the full directory path to the executable
        //then doing this directly through code:
        System.setProperty("webdriver.firefox.marionette", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.compendiumdev.co.uk/selenium");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
    }
}
