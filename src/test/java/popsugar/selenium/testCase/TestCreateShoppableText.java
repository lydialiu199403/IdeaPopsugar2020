package popsugar.selenium.testCase;

//import com.popsugar.selenium.base.DriverBase;
import org.testng.annotations.AfterClass;
import popsugar.selenium.business.CreateTextShoppablePro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateShoppableText extends CaseBase{
	public WebDriver driver;
	public CreateTextShoppablePro createTSP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = getDriver("chrome");
		createTSP = new CreateTextShoppablePro(driver);
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
		createTSP.createTextShoppable(pro.getPro("Headline"),pro.getPro("SeoTitle"), pro.getPro("ShoppableBody"), pro.getPro("Tags"),pro.getPro("HiddenTags"),pro.getPro("photopath"));
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
