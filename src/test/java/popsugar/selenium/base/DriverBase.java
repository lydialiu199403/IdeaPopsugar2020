package popsugar.selenium.base;

import org.openqa.selenium.*;

import java.util.List;
import java.util.Set;

/*DriverBase里面封装WebDriver的各种方法，供BasePage调用*/
public class DriverBase {
    public WebDriver driver;
    public DriverBase(String browser){
        SelectDriver select = new SelectDriver();
        this.driver = select.selectDriver(browser);
    }

    /*获取driver*/
    public WebDriver getDriver(){
        return driver;
    }
    /**
     * 封装element方法
     * */
    public WebElement getFindElement(By by) {
        WebElement element = driver.findElement(by);
        return element;
    }

    /**
     * 封装get方法
     * */
    public void get(String url) {
        driver.get(url);
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
     * 封装切换frame方法
     * */
    public void switchToframe(String frame) {
        driver.switchTo().frame(frame);
    }

    /**
     * 封装方法窗口方法
     * */
    public void maxWindow() {
        driver.manage().window().maximize();
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

    /*封装元素是否可见方法*/
    public boolean assertElementIs(WebElement element) {
        return element.isDisplayed();
    }

    /*通过父节点获取子节点方法*/
    public WebElement nodeElement(By by,By nodeBy) {
        WebElement element = this.getFindElement(by);
        return element.findElement(nodeBy);
    }

    /*封装获取多个elements方法*/
    public List<WebElement> getElements(By by, By nodeBy) {
        WebElement element = this.getFindElement(by);;
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


}
