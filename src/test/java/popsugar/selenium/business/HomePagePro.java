package popsugar.selenium.business;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import popsugar.selenium.base.DriverBase;
import popsugar.selenium.handle.HomePageHandle;

import java.io.IOException;

public class HomePagePro {

    public HomePageHandle homePageH;
//    public DriverBase driverBase; //要用到DriverBase,就需要赋值，所以都会创建一个构造函数
    public WebDriver driver;
    public HomePagePro(WebDriver driver) {
        this.driver = driver;
        homePageH = new HomePageHandle(driver);
    }


    //    执行HomePage页面所需的操作
    public void clickLoginMenu(){

        try {
            homePageH.clickHamMenuElement();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            homePageH.clickLoginElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 判断是否登录成功
     * @throws IOException
     * @throws InterruptedException
     * */
    public void assertLogin(String expectedUrl) throws IOException, InterruptedException {
        homePageH.clickHamMenuElement();
        Thread.sleep(3000);
        homePageH.clickProfileMenuElement();
        String currentUrl = homePageH.getCurrentURL();
		Assert.assertEquals(currentUrl, expectedUrl);
//        if(currentUrl.equals(expectedUrl)) {
//            System.out.println("登录成功");
//        }
    }
}
