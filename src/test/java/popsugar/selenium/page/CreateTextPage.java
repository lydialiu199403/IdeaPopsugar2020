package popsugar.selenium.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import popsugar.selenium.util.getByLocator;

import java.io.IOException;

public class CreateTextPage extends BasePage{

	public String filename = "src/test/resources/CreateTextElement.properties";
	public CreateTextPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/*获取create Text的element*/
	public WebElement getCreateTextElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "CreateText"));
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
	
	/*获取Body的element*/
	public WebElement getBodyElement() throws IOException {
		return getElement(getByLocator.getLocator(filename, "Body"));
	}
	
	/*获取Body框HTML格式element*/
	public WebElement getBodyHtmlBtnElement() throws IOException {
		return getElement(getByLocator.getLocator(filename, "BodyHtmlBtn"));
	}
	
	/*获取Html Body的element*/
	public WebElement getHtmlBodyElement() throws IOException {
		return getElement(getByLocator.getLocator(filename, "HtmlBody"));
	}
	
	/*获取Tags的element*/	
	public WebElement getTagsElement() throws IOException {
		return getElement(getByLocator.getLocator(filename,"Tags"));
	}
	
	/*获取Hidden tags的 element*/
	public WebElement getHiddenTagsElement() throws IOException {
		return getElement(getByLocator.getLocator(filename,"HiddenTags"));
	}
	
	/*获取 photo source element*/
	public WebElement getPicSourceElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"PicSource"));
	}
	
	/*获取photo source URL element*/
	public WebElement getPicSourceUrlElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"PicSourceUrl"));
	}
	
	/*获取upload image element*/
	public WebElement getUploadImageElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"UploadImage"));
	}
	
	/*获取upload image后选择checkbox element*/
	public WebElement getThumbnailCheckboxElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"ThumbnailCheckbox"));
	}
	public WebElement getFrontPageCheckboxElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"FrontPageCheckbox"));
	}
	public WebElement getTallImageCheckboxElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"TallImageCheckbox"));
	}
	public WebElement getFacebookCheckboxElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"FacebookCheckbox"));
	}
	public WebElement getPinterestCheckboxElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"PinterestCheckbox"));
	}
	public WebElement getTwitterCheckboxElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"TwitterCheckbox"));
	}
	
	/*获取upload image后选择框的Done element*/
	public WebElement getUploadDoneElement() throws IOException{
		return getElement(getByLocator.getLocator(filename,"UploadDone"));
	}
	
	/*获取Create Post 的element*/
	public WebElement getCreatePostElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "CreatePost"));
	}
	

	//Assert
	/*edit页面获取各个Upload image element*/
	public WebElement getThumbnailDisplayElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "ThumbnailDisplay"));
	}
	//
	public WebElement getFrontPageDisplayElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "FrontPageDisplay"));
	}
	public WebElement getTallImageDisplayElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "TallImageDisplay"));
	}
	public WebElement getFacebookImageDisplayElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "FacebookImageDisplay"));
	}
	public WebElement getPinterestImageDisplayElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "PinterestImageDisplay"));
	}
	public WebElement getTwitterImageDisplayElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "TwitterImageDisplay"));
	}
}
