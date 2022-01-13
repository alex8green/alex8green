import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alex8_green\\IdeaProjects\\speedWednesday\\src\\main\\resources\\chromedriver_97.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openFullScreen() {
        driver.manage().window().fullscreen();
    }
}