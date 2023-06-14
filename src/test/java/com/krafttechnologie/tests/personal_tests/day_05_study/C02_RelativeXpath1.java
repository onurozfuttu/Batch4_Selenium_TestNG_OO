package com.krafttechnologie.tests.personal_tests.day_05_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_RelativeXpath1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.krafttechexlab.com/components/alerts");
        Thread.sleep(3000);
        WebElement thirdComponent = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible fade show']"));
        System.out.println(thirdComponent.getText());

        /*WebElement thirdComponentText = driver.findElement(By.xpath("//div[@class='alert alert-primary bg-primary text-light border-0 alert-dismissible fade show']/text()[1]"));
        System.out.println(thirdComponentText.getText());
         */

        Thread.sleep(2000);

        WebElement homeButton = driver.findElement(By.xpath("//a[text()='Home']"));
        System.out.println(homeButton.getText());

        driver.navigate().to("https://www.krafttechexlab.com/forms/input");
        WebElement inputText = driver.findElement(By.xpath("//label[starts-with(@for, 'inputT')]"));
        System.out.println(inputText.getText());

        WebElement inputPassword = driver.findElement(By.xpath("//label[starts-with(text(), 'P')]"));
        System.out.println(inputPassword.getText());

        WebElement inputPassword2 = driver.findElement(By.xpath("//label[(contains(@for, 'tP'))]"));
        System.out.println(inputPassword2.getText());

        WebElement copyrightFooter = driver.findElement(By.xpath("//div[contains(text(), 'Copy')]"));
        System.out.println(copyrightFooter.getText());

        WebElement textWithAndLogic = driver.findElement(By.xpath("//label[@class='col-sm-2 col-form-label'][contains(@for, 'inputTe')]"));
        System.out.println(textWithAndLogic.getText());

        driver.get("https://www.krafttechexlab.com/forms/elements");
        WebElement inputPasswordParent = driver.findElement(By.xpath("//div[@class='row mb-3'][3]/label"));
        System.out.println(inputPasswordParent.getText());

        driver.close();
    }

}
