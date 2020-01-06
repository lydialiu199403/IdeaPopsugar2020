package popsugar.selenium.page;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class CreateGalleryPage extends BasePage{
	
	public String filename = "data/CreateGalleryElement.properties";

	public CreateGalleryPage(DriverBase driver) {
		super(driver);
	}
	
	//basic info页面
	
	/*获取create gallery的element*/
	public WebElement getCreateGalleryElement() throws IOException{
		return element(getByLocator.getLocator(filename, "CreateGallery"));
	}
	
	/**
	 * 获取表单Title的element
	 * @throws IOException 
	 * */
	public WebElement getTitleElement() throws IOException {
		return element(getByLocator.getLocator(filename,"Title"));
	}
	
	/**
	 * 获取SEO-Title的element
	 * @throws IOException 
	 * */
	public WebElement getSEOTitleElement() throws IOException {
		return element(getByLocator.getLocator(filename,"SeoTitle"));
	}
	
	/**
	 * 获取Intended audience的element
	 * @throws IOException 
	 * */
	public WebElement getIntendedAudienceElement() throws IOException {
		return element(getByLocator.getLocator(filename,"IntendedAudience"));
	}
	
	/**
	 * 获取main slide text 的element
	 * */
	public WebElement getMainSlideTextElement() throws IOException {
		return element(getByLocator.getLocator(filename,"MainSlideText"));
	}
	
	/*获取Tags的element*/	
	public WebElement getTagsElement() throws IOException {
		return element(getByLocator.getLocator(filename,"Tags"));
	}
	
	/*获取Hidden tags的 element*/
	public WebElement getHiddenTagsElement() throws IOException {
		return element(getByLocator.getLocator(filename,"HiddenTags"));
	}

	/*获取ProOptions的 element*/
	public WebElement getProOptionsElement () throws IOException {
		return element(getByLocator.getLocator(filename, "ProOptions"));
	}
	
	/*获取Paid for by label的 element*/
	public WebElement getPaidForByLabelElement () throws IOException {
		return element(getByLocator.getLocator(filename, "PaidForByLabel"));
	}
	
	/*获取PaidForByBrand的 element*/
	public WebElement getPaidForByBrandElement () throws IOException {
		return element(getByLocator.getLocator(filename, "PaidForByBrand"));
	}
	
	/*获取Add photo按钮 element*/
	public WebElement getAddPhotoElement() throws IOException {
		return element(getByLocator.getLocator(filename,"AddPhoto"));
	}

	//add photo页面
	
	/*获取Add files element*/
	public WebElement getAddFilesElement() throws IOException {
		return element(getByLocator.getLocator(filename,"AddFiles"));
	}
	
	/*获取reverse order element*/
	public WebElement getReverseOrderElement() throws IOException{
		return element(getByLocator.getLocator(filename, "Reverse"));
	}
	
	/*获取上传的图片的element，为了得到其value,getText*/
	public WebElement getPicValueElement() throws IOException{
		return element(getByLocator.getLocator(filename, "PicValue"));
	}
	
	/*获取上传的第一张图片的Item element*/
	public WebElement getFirstPicElement() throws IOException{
		return element(getByLocator.getLocator(filename, "PicItem"));
	}
	
	/*获取上传的第一张图片的删除button element*/
	public WebElement getFirstPicDelElement() throws IOException{
		return element(getByLocator.getLocator(filename, "PicDelete"));
	}
	
	/*获取点击删除后的弹出框上的 delete button element*/
	public WebElement getDelPicBtnElement() throws IOException{
		return element(getByLocator.getLocator(filename, "PicDelBtn"));
	}

	/*获取add photo页上传的第二张图片 element*/
	public WebElement getSecondPicElement() throws IOException{
		return element(getByLocator.getLocator(filename, "PicSecond"));
	}
	/*获取Done element*/
	public WebElement getDoneElement() throws IOException {
		return element(getByLocator.getLocator(filename,"Done"));
	}
	
	//edit photo页面
	/*获取edit photo整个页面的div id*/
	public List<WebElement> getPhotosEditElements() throws IOException{
		return driver.getElements(getByLocator.getLocator(filename,"edit"), getByLocator.getLocator(filename,"panel"));
		
	}

	/*获取edit photo标题element*/
	public WebElement getPicTitleElement() throws IOException {
		return element(getByLocator.getLocator(filename, "PicTitle"));
	}
	
	
	/*获取edit caption element*/
	public WebElement getPicCaptionElement() throws IOException{
		return element(getByLocator.getLocator(filename, "PicCaption"));
	}
	
	
	/*获取save gallery element*/
	public WebElement getSaveGalleryElement() throws IOException {
		return element(getByLocator.getLocator(filename,"SaveGallery"));
	}
}
