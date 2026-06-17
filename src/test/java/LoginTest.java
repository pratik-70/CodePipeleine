

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void googleTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Assert.assertEquals(driver.getTitle(), "Google");

        driver.quit();
    }
}