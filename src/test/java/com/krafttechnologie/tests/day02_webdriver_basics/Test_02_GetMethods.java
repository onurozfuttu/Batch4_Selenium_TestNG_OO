package com.krafttechnologie.tests.day02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_02_GetMethods {
    public static void main(String[] args) {
        /**
         * set up a chrome driver
         * navigate to https://www.hepsiburada.com/
         * get title and get url
         * verify that title, url and Page source codes  contain "hepsiburada"
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.hepsiburada.com/");
        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();

        driver.quit();

        title = title.toLowerCase();
        currentUrl = currentUrl.toLowerCase();
        pageSource = pageSource.toLowerCase();

        if(title.contains("hepsiburada") && currentUrl.contains("hepsiburada") && pageSource.contains("hepsiburada")){
            System.out.println("pass");
        }else System.out.println("fail");
    }
}
