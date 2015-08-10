package com.pages.hazards;

import com.framework.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.junit.Assert.assertEquals;

public class MainPage extends LoadableComponent<MainPage> {
    private WebDriver driver;

    @FindBy(css = ".jp-play")
    @Description()
    private WebElement play;

    @FindBy(css = ".jp-pause")
    @Description()
    private WebElement pause;

    @FindBy(css = ".jp-next")
    @Description()
    private WebElement next;

    public MainPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void play() {
        play.click();
    }

    public void pause() {
        pause.click();
    }

    public void next() {
        next.click();
    }

    protected void load() {}

    protected void isLoaded() throws Error {
        assertEquals("Page content not loaded", 1, driver.findElements(By.id("home")).size());
    }
}
