package popsugar.selenium.testCase;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import popsugar.selenium.business.CreateGalleryShoppablePro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateShoppableGallery extends CaseBase{
	
	public WebDriver driver;
	public CreateGalleryShoppablePro createGShopP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		this.driver = getDriver("chrome");
		createGShopP = new CreateGalleryShoppablePro(driver);
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
	public void createGalleryShoppableTest() throws IOException, InterruptedException {
		createGShopP.createGalleryShoppable(pro.getPro("Title"), pro.getPro("SeoTitle"), pro.getPro("Tags"),pro.getPro("HiddenTags"),pro.getPro("photopath"),pro.getPro("picTitle"),pro.getPro("picCaption"));
		Thread.sleep(5000);
		createGShopP.assertCreateGalleryShoppable();
	}
	
	//需要登录且设置管理员权限
	//进入 https://popsugar.dev4.onsugar.com/celebrity/manage/new/gallery

	@AfterClass
	public void close() {
		driver.close();
	}

}
