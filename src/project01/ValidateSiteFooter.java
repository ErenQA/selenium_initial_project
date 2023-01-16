package project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class ValidateSiteFooter {

    public static void main(String[] args) {


        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");

        WebElement footerText = driver.findElement(By.cssSelector("p[class='pull-left']"));
        System.out.println(footerText.isDisplayed());



        Driver.quitDriver();
    }
}