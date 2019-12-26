package popsugar.selenium.testCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import popsugar.selenium.base.DriverBase;
import popsugar.selenium.business.HomePagePro;
import popsugar.selenium.business.LoginPagePro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.PropUtil;

import java.io.IOException;

//如果不用caseBase，怎么编写？
public class TestSignIn_tk25 extends CaseBase{
    public DriverBase driverBase;
    public HomePagePro homePagePro;
    public LoginPagePro loginPagePro;
    public PropUtil propUtil;
    public HandleCookie handleCookie;

    /**
     * 打开首页并打开登录框
     * @throws IOException
     * @throws InterruptedException
     * */
    @BeforeClass
    public void getSignInHome() throws IOException, InterruptedException {
        String filepath= "src/test/resources/SignIn.properties";
        driverBase = InitialDriver("chrome");
        homePagePro = new HomePagePro(driverBase);
        loginPagePro = new LoginPagePro(driverBase);
        propUtil = new PropUtil(filepath);
        handleCookie = new HandleCookie(driverBase);
        driverBase.get(propUtil.getPro("URL"));
        driverBase.maxWindow();
        homePagePro.clickLoginMenu();
        Thread.sleep(5000);

    }

    /**
     * 登录操作
     * @throws IOException
     * @throws InterruptedException
     * */
    @Test
    public void signIn() throws IOException, InterruptedException {
        driverBase.switchToframe(propUtil.getPro("loginFrame"));
        loginPagePro.login(propUtil.getPro("username"),propUtil.getPro("userpass"));
        Thread.sleep(5000);
        homePagePro.assertLogin(propUtil.getPro("ExpectedURL"));
        driverBase.get(propUtil.getPro("ManageURL"));
        handleCookie.writeCookie();

    }
}
