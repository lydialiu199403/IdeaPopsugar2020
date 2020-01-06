package popsugar.selenium.testCase;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.business.CreateGalleryHybridPro;
import com.popsugar.selenium.util.HandleCookie;
import com.popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateHybridGallery {

	public DriverBase driver;
	public CreateGalleryHybridPro createGHybridP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		CaseBase cb = new CaseBase();
		this.driver = cb.InitialDriver("chrome");
		createGHybridP = new CreateGalleryHybridPro(driver);
		handleCookie = new HandleCookie(driver);
		pro = new ProUtil("data/CreateGalleryData.properties");
		driver.get("https://popsugar.dev10.onsugar.com");
		driver.maxWindow();
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
}
