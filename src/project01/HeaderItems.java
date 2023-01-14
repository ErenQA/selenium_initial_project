package project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class HeaderItems {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");

    }
}
