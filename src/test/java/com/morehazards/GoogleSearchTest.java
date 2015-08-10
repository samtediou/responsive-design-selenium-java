package com.morehazards;

import com.framework.BaseTest;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class GoogleSearchTest extends BaseTest {
    protected static WebDriver driver;
    private static final String URL = "https://www.google.com";

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void DesktopChromeTest() throws MalformedURLException {
        driver = loadChromeDriver(driver);
        driver.get(URL);
    }

    @Test
    public void MobileiOSSafariTest() throws MalformedURLException{
        driver = loadiOSDriver(driver);
        driver.get(URL);
    }



}
