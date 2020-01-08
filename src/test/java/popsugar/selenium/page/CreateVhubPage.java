package popsugar.selenium.page;


import org.openqa.selenium.WebDriver;
import popsugar.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CreateVhubPage extends BasePage{

	public String filename = "src/test/resources/CreateVhubElement.properties";
	public CreateVhubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/*获取create vhub的element*/
	public WebElement getCreateVhubElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "CreateVhub"));
	}
	
	/*获取headline的element*/
	public WebElement getHeadlineElement() throws IOException {
		return getElement(getByLocator.getLocator(filename,"Headline"));
	}
	
	/**
	 * 获取SEO-Title的element
	 * @throws IOException 
	 * */
	public WebElement getSEOTitleElement() throws IOException {
		return getElement(getByLocator.getLocator(filename,"SeoTitle"));
	}
	
	/**
	 * 获取Intended audience的element
	 * @throws IOException 
	 * */
	public WebElement getIntendedAudienceElement() throws IOException {
		return getElement(getByLocator.getLocator(filename,"IntendedAudience"));
	}
	
	
	/*获取Tags的element*/	
	public WebElement getTagsElement() throws IOException {
		return getElement(getByLocator.getLocator(filename,"Tags"));
	}
	
	/*获取Create Post 的element*/
	public WebElement getCreatePostElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "CreatePost"));
	}

}
