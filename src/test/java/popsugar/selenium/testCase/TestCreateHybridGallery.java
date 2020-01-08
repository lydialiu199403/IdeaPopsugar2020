package popsugar.selenium.testCase;

//import popsugar.selenium.base.DriverBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import popsugar.selenium.business.CreateGalleryHybridPro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateHybridGallery extends CaseBase{

	public WebDriver driver;
	public CreateGalleryHybridPro createGHybridP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
//		CaseBase cb = new CaseBase();
		this.driver = getDriver("chrome");
		createGHybridP = new CreateGalleryHybridPro(driver);
		handleCookie = new HandleCookie(driver);
		pro = new ProUtil("src/test/resources/CreateGalleryData.properties");
//		driver.get("https://popsugar.dev10.onsugar.com");
		driver.get(pro.getPro("URL"));
		driver.manage().window().maximize();
		handleCookie.setCookie();
		Thread.sleep(3000);
//		driver.get("https://popsugar.dev4.onsugar.com/manage");
		driver.get(pro.getPro("CreateGalleryURL"));
		Thread.sleep(5000);
	}
	

	@Test
	public void createGalleryHybridTest() throws IOException, InterruptedException {
		createGHybridP.createGalleryHybrid(pro.getPro("Title"), pro.getPro("SeoTitle"), pro.getPro("Tags"), pro.getPro("PaidForByLabel"), pro.getPro("PaidForByBrand"),pro.getPro("photopath"));
		Thread.sleep(3000);
		createGHybridP.assertCreateGallery();
//		createGHybridP
	}

	@AfterClass
	public void close() {
		driver.close();
	}
}
