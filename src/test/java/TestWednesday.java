import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWednesday extends TestInit {

    @Test
    public void testOne() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.navigateSignIn();
        openFullScreen();
        signInPage.getEmailField().sendKeys("sgshjsjgvhsg");
        signInPage.getPassword().sendKeys("vsmgslvhsdj");
        signInPage.getLoginBtn().click();
        signInPage.closeModal();
        sleep(2);
        Assert.assertTrue(signInPage.getErrorMSG().isDisplayed());
    }

    @Test
    public void testTwo() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.navigateHome();
        openFullScreen();
        homePage.getAddressField().sendKeys("Los Angeles");
        signInPage.closeModal();
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getLastPageRest();
        homePage.getLastRest();
    }

    @Test
    public void testThree() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.navigateHome();
        openFullScreen();
        homePage.getAddressField().sendKeys("New York");
        signInPage.closeModal();
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getLastPageRest();
        homePage.getLastRest();
    }

    @Test
    public void testFour(){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.navigateHome();
        openFullScreen();
        homePage.getAddressField().sendKeys("Buffalo");
        signInPage.closeModal();
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getLastPageRest();
        homePage.getFourRest();
    }
}