package popsugar.selenium.handle;

import org.openqa.selenium.WebDriver;
//import popsugar.selenium.base.DriverBase;
import popsugar.selenium.page.HomePage;

import java.io.IOException;

public class HomePageHandle {
//    public DriverBase driverBase;
    public HomePage homePage;
    public WebDriver driver;

    public HomePageHandle(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
    }

    /**
     * 点击首页 hamburger-menu
     * @throws IOException
     * */
    public void clickHamMenuElement() throws IOException {
        homePage.getHamMenuElement().click();
    }

    /**
     * 点击登录菜单
     * @throws IOException
     * */
    public void clickLoginElement() throws IOException {
        homePage.getLoginMenuElement().click();
    }

    /**
     * 点击登录后的profile菜单
     * @throws IOException
     * */
    public void clickProfileMenuElement() throws IOException {
        homePage.getProfileElement().click();
    }
    /*
    * 获取当前URL
    * */
    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public String getProfilePageUsername() throws IOException {
        return homePage.getProfilePageUsernameElement().getText();
    }

    public String getCMSPageUsername() throws IOException {
        return homePage.getCMSPageUsernameElement().getText();
    }

}
