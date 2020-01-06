package popsugar.selenium.handle;


import org.openqa.selenium.WebDriver;
import popsugar.selenium.page.CreateTextPage;
import popsugar.selenium.page.GalleryPostPage;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CreateTextHandle {

	public WebDriver driver;
	public CreateTextPage createTP;
	public GalleryPostPage galleryPP;
	public CreateTextHandle(WebDriver driver) {
		this.driver = driver;
		createTP = new CreateTextPage(driver);
		galleryPP = new GalleryPostPage(driver);
	}
	
	/*判断是否是create text页面*/
	public boolean assertIsNewCreatePage() throws IOException {
		return createTP.assertElementIsDisPlay(createTP.getCreateTextElement());
	}
	
	/*输入Headline*/
	public void sendKeyHeadlineElement(String Headline) throws IOException {
		driver.sendKeys(createTP.getHeadlineElement(), Headline);
	}
	
	/*输入Seo title*/
	public void sendKeySeoTitleElement(String SeoTitle) throws IOException {
		driver.sendKeys(createTP.getSEOTitleElement(), SeoTitle);
	}
	
	/*选择Intended Audience*/
	public void selectAudienceElement() throws IOException {
		Select select = new Select(createTP.getIntendedAudienceElement());
		select.selectByIndex(3);
	}
	
	/*输入Body Text*/
	public void sendKeyBodyElement(String Body) throws IOException{
		driver.sendKeys(createTP.getBodyElement(), Body);
	}
	
	/*点击Body内HTML按钮*/
	public void clickBodyHtmlBtnElement() throws IOException{
		driver.click(createTP.getBodyHtmlBtnElement());
	}
	
	/*输入Body*/
	public void sendKeyHtmlBodyElement(String HtmlBody) throws IOException{
		driver.sendKeys(createTP.getHtmlBodyElement(), HtmlBody);
	}
	
	/*输入Tags*/
	public void sendKeyTagsElement(String Tags) throws IOException {
		driver.sendKeys(createTP.getTagsElement(), Tags);
	}
	
	/*输入Hidden tags*/
	public void sendKeyHiddenTagsElement(String HiddenTags) throws IOException {
		driver.sendKeys(createTP.getHiddenTagsElement(), HiddenTags);
	}
	
	/*页面滚动至photo source处*/
	public void scrollToPicSource() throws IOException {
		driver.scrollToElement(createTP.getPicSourceElement());
	}
	
	/*输入 photo source*/
	public void sendKeyPicSourceElement(String PicSource) throws IOException {
		driver.sendKeys(createTP.getPicSourceElement(), PicSource);
	}
	
	/*输入 photo source*/
	public void sendKeyPicSourceUrlElement(String PicSourceUrl) throws IOException {
		driver.sendKeys(createTP.getPicSourceUrlElement(), PicSourceUrl);
	}
	
	/*点击upload image button，上传图片*/
	public void clickUploadImageElement(String photopath) throws IOException {
		createTP.getUploadImageElement().sendKeys(photopath);
	}
	
	/*点击upload image后选择Thumbnail checkbox*/
	public void clickThumbnailCheckboxElement() throws IOException {
		driver.click(createTP.getThumbnailCheckboxElement());
	}
	public void clickFrontPageCheckboxElement() throws IOException {
		driver.click(createTP.getFrontPageCheckboxElement());
	}
	public void clickTallImageCheckboxElement() throws IOException {
		driver.click(createTP.getTallImageCheckboxElement());
	}
	public void clickFacebookCheckboxElement() throws IOException {
		driver.click(createTP.getFacebookCheckboxElement());
	}
	public void clickPinterestCheckboxElement() throws IOException {
		driver.click(createTP.getPinterestCheckboxElement());
	}
	public void clickTwitterCheckboxElement() throws IOException {
		driver.click(createTP.getTwitterCheckboxElement());
	}
	
	/*点击upload image后Done按钮*/
	public void clickUploadDoneElement() throws IOException{
		driver.click(createTP.getUploadDoneElement());
	}
	
	/*点击Create post 按钮*/
	public void clickCreatePostElement() throws IOException {
		driver.click(createTP.getCreatePostElement());
	}
	
	/*判断页面上是否有Upload image*/
	public boolean assertThumbnailDisplayPage() throws IOException {
		return driver.assertElementIs(createTP.getThumbnailDisplayElement());
	}
	public boolean assertFrontPageDisplayPage() throws IOException {
		return driver.assertElementIs(createTP.getFrontPageDisplayElement());
	}
	public boolean assertTallImageDisplayPage() throws IOException {
		return driver.assertElementIs(createTP.getTallImageDisplayElement());
	}
	public boolean assertFacebookImageDisplayPage() throws IOException {
		return driver.assertElementIs(createTP.getFacebookImageDisplayElement());
	}
	public boolean assertPinterestImageDisplayPage() throws IOException {
		return driver.assertElementIs(createTP.getPinterestImageDisplayElement());
	}
	public boolean assertTwitterImageDisplayPage() throws IOException {
		return driver.assertElementIs(createTP.getTwitterImageDisplayElement());
	}
}
