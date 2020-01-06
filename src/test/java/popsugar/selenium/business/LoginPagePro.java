package popsugar.selenium.business;

import org.openqa.selenium.WebDriver;
//import popsugar.selenium.base.DriverBase;
import popsugar.selenium.handle.LoginPageHandle;

import java.io.IOException;

public class LoginPagePro {
//    public DriverBase driverBase;
    public LoginPageHandle loginPH;
    public WebDriver driver;
    public LoginPagePro(WebDriver driver){
        driver = driver;
        loginPH = new LoginPageHandle(driver);  //实例化
    }

    public void login(String username, String userpass) throws IOException {
        loginPH.sendKeyUsername(username);
        loginPH.sendKeyUserpass(userpass);
        loginPH.clickLoginButton();
    }
}
