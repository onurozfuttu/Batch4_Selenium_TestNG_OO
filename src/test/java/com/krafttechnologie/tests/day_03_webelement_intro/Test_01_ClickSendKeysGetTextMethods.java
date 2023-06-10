package com.krafttechnologie.tests.day_03_webelement_intro;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_01_ClickSendKeysGetTextMethods {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Open chore browser
         * navigate to https://www.amazon.com/
         * write "Java" to the search bar
         * click search button
         * get result for text
         * verify that the text contains "Java"
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.amazon.com/");
        WebElement element = driver.findElement(By.cssSelector("[type=\"text\"]"));
        element.sendKeys("Java");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        String actualText = element1.getText();
        String expectedText = "Java";
        //String text = element.getText();

        driver.close();

        if(actualText.contains(expectedText)){
            System.out.println("pass");
        }else System.out.println("fail");
    }
}
