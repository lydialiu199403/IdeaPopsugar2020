package popsugar.selenium.util;

import org.openqa.selenium.Cookie;
import popsugar.selenium.base.DriverBase;

import java.io.IOException;
import java.util.Set;

public class HandleCookie {
    public DriverBase driver;
    public PropUtil pro;
    public HandleCookie(DriverBase driver) throws IOException {
        super();
        this.driver = driver;
//        this.pro = new PropUtil("E:\\eclipse-popsugar\\popsugar1215\\src\\test\\java\\popsugar\\selenium\\data\\cookie.properties");
        this.pro = new PropUtil("src/test/resources/cookie.properties");

    }

    public void setCookie() {
        String value = pro.getPro("ss1");
//		System.out.println(value);
        Cookie cookie = new Cookie("ss1",value,"secure.dev10.onsugar.com","/",null);
//		System.out.println(cookie);
        driver.setCookie(cookie);
    }

    public void writeCookie() throws IOException {
        Set<Cookie> cookies = driver.getCookie();
        for(Cookie cookie:cookies) {
            if(cookie.getName().equals("ss1")) {
                pro.writePro(cookie.getName(), cookie.getValue());
            }
        }
    }
}
