package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public WebDriverWait waitFor(int durationOfSeconds) {
        return new WebDriverWait(driver,Duration.ofSeconds(durationOfSeconds));
    }
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
