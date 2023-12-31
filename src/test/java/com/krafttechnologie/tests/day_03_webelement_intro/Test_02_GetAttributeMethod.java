package com.krafttechnologie.tests.day_03_webelement_intro;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_02_GetAttributeMethod {
    public static void main(String[] args) {
        /**
         * set up a Chrome browser and navigate to https://www.krafttechexlab.com/login
         * send "Karalama" text to email box
         * get the written text by using getAttribute() method
         * get the id value by using getAttribute() method
         * verify both
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.krafttechexlab.com/login");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Karalama");

        String actualValue = email.getAttribute("value");
        String expectedValue = "Karalama";

        String actualId = email.getAttribute("id");
        String expectedId = "email";

        if(actualValue.equals(expectedValue) && actualId.equals(expectedId)){
            System.out.println("pass");
        }else System.out.println("fail");


    }
}
