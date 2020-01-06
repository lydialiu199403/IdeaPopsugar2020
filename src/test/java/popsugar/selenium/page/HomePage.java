package popsugar.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import popsugar.selenium.base.DriverBase;
import popsugar.selenium.util.getByLocator;

import java.io.IOException;

public class HomePage extends BasePage {

    String filename="src/test/resources/SignIn.properties";

    public HomePage(WebDriver driver) {
        super(driver);
    }
//    public HomePage(DriverBase driverBase) {
//        super(driverBase);
//    }

    public WebElement getHamMenuElement() throws IOException {
        return getElement(getByLocator.getLocator(filename,"nav-menu"));
    }

    /**
     * 获取首页登录element
     * */
    public WebElement getLoginMenuElement() throws IOException {
        return getElement(getByLocator.getLocator(filename,"clickLogin"));
    }

    /**
     * 获取首页profile菜单element
     * @throws IOException
     * */
    public WebElement getProfileElement() throws IOException {
        return getElement(getByLocator.getLocator(filename,"profile-menu"));
    }

}
