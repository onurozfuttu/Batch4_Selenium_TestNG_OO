package com.krafttechnologie.tests.day01_automationIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01_OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");

        // get title of the page
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook – log in or sign up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("pass");
        }else System.out.println("fail");

        WebDriver driver1 = new ChromeDriver();
        driver1.navigate().to("https://www.google.com"); // driver quit() closes the pages on same driver

        driver.quit();

        /*driver.navigate().to("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

         */
    }
}
