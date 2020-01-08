package popsugar.selenium.testCase;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import popsugar.selenium.business.CreateVhubPro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateVhub extends CaseBase{
	public WebDriver driver;
	public CreateVhubPro createVP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = getDriver("chrome");
		createVP = new CreateVhubPro(driver);
		pro = new ProUtil("src/test/resources/CreateVhubData.properties");
		handleCookie = new HandleCookie(driver);
//		driver.get("https://popsugar.dev10.onsugar.com");
		driver.get(pro.getPro("URL"));
//		driver.maxWindow();
		driver.manage().window().maximize();
		handleCookie.setCookie();
		Thread.sleep(3000);
		driver.get(pro.getPro("CreateVhubURL"));
		Thread.sleep(5000);
	}
	
	@Test
	public void createVhubTest() throws IOException {
		createVP.createVhub(pro.getPro("Headline"),pro.getPro("SeoTitle")+System.nanoTime(), pro.getPro("Tags"));
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
