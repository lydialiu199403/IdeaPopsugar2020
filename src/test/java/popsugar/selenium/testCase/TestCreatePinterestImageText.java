package popsugar.selenium.testCase;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import popsugar.selenium.business.CreateTextPinterestPro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreatePinterestImageText extends CaseBase{
	public WebDriver driver;
	public CreateTextPinterestPro createTPP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = getDriver("chrome");
		createTPP = new CreateTextPinterestPro(driver);
		pro = new ProUtil("src/test/resources/CreateTextData.properties");
		handleCookie = new HandleCookie(driver);
//		driver.get("https://popsugar.dev10.onsugar.com");
		driver.get(pro.getPro("URL"));
		driver.manage().window().maximize();
		handleCookie.setCookie();
		Thread.sleep(3000);
		driver.get(pro.getPro("CreateTextURL"));
		Thread.sleep(5000);
	}
	
	@Test
	public void createTextTest() throws IOException, InterruptedException {
		createTPP.createTextPinterestImage(pro.getPro("Headline"),pro.getPro("SeoTitle"), pro.getPro("Body"), pro.getPro("Tags"),pro.getPro("photopath"));
		driver.get(driver.getCurrentUrl()+"/edit");
		Thread.sleep(3000);
//		driver.scrollToPixel();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		createTPP.assertUploadPinterestImage();
		
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
