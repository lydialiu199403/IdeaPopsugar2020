package popsugar.selenium.business;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.WebDriver;
import popsugar.selenium.handle.CreateVhubHandle;

import java.io.IOException;

public class CreateVhubPro {

	public WebDriver driver;
	public CreateVhubHandle createVH;
	
	public CreateVhubPro(WebDriver driver) {
		this.driver = driver;
		createVH = new CreateVhubHandle(driver);
	}	
	
	/*创建Vhub post*/
	public void createVhub(String Headline,String SeoTitle,String Tags) throws IOException {
		if(createVH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Vhub****");
			createVH.sendKeyHeadlineElement(Headline);
			createVH.sendKeySeoTitleElement(SeoTitle);
			createVH.selectAudienceElement();
			createVH.sendKeyTagsElement(Tags);
			createVH.clickCreatePostElement();
			System.out.println("****创建Vhub成功****");
		}else {
			System.out.println("页面不存在");
		}
	}
	
}
