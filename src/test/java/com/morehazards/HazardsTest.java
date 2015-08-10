package com.morehazards;

import com.framework.BaseTest;
import com.pages.hazards.MainPage;
import org.junit.Test;

public class HazardsTest extends BaseTest {

    private MainPage mainPage;

    @Test
    public void testMusic() throws Exception {

        driver.get("http://morehazards.com/");

        mainPage = new MainPage(driver).get();

        mainPage.play();

        Thread.sleep(30000);

        mainPage.pause();
        mainPage.next();

        Thread.sleep(15000);

    }


}

