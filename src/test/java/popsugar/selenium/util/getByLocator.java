package popsugar.selenium.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import java.io.IOException;

public class getByLocator {
    public WebDriver driver;
    static Logger logger = Logger.getLogger(getByLocator.class);

    public getByLocator(WebDriver driver) {
        this.driver = driver;
    }

    public static By getLocator(String filename, String key) throws IOException {
        PropUtil proUtil = new PropUtil(filename);
        logger.debug("你的定位信息Key为"+key);
        String locator = proUtil.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        logger.debug("你的定位方式为："+locatorType);
        logger.debug("你的定位值为："+locatorValue);

        if(locatorType.equals("id")) {
            return By.id(locatorValue);
        }else if(locatorType.equals("name")) {
            return By.name(locatorValue);
        }else if(locatorType.equals("className")) {
            return By.className(locatorValue);
        }else if(locatorType.equals("tagName")) {
            return By.tagName(locatorValue);
        }else if(locatorType.equals("linkText")) {
            return By.linkText(locatorValue);
        }else if(locatorType.equals("xpath")){
            return By.xpath(locatorValue);
        }else if(locatorType.equals("css")) {
            return By.cssSelector(locatorValue);
        }else {
            return By.partialLinkText(locatorValue);
        }
    }
}
