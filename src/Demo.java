import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C://Users//yildi//IdeaProjects//initial_selenium_project_5//chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.google.com");

driver.quit();

    }
}
