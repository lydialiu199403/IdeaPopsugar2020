package popsugar.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import popsugar.selenium.base.DriverBase;
import popsugar.selenium.util.getByLocator;

import java.io.IOException;

public class LoginPage extends BasePage {
    public LoginPage(DriverBase driverBase) {
        super(driverBase);
    }

    String filename="src/test/resources/SignIn.properties";
    /**
     * 获取登录名输入框element
     * */
    public WebElement getUsernameElement() throws IOException {
        return element(getByLocator.getLocator(filename,"usernameElement"));
    }

    /**
     *获取登录密码输入框element
     * @throws IOException
     * */
    public WebElement getUserpassElement() throws IOException {
        return element(getByLocator.getLocator(filename,"userpassElement"));
    }

    /**
     * 获取登录按钮element
     * @throws IOException
     * */
    public WebElement getLoginButtonElement() throws IOException {
        return element(getByLocator.getLocator(filename,"loginButton"));
    }

}
