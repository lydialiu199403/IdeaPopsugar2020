package popsugar.selenium.testCase;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.business.CreateGalleryMulPicPro;
import com.popsugar.selenium.util.HandleCookie;
import com.popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateGalleryMulPic extends CaseBase{
	
	public DriverBase driver;
	public CreateGalleryMulPicPro createGMulPicP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		this.driver = InitialDriver("chrome");
		createGMulPicP = new CreateGalleryMulPicPro(driver);
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
	public void createGalleryMulPicTest() throws IOException, InterruptedException {
		createGMulPicP.createGalleryMulPic(pro.getPro("Title"), pro.getPro("SeoTitle"), pro.getPro("Tags"),pro.getPro("photopath"));
		Thread.sleep(3000);
		createGMulPicP.assertCreateGalleryMulPic();
	}
	
	//需要登录且设置管理员权限
	//进入 https://popsugar.dev4.onsugar.com/celebrity/manage/new/gallery

	/*@AfterClass
	public void close() {
		driver.close();
	}*/

}
