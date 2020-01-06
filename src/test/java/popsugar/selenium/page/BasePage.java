package popsugar.selenium.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


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







}
