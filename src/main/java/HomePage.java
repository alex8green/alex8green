import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateHome() {
        driver.get("https://eatstreet.com/");
    }

    public WebElement getAddressField() {
        return driver.findElement(By.xpath("//input[contains(@class,'enter-address__input')]"));
    }

    public WebElement getFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public List<WebElement> getSearchAttempt() {
        return driver.findElements(By.xpath("//div[@class='modal-footer']/a"));
    }

    public void checkAndClosePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            getSearchAttempt().get(getSearchAttempt().size() - 1).click();
        }
    }

    public List<WebElement> getAllRest() {
        return driver.findElements(By.xpath("//ul[@id='all-rests']/li"));
    }

    public void getLastRest() {
        if (getAllRest().size() > 0) {
            getAllRest().get(getAllRest().size() - 1).click();
        }
    }

    public void getFourRest() {
        if (getAllRest().size() > 0) {
            getAllRest().get(3).click();
        }
    }

    public List<WebElement> getAllPageRest() {
        return driver.findElements(By.xpath("//ul[contains(@class,'pagination__pages')]/li"));
    }

    public void getLastPageRest() {
        if (getAllPageRest().size() > 0) {
            getAllPageRest().get(getAllPageRest().size() - 1).click();
        }
    }
}