package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            System.setProperty("webdriver.chromedriver", "C://Users//yildi//IdeaProjects//selenium_initial_project//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }

    }
}
