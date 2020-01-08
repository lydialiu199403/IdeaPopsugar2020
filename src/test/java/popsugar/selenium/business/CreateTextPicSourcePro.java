package popsugar.selenium.business;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import popsugar.selenium.handle.CreateTextHandle;

import java.io.IOException;

public class CreateTextPicSourcePro {

	public WebDriver driver;
	public CreateTextHandle createTH;
	
	public CreateTextPicSourcePro(WebDriver driver) {
		this.driver = driver;
		createTH = new CreateTextHandle(driver);
	}	
	
	/*创建Text post*/
	public void createTextPicSource(String Headline,String SeoTitle,String Body,String Tags,String PicSource,String PicSourceUrl) throws IOException, InterruptedException {
		if(createTH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Text****");
			createTH.sendKeyHeadlineElement(Headline);
			createTH.sendKeySeoTitleElement(SeoTitle);
			createTH.selectAudienceElement();
			createTH.sendKeyBodyElement(Body);
			createTH.sendKeyTagsElement(Tags);
//			driver.scrollToPixel();
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,750)");
			Thread.sleep(3000);
			createTH.sendKeyPicSourceElement(PicSource);
			createTH.sendKeyPicSourceUrlElement(PicSourceUrl);
			createTH.clickCreatePostElement();
			System.out.println("****创建Text成功****");
		}else {
			System.out.println("页面不存在");
		}
	}
	
}
