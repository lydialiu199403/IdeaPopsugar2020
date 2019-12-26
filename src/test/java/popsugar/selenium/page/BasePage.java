package popsugar.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import popsugar.selenium.base.DriverBase;

/*BasePage里面二次封装driver方法，供各page用*/
public class BasePage {
    public DriverBase driverBase;
    public BasePage(DriverBase driverBase){
        this.driverBase = driverBase;  /*this.driverBase为上面public公共的driver,在构造函数BasePage里传入的driver，只能用于该方法内部，要让public声明的driver被外部调用，必须得赋值一下*/
    }

    public WebElement element(By by){
        WebElement element = driverBase.getFindElement(by);
        return element;
    }

    public void get(String url){
        driverBase.get(url);
    }







}
