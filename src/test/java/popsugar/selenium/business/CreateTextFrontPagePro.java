package popsugar.selenium.business;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.handle.CreateGalleryHandle;
import com.popsugar.selenium.handle.CreateTextHandle;
import org.testng.Assert;

import java.io.IOException;

public class CreateTextFrontPagePro {

	public DriverBase driver;
	public CreateTextHandle createTH;
	public CreateGalleryHandle createGH;
	
	public CreateTextFrontPagePro(DriverBase driver) {
		this.driver = driver;
		createTH = new CreateTextHandle(driver);
		createGH = new CreateGalleryHandle(driver);
	}	
	
	/*创建Text post with FrontPage image*/
	public void createTextFrontPageImage(String Headline,String SeoTitle,String Body,String Tags,String photopath) throws IOException, InterruptedException {
		if(createTH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Text with FrontPage Image****");
			createTH.sendKeyHeadlineElement(Headline);
			createTH.sendKeySeoTitleElement(SeoTitle+System.nanoTime());
			createTH.selectAudienceElement();
			Thread.sleep(2000);
			createTH.sendKeyBodyElement(Body);
			createTH.sendKeyTagsElement(Tags);
			driver.scrollToPixel();
			Thread.sleep(3000);
			createTH.clickUploadImageElement(photopath);
			Thread.sleep(2000);
			createTH.clickFrontPageCheckboxElement();
			createTH.clickUploadDoneElement();
			Thread.sleep(3000);
			createTH.clickCreatePostElement();
			System.out.println("****创建Text成功****");
		}else {
			System.out.println("页面不存在");
		}
	}
	
	/*判断是否上传成功*/
	public void assertUploadFrontPageImage() throws IOException{
	
		try {
			Assert.assertTrue(createTH.assertFrontPageDisplayPage());
			System.out.println("Text with FrontPage image创建成功");
		}catch(Exception e) {
			System.out.println("Text with FrontPage image创建失败");
		}		
	}
	
}
