package popsugar.selenium.business;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.WebDriver;
import popsugar.selenium.handle.CreateTextHandle;

import java.io.IOException;

public class CreateTextPro {

	public WebDriver driver;
	public CreateTextHandle createTH;
	
	public CreateTextPro(WebDriver driver) {
		this.driver = driver;
		createTH = new CreateTextHandle(driver);
	}	
	
	/*创建Text post*/
	public void createText(String Headline,String SeoTitle,String Body,String Tags) throws IOException {
		if(createTH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Text****");
			createTH.sendKeyHeadlineElement(Headline);
			createTH.sendKeySeoTitleElement(SeoTitle);
			createTH.selectAudienceElement();
			createTH.sendKeyBodyElement(Body);
			createTH.sendKeyTagsElement(Tags);
			createTH.clickCreatePostElement();
			System.out.println("****创建Text成功****");
		}else {
			System.out.println("页面不存在");
		}
	}
	
}
