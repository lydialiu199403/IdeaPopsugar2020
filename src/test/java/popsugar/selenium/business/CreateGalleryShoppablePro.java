package popsugar.selenium.business;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.handle.CreateGalleryHandle;

import java.io.IOException;

public class CreateGalleryShoppablePro {
	public DriverBase driver;
	public CreateGalleryHandle createGH;
	
	public CreateGalleryShoppablePro(DriverBase driver) {
		this.driver = driver;
		createGH = new CreateGalleryHandle(driver);
	}
	
	/*创建gallery post*/
	public void createGalleryShoppable(String Title,String SeoTitle,String Tags,String HiddenTags,String photopath,String picTitle,String picCaption) throws IOException, InterruptedException {
		if(createGH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Gallery****");
			createGH.sendKeyTitleElement(Title);
			createGH.sendKeySeoTitleElement(SeoTitle+System.nanoTime());
			createGH.selectAudienceElement();
			createGH.sendKeyTagsElement(Tags);
			createGH.sendKeyHiddenTagsElement(HiddenTags);
			createGH.clickAddPhotoElement();
			Thread.sleep(3000);
			createGH.clickAddFilesElement(photopath);
			Thread.sleep(8000);
			createGH.clickDoneElement();
			Thread.sleep(2000);
			createGH.sendkeyPicTitleElement(picTitle);
			createGH.sendkeyPicCaptionElement(picCaption);
			Thread.sleep(2000);
			createGH.clickSaveGalleryElement();
		}else {
			System.out.println("创建gallery页面不存在");
		}
	}
	
	/*判断是否创建成功*/
	public void assertCreateGalleryShoppable() throws IOException{
	/*	try {
			Assert.assertTrue(createGH.assertGalleryShoppablePage());
			System.out.println("Shoppable Gallery创建成功");
		}catch(Exception e) {
			System.out.println("Shoppable Gallery创建失败");
			e.printStackTrace();
		}*/
		if(createGH.assertGalleryShoppablePage()) {
			System.out.println("Shoppable Gallery创建成功");
		}else {
			System.out.println("Shoppable Gallery创建失败");
		}
//		createGH.assertGalleryShoppablePage();
	}
}
