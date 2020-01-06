package popsugar.selenium.handle;

import org.openqa.selenium.WebDriver;
//import popsugar.selenium.base.DriverBase;
import popsugar.selenium.page.LoginPage;

import java.io.IOException;

public class LoginPageHandle {
//    public DriverBase driverBase;
    public LoginPage loginPage;
    public WebDriver driver;

    public LoginPageHandle(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    /**
     * 输入登录名
     * @throws IOException
     * */
    public void sendKeyUsername(String username) throws IOException {
//        driverBase.sendKeys(loginPage.getUsernameElement(),username);
        loginPage.getUsernameElement().sendKeys(username);
    }

    /**
     * 输入密码
     * */
    public void sendKeyUserpass(String userpass) throws IOException{
        loginPage.getUserpassElement().sendKeys(userpass);
    }

    /**
     * 点击登录按钮
     * @throws IOException
     * */
    public void clickLoginButton() throws IOException {

        loginPage.getLoginButtonElement().click();
    }

}

//把driverBase.click这些方法改成用loginPage调用