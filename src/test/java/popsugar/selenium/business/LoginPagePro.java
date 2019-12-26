package popsugar.selenium.business;

import popsugar.selenium.base.DriverBase;
import popsugar.selenium.handle.LoginPageHandle;

import java.io.IOException;

public class LoginPagePro {
    public DriverBase driverBase;
    public LoginPageHandle loginPH;
    public LoginPagePro(DriverBase driverBase){
        driverBase = driverBase;
        loginPH = new LoginPageHandle(driverBase);  //实例化
    }

    public void login(String username, String userpass) throws IOException {
        loginPH.sendKeyUsername(username);
        loginPH.sendKeyUserpass(userpass);
        loginPH.clickLoginButton();
    }
}
