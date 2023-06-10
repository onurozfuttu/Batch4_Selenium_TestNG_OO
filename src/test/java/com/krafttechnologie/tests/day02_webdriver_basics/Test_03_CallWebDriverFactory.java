package com.krafttechnologie.tests.day02_webdriver_basics;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Test_03_CallWebDriverFactory {
    public static void main(String[] args) {
        /**
         * set up a chrome driver with WebDriverFactory
         * navigate to https://tr-tr.facebook.com/
         * verify that the url is correct
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://tr-tr.facebook.com/");
        String currentUrl = driver.getCurrentUrl();

        driver.quit();

        if(currentUrl.equals("https://tr-tr.facebook.com/")){
            System.out.println("pass");
        }else System.out.println("fail");
    }
}
