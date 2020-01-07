package popsugar.selenium.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;

import java.util.List;
import java.util.Set;


/*BasePage里面二次封装driver方法，供各page用*/
public class BasePage {

//    public DriverBase driverBase;
    public WebDriver driver;
    static Logger logger = Logger.getLogger(BasePage.class);
    public BasePage(WebDriver driver){
        this.driver = driver;
        //        this.driverBase = driverBase;  /*this.driverBase为上面public公共的driver,在构造函数BasePage里传入的driver，只能用于该方法内部，要让public声明的driver被外部调用，必须得赋值一下*/
    }

    public WebElement getElement(By by){
        /*WebElement element = driverBase.getFindElement(by);
        return element;*/
        boolean flag=true;
        int i =0;
        WebElement Element=null;
        while(flag) {
            try {
                Element = driver.findElement(by);
                flag=false;

            }
            catch(Exception e) {
                i=i+1;
                if(i ==10) {
                    flag=false;
                }
            }
        }
        return Element;
    }

    public void get(String url){
//        driverBase.get(url);
        driver.get(url);
    }

    public void switchToframe(String frame) {
        driver.switchTo().frame(frame);
    }
    public void maxWindow() {
        driver.manage().window().maximize();
    }

    /*封装元素是否可见方法*/
    public boolean assertElementIsDisPlay(WebElement element) {
        return element.isDisplayed();
    }

    /*封装元素是否是显示的*/
    public boolean assertTagName(WebElement element,String text) {
        return element.getTagName().equals(text);
    }
    /*封装元素是否可见方法*/
    public boolean assertElementIs(WebElement element) {
        return element.isDisplayed();
    }

    /*通过父节点获取子节点方法*/
    public WebElement nodeElement(By by,By nodeBy) {
        WebElement element = this.getElement(by);
        return element.findElement(nodeBy);
    }

    /*封装获取多个elements方法*/
    public List<WebElement> getElements(By by, By nodeBy) {
        WebElement element = this.getElement(by);
        return element.findElements(nodeBy);
    }

    public List<WebElement> elements(By by) {
        return driver.findElements(by);
    }

    /*滚动页面至指定元素位置*/
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToPixel() {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,750)");
    }

    /**
     * 封装输入sendkeys方法
     * */
    public void sendKeys(WebElement element,String value) {
        element.sendKeys(value);
    }

    /**
     * 封装click方法
     * */
    public void click(WebElement element) {
        element.click();
    }



    /**
     * 封装driver
     * */
    public WebDriver driver() {
        return this.driver;
    }

    /**
     * 封装close
     * */
    public void close() {
        driver.close();
    }

    /**
     * 封装setCookie
     * */
    public void setCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }

    /**
     * 封装getCookie
     * */
    public Set<Cookie> getCookie() {
        Set<Cookie> cookies = driver.manage().getCookies();
        return cookies;

    }
    /**
     * 封装获取当前Url方法
     * */
    public String getCurrentUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }








}
