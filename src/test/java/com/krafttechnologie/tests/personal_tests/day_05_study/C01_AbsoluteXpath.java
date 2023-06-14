package com.krafttechnologie.tests.personal_tests.day_05_study;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C01_AbsoluteXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.krafttechexlab.com/components/alerts");

        Thread.sleep(2000);

        WebElement secondComponent = driver.findElement(By.xpath("html/body/main/section/div/div/div/div/div[2]"));
        System.out.println(secondComponent.getText());

        driver.close();
    }
}
