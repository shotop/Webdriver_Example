import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test1 {
    WebDriver driver = new FirefoxDriver();

    @Test
    public void googleTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.cssSelector("#gbqfq")).sendKeys("elephant");
        driver.findElement(By.cssSelector(".gbqfb")).click();

        Thread.sleep(5000);

        String page_text = driver.findElement(By.tagName("body")).getText();

        Assert.assertTrue(page_text.toLowerCase().contains("hotop"));

        driver.quit();
    }
}
