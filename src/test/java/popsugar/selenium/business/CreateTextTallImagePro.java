package popsugar.selenium.business;

//import com.popsugar.selenium.base.DriverBase;
import popsugar.selenium.handle.CreateGalleryHandle;
import popsugar.selenium.handle.CreateTextHandle;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class CreateTextTallImagePro {

	public WebDriver driver;
	public CreateTextHandle createTH;
	public CreateGalleryHandle createGH;
	
	public CreateTextTallImagePro(WebDriver driver) {
		this.driver = driver;
		createTH = new CreateTextHandle(driver);
		createGH = new CreateGalleryHandle(driver);
	}	
	
	/*创建Text post with Tall image*/
	public void createTextTallImage(String Headline,String SeoTitle,String Body,String Tags,String photopath) throws IOException, InterruptedException {
		if(createTH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Text with Tall Image****");
			createTH.sendKeyHeadlineElement(Headline);
			createTH.sendKeySeoTitleElement(SeoTitle+System.nanoTime());
			createTH.selectAudienceElement();
			Thread.sleep(2000);
			createTH.sendKeyBodyElement(Body);
			createTH.sendKeyTagsElement(Tags);
//			driver.scrollToPixel();
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,750)");
			Thread.sleep(3000);
			createTH.clickUploadImageElement(photopath);
			Thread.sleep(2000);
			createTH.clickTallImageCheckboxElement();
			createTH.clickUploadDoneElement();
			Thread.sleep(3000);
			createTH.clickCreatePostElement();
			System.out.println("****创建Text with Tall Image成功****");
		}else {
			System.out.println("页面不存在");
		}
	}
	
	/*判断是否上传成功*/
	public void assertUploadTallImage() throws IOException{
	
		try {
			Assert.assertTrue(createTH.assertTallImageDisplayPage());
			System.out.println("Text with Tall image创建成功");
		}catch(Exception e) {
			System.out.println("Text with Tall image创建失败");
		}		
	}
	
}
