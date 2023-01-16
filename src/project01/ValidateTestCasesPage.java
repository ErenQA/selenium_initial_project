package project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class ValidateTestCasesPage {

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");

        WebElement validateUrlTitle = driver.findElement(By.xpath("(//div[@class='nav navbar-nav']/li)[5]/a"));
        validateUrlTitle.click();
        Waiter.pause(2);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Driver.quitDriver();


    }
}
