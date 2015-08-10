package com.framework;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static  WebDriver driver;
    static int timeout = 30;

    public WebDriver loadFireFoxDriver(WebDriver driver) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        return driver;
    }

    public WebDriver loadChromeDriver(WebDriver driver) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        return driver;
    }

    public WebDriver loadiOSDriver(WebDriver driver) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.2");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("browserName", "Safari");
//        capabilities.setCapability("app",
//                "/Users/dconaway/Library/Developer/Xcode/DerivedData/demo2-cxcmjamuquwydjboermzfpoxuaco/Build"
//                        + "/Products/Debug-iphonesimulator/Demo2.app");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        return driver;
    }


}
