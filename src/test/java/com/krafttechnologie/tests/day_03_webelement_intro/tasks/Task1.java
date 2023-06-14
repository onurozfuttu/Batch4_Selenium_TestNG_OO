package com.krafttechnologie.tests.day_03_webelement_intro.tasks;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    /**
     * set up a chrome driver and navigate to http://ourvirtualmarket.com/
     * then close pop up
     * click login link
     * send "fdsddss" to email box
     * then click login
     * then take the message that appears on email box and print the message
     * use lazy way with this task
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("http://ourvirtualmarket.com/");

        WebElement mainPageAdCloseBtn = driver.findElement(By.className("popup-close"));
        mainPageAdCloseBtn.click();

        WebElement loginBtn = driver.findElement(By.className("link-lg"));
        loginBtn.click();

        Thread.sleep(5000);

        WebElement emailInputBox = driver.findElement(By.id("email"));
        emailInputBox.sendKeys("fdsddss");
        WebElement loginButtonInTheLoginBox = driver.findElement(By.id("send2"));
        loginButtonInTheLoginBox.click();


        WebElement webElement = driver.switchTo().activeElement();
        Thread.sleep(3000);
        System.out.println(webElement.getText());


        Thread.sleep(5000);



        Thread.sleep(3000);

        driver.quit();
    }
}
