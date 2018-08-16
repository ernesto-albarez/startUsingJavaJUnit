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
        //assertTrue(driver.getTitle().startsWith("Selenium Ximplified")); //Test Fails
    }

    @Test
    public void firefoxIsSupportedByWebDriver(){
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.compendiumdev.co.uk/selenium");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
    }
}
