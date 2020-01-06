package popsugar.selenium.testCase;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.business.CreateVhubPro;
import com.popsugar.selenium.util.HandleCookie;
import com.popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateVhub extends CaseBase{
	public DriverBase driver;
	public CreateVhubPro createVP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = InitialDriver("chrome");
		createVP = new CreateVhubPro(driver);
		pro = new ProUtil("data/CreateVhubData.properties");
		handleCookie = new HandleCookie(driver);
		driver.get("https://popsugar.dev10.onsugar.com");
		driver.maxWindow();
		handleCookie.setCookie();
		Thread.sleep(3000);
		driver.get(pro.getPro("CreateVhubURL"));
		Thread.sleep(5000);
	}
	
	@Test
	public void createTextTest() throws IOException {
		createVP.createVhub(pro.getPro("Headline"),pro.getPro("SeoTitle")+System.nanoTime(), pro.getPro("Tags"));
	}
	
	/*@AfterClass
	public void close() {
		driver.close();
	}*/

}
