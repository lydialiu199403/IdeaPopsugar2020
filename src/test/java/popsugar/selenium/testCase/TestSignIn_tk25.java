package popsugar.selenium.testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import popsugar.selenium.business.HomePagePro;
import popsugar.selenium.business.LoginPagePro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;

import java.io.IOException;

//如果不用caseBase，怎么编写？
public class TestSignIn_tk25 extends CaseBase{
//    public DriverBase driver;
    public WebDriver driver;
    public HomePagePro homePagePro;
    public LoginPagePro loginPagePro;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    static Logger logger = Logger.getLogger(TestSignIn_tk25.class);

    /**
     * 打开首页并打开登录框
     * @throws IOException
     * @throws InterruptedException
     * */
    @BeforeClass
    public void getSignInHome() throws IOException, InterruptedException {
        String filepath= "src/test/resources/SignIn.properties";
        driver = getDriver("chrome");
        homePagePro = new HomePagePro(this.driver);
        loginPagePro = new LoginPagePro(driver);
        proUtil = new ProUtil(filepath);
        handleCookie = new HandleCookie(driver);
        driver.get(proUtil.getPro("URL"));
        driver.manage().window().maximize();
        logger.debug("初始化浏览器");
        logger.debug("打开浏览器");
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

        driver.switchTo().frame(proUtil.getPro("loginFrame"));
        loginPagePro.login(proUtil.getPro("username"), proUtil.getPro("userpass"));
        Thread.sleep(5000);
//        homePagePro.assertLogin(proUtil.getPro("ExpectedURL"));
//        homePagePro.getLoggedUserInfo(proUtil.getPro("ExpectedURL"),proUtil.getPro("CMSPageloggedUserName"));
        Assert.assertEquals(homePagePro.getLoggedProfileUrl(), proUtil.getPro("ExpectedURL"));
        Assert.assertEquals(homePagePro.getLoggedProfileUsername(), proUtil.getPro("profilePageUserName"));

        driver.get(proUtil.getPro("ManageURL"));
        handleCookie.writeCookie();

    }

    @AfterClass
    public void close() {
        driver.close();
    }

}
