package popsugar.selenium.handle;

import popsugar.selenium.base.DriverBase;
import popsugar.selenium.page.LoginPage;

import java.io.IOException;

public class LoginPageHandle {
    public DriverBase driverBase;
    public LoginPage loginPage;

    public LoginPageHandle(DriverBase driverBase) {
        this.driverBase = driverBase;
        loginPage = new LoginPage(driverBase);
    }

    /**
     * 输入登录名
     * @throws IOException
     * */
    public void sendKeyUsername(String username) throws IOException {
        driverBase.sendKeys(loginPage.getUsernameElement(),username);
    }

    /**
     * 输入密码
     * */
    public void sendKeyUserpass(String userpass) throws IOException{
        driverBase.sendKeys(loginPage.getUserpassElement(), userpass);
    }

    /**
     * 点击登录按钮
     * @throws IOException
     * */
    public void clickLoginButton() throws IOException {

        driverBase.click(loginPage.getLoginButtonElement());
    }

}

//把driverBase.click这些方法改成用loginPage调用