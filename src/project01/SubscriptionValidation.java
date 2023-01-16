package project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;

public class SubscriptionValidation {
    public static void main(String[] args) {
/*
        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");

   WebElement heading2 = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));
        System.out.println(heading2.isDisplayed());

        WebElement emailInput = driver.findElement(By.cssSelector("input[id='subscribe_email']"));
        System.out.println(emailInput.getAttribute("placeholder"));
        System.out.println(emailInput.isDisplayed());


        Driver.quitDriver();
*/

        System.setProperty("webdriver.chromedriver", "C:\\Users\\yildi\\IdeaProjects\\selenium_initial_project");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://automationexercise.com/");

        WebElement heading2 = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));
        System.out.println("Subscription text in heading2 is = " + heading2.isDisplayed());

        WebElement emailInput = driver.findElement(By.cssSelector("input[id='susbscribe_email']"));
        System.out.println(emailInput.getAttribute("placeholder"));
        System.out.println(emailInput.isDisplayed()); // true ? false



        WebElement submitButton = driver.findElement(By.id("subscribe"));
        System.out.println(submitButton.isDisplayed());

        WebElement textUnderEmailInputBox = driver.findElement(By.cssSelector("form[class='searchform'] p"));
        System.out.println(textUnderEmailInputBox.isDisplayed());

        driver.quit();

    }
}
