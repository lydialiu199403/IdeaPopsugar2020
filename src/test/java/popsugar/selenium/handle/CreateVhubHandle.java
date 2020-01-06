package popsugar.selenium.handle;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.page.CreateVhubPage;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CreateVhubHandle {

	public DriverBase driver;
	public CreateVhubPage createVP;
	public CreateVhubHandle(DriverBase driver) {
		this.driver = driver;
		createVP = new CreateVhubPage(driver);
	}
	
	/*判断是否是create text页面*/
	public boolean assertIsNewCreatePage() throws IOException {
		return createVP.assertElementIsDisPlay(createVP.getCreateVhubElement());
	}
	
	/*输入Headline*/
	public void sendKeyHeadlineElement(String Headline) throws IOException {
		driver.sendKeys(createVP.getHeadlineElement(), Headline);
	}
	
	/*输入Seo title*/
	public void sendKeySeoTitleElement(String SeoTitle) throws IOException {
		driver.sendKeys(createVP.getSEOTitleElement(), SeoTitle);
	}
	
	/*选择Intended Audience*/
	public void selectAudienceElement() throws IOException {
		Select select = new Select(createVP.getIntendedAudienceElement());
		select.selectByIndex(3);
	}
	
	/*输入Tags*/
	public void sendKeyTagsElement(String Tags) throws IOException {
		driver.sendKeys(createVP.getTagsElement(), Tags);
	}
	
	/*点击Create post 按钮*/
	public void clickCreatePostElement() throws IOException {
		driver.click(createVP.getCreatePostElement());
	}
}
