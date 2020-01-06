package popsugar.selenium.testCase;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.business.CreateTextShoppablePro;
import com.popsugar.selenium.util.HandleCookie;
import com.popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateShoppableText extends CaseBase{
	public DriverBase driver;
	public CreateTextShoppablePro createTSP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = InitialDriver("chrome");
		createTSP = new CreateTextShoppablePro(driver);
		pro = new ProUtil("data/CreateTextData.properties");
		handleCookie = new HandleCookie(driver);
		driver.get("https://popsugar.dev10.onsugar.com");
		driver.maxWindow();
		handleCookie.setCookie();
		Thread.sleep(3000);
		driver.get(pro.getPro("CreateTextURL"));
		Thread.sleep(5000);
	}
	
	@Test
	public void createTextTest() throws IOException, InterruptedException {
		createTSP.createTextShoppable(pro.getPro("Headline"),pro.getPro("SeoTitle"), pro.getPro("ShoppableBody"), pro.getPro("Tags"),pro.getPro("HiddenTags"),pro.getPro("photopath"));
	}
	
	/*@AfterClass
	public void close() {
		driver.close();
	}*/

}
