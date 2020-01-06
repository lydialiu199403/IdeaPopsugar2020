package popsugar.selenium.testCase;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.business.CreateGalleryReverseOrderPro;
import com.popsugar.selenium.util.HandleCookie;
import com.popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateGalleryReverseOrder extends CaseBase{
	
	public DriverBase driver;
	public CreateGalleryReverseOrderPro createGROP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		this.driver = InitialDriver("chrome");
		createGROP = new CreateGalleryReverseOrderPro(driver);
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
	public void createGalleryReverseOrderTest() throws IOException, InterruptedException {
		createGROP.createGalleryReverseOrder(pro.getPro("Title"), pro.getPro("SeoTitle"), pro.getPro("Tags"),"E:\\\\test.jpg","E:\\\\photo1.jpg");
		Thread.sleep(3000);
		createGROP.assertCreateGallery();
	}
	
	//需要登录且设置管理员权限
	//进入 https://popsugar.dev4.onsugar.com/celebrity/manage/new/gallery

	/*@AfterClass
	public void close() {
		driver.close();
	}*/

}
