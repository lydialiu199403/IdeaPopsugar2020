package popsugar.selenium.handle;

import popsugar.selenium.base.DriverBase;
import popsugar.selenium.page.HomePage;

import java.io.IOException;

public class HomePageHandle {
    public DriverBase driverBase;
    public HomePage homePage;

    public HomePageHandle(DriverBase driverBase) {
        this.driverBase = driverBase;
        homePage = new HomePage(driverBase);
    }

    /**
     * 点击首页 hamburger-menu
     * @throws IOException
     * */
    public void clickHamMenuElement() throws IOException {
        driverBase.click(homePage.getHamMenuElement());
    }

    /**
     * 点击登录菜单
     * @throws IOException
     * */
    public void clickLoginElement() throws IOException {
        driverBase.click(homePage.getLoginMenuElement());
    }

    /**
     * 点击登录后的profile菜单
     * @throws IOException
     * */
    public void clickProfileMenuElement() throws IOException {
        driverBase.click(homePage.getProfileElement());
    }
    /*
    * 获取当前URL
    * */
    public String getCurrentURL(){
        return driverBase.getCurrentUrl();
    }

}
