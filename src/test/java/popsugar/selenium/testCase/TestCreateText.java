package popsugar.selenium.testCase;

//import com.popsugar.selenium.base.DriverBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import popsugar.selenium.business.CreateTextPro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateText extends CaseBase{
	public WebDriver driver;
	public CreateTextPro createTP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	static Logger logger = Logger.getLogger(TestCreateText.class);
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = getDriver("chrome");
		createTP = new CreateTextPro(driver);
		pro = new ProUtil("src/test/resources/CreateTextData.properties");
		handleCookie = new HandleCookie(driver);
//		driver.get("https://popsugar.dev10.onsugar.com");
		driver.get(pro.getPro("URL"));
//		createTP.maxWindow();
		driver.manage().window().maximize();
		logger.debug("初始化浏览器");
		logger.debug("打开浏览器");
		handleCookie.setCookie();
		Thread.sleep(3000);
		driver.get(pro.getPro("CreateTextURL"));
		Thread.sleep(5000);
	}
	
	@Test
	public void createTextTest() throws IOException {
		createTP.createText(pro.getPro("Headline"),pro.getPro("SeoTitle"), pro.getPro("Body"), pro.getPro("Tags"));
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
