package com.krafttechnologie.tests.day01_automationIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_02_WindowMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.krafttechnologie.com/");
        driver.manage().window().maximize();

        // take the size of screen
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        //get the point of driver -- specifies the top leftmost point of the driver
        Point position = driver.manage().window().getPosition();
        System.out.println(position);

        //set position
        driver.manage().window().setPosition(new Point(1550,150));
        driver.manage().window().maximize();

        // set the size of driver
        driver.manage().window().setSize(new Dimension(600,500));


    }
}
