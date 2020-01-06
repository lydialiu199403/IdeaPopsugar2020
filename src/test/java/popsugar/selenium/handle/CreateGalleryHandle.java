package popsugar.selenium.handle;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.page.CreateGalleryPage;
import com.popsugar.selenium.page.GalleryPostPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CreateGalleryHandle {
	public DriverBase driver;
	public CreateGalleryPage createGP;
	public GalleryPostPage galleryPP;
	
	public CreateGalleryHandle(DriverBase driver) {
		this.driver = driver;
		createGP = new CreateGalleryPage(driver);
		galleryPP = new GalleryPostPage(driver);
	}
	
	/*输入标题Title*/
	public void sendKeyTitleElement(String Title) throws IOException {
		driver.sendKeys(createGP.getTitleElement(), Title);
	}
	
	/*输入Seo title*/
	public void sendKeySeoTitleElement(String SeoTitle) throws IOException {
		driver.sendKeys(createGP.getSEOTitleElement(), SeoTitle);
	}
	
	/*选择Intended Audience*/
	public void selectAudienceElement() throws IOException {
		Select select = new Select(createGP.getIntendedAudienceElement());
		select.selectByIndex(3);
	}
	
	/*输入MainSlideText*/
	public void sendKeyMainSlideTextElement(String MainSlideText) throws IOException{
		driver.sendKeys(createGP.getMainSlideTextElement(), MainSlideText);
	}
	
	/*输入Tags*/
	public void sendKeyTagsElement(String Tags) throws IOException {
		driver.sendKeys(createGP.getTagsElement(), Tags);
	}
	
	/*输入Hidden tags*/
	public void sendKeyHiddenTagsElement(String HiddenTags) throws IOException {
		driver.sendKeys(createGP.getHiddenTagsElement(), HiddenTags);
	}
	
	/*点击Pro Options按钮*/
	public void clickProOptionsElement() throws IOException {
		driver.click(createGP.getProOptionsElement());
	}
	
	/*输入paid for by label*/
	public void sendkeyPaidForByLabelElement(String PaidForByLabel) throws IOException {
		driver.sendKeys(createGP.getPaidForByLabelElement(), PaidForByLabel);
	}
	
	/*输入paid for by brand*/
	public void sendkeyPPaidForByBrandElement(String PaidForByBrand) throws IOException {
		driver.sendKeys(createGP.getPaidForByBrandElement(), PaidForByBrand);
	}
	
	/*点击Add Photo按钮*/
	public void clickAddPhotoElement() throws IOException {
		driver.click(createGP.getAddPhotoElement());
	}
		
	/*点击Add Files按钮，上传图片*/
	public void clickAddFilesElement(String photopath) throws IOException {
		createGP.getAddFilesElement().sendKeys(photopath);
	}
	
	/*点击Add Files按钮，上传多张图片*/
	public void clickAddMulFilesElement(String photopath) throws IOException {
		for(int i=1;i<=4;i++) {
			createGP.getAddFilesElement().sendKeys(photopath);
			i=i+1;
		}
	}
	
	/*点击 reverse order，颠倒图片顺序*/
	public void clickReverseOrderElement() throws IOException {
		driver.click(createGP.getReverseOrderElement());
	}
	
	/*鼠标移动到第一张图片上*/
	public void moveToFirstPicElement() throws IOException{
		Actions action = new Actions(driver.driver);
		action.moveToElement(createGP.getFirstPicElement()).perform();
	}
	
	
	/*点击删除第一张图片*/
	public void clickDelFirstPicElement() throws IOException, InterruptedException{
		driver.click(createGP.getFirstPicDelElement());
		Thread.sleep(3000);
		driver.click(createGP.getDelPicBtnElement());
	}
	/*点击Done按钮，跳转至下一页*/
	public void clickDoneElement() throws IOException{
		driver.click(createGP.getDoneElement());
	}
	
	//edit photo页面
	
	/*得到所有photo的id值
	public void getPhotoIdValue() throws IOException {
		List<WebElement> elements = createGP.getPhotosEditElements();
		ArrayList<String> list = new ArrayList<String>();	
		for(WebElement element:elements) {	
			list.add(element.getAttribute("id"));	
			
		}		
	}*/
	
	/*输入第一张图片的photo title*/
	public void sendkeyPicTitleElement(String picTitle) throws IOException {
		driver.sendKeys(createGP.getPicTitleElement(), picTitle);
	}
	/*输入第一张图片的caption*/
	public void sendkeyPicCaptionElement(String picCaption) throws IOException{
		driver.sendKeys(createGP.getPicCaptionElement(), picCaption);
	}
	/*点击save按钮，提交post*/
	public void clickSaveGalleryElement() throws IOException{
		driver.click(createGP.getSaveGalleryElement());
	}
	
	//assert方法
	
	/*判断是否是create gallery页面*/
	public boolean assertIsNewCreatePage() throws IOException {
		return createGP.assertElementIsDisPlay(createGP.getCreateGalleryElement());
	}
	
	/*判断创建gallery是否成功，通过判断创建后页面上是否有start slide按钮*/
	public boolean assertGalleryPostPage() throws IOException {
		return driver.assertElementIs(galleryPP.getStartSlideElement());
	}
	
	/*判断创建gallery是否成功，通过判断创建后页面上是否有shoppable icon按钮*/
	public boolean assertGalleryShoppablePage() throws IOException {
		return driver.assertElementIs(galleryPP.getShoppableElement());
	}
	
	/*判断创建多张gallery图片是否成功，通过判断创建后页面上image-thumb图片张数是否大于1*/
	public int assertMulPicPage() throws IOException {
		int listNum = galleryPP.getThumbImageElement().size();
		System.out.println(listNum);
		return listNum;	
	}
	
	/*判断在add photo页面reverse order是否成功*/
	public String assertReverseOrder() throws IOException {
		return createGP.getPicValueElement().getText();
	}
	
	/*判断删除第一张图片是否成功，通过判断页面是否能找到第二张图片*/
	public boolean assertDelPic() throws IOException{
		return driver.assertElementIs(createGP.getSecondPicElement());
	}
	
	
	/*判断页面上是否有Hybrid*/
	public boolean assertGalleryHybridPage() throws IOException {
		return driver.assertElementIs(galleryPP.getHybridElement());
	}
	
}
