package popsugar.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import popsugar.selenium.base.DriverBase;
import popsugar.selenium.util.getByLocator;

import java.io.IOException;

public class LoginPage extends BasePage {
//    public LoginPage(DriverBase driverBase) {
//        super(driverBase);
//    }

//    public WebDriver driver;
    public LoginPage(WebDriver driver){
        super(driver);
//        this.driver = driver;
    }

    String filename="src/test/resources/SignIn.properties";
    /**
     * 获取登录名输入框element
     * */
    public WebElement getUsernameElement() throws IOException {
//        return element(getByLocator.getLocator(filename,"usernameElement"));
        return getElement(getByLocator.getLocator(filename,"usernameElement"));
    }

    /**
     *获取登录密码输入框element
     * @throws IOException
     * */
    public WebElement getUserpassElement() throws IOException {
        return getElement(getByLocator.getLocator(filename,"userpassElement"));
    }

    /**
     * 获取登录按钮element
     * @throws IOException
     * */
    public WebElement getLoginButtonElement() throws IOException {
        return getElement(getByLocator.getLocator(filename,"loginButton"));
    }

}
