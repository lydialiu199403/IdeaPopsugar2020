package popsugar.selenium.business;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.JavascriptExecutor;
import popsugar.selenium.handle.CreateGalleryHandle;
import popsugar.selenium.handle.CreateTextHandle;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CreateTextShoppablePro {

	public WebDriver driver;
	public CreateTextHandle createTH;
	public CreateGalleryHandle createGH;
	
	public CreateTextShoppablePro(WebDriver driver) {
		this.driver = driver;
		createTH = new CreateTextHandle(driver);
		createGH = new CreateGalleryHandle(driver);
	}	
	
	/*创建Text post*/
	public void createTextShoppable(String Headline,String SeoTitle,String ShoppableBody,String Tags,String HiddenTags,String photopath) throws IOException, InterruptedException {
		if(createTH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Shoppable Text****");
			createTH.sendKeyHeadlineElement(Headline);
			createTH.sendKeySeoTitleElement(SeoTitle+System.nanoTime());
			createTH.selectAudienceElement();
//			Thread.sleep(3000);
			createTH.clickBodyHtmlBtnElement();
			Thread.sleep(2000);
			createTH.sendKeyHtmlBodyElement(ShoppableBody);
			createTH.sendKeyTagsElement(Tags);
//			driver.scrollToPixel();
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,750)");
			Thread.sleep(3000);
			createTH.sendKeyHiddenTagsElement(HiddenTags);
//			driver.scrollToPixel();
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,750)");
			Thread.sleep(3000);
			createTH.clickUploadImageElement(photopath);
			Thread.sleep(2000);
			createTH.clickThumbnailCheckboxElement();
			createTH.clickUploadDoneElement();
			Thread.sleep(3000);
			createTH.clickCreatePostElement();
			System.out.println("****创建Shoppable Text成功****");
		}else {
			System.out.println("页面不存在");
		}
	}
	
	/*判断是否创建Shoppable成功*/
	public void assertCreateGalleryShoppable() throws IOException{
	
		if(createGH.assertGalleryShoppablePage()) {
			System.out.println("Shoppable Text创建成功");
		}else {
			System.out.println("Shoppable Text创建失败");
		}

	}
	
}
