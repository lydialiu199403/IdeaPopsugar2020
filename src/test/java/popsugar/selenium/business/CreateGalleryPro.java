package popsugar.selenium.business;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.handle.CreateGalleryHandle;

import java.io.IOException;

public class CreateGalleryPro {
	public DriverBase driver;
	public CreateGalleryHandle createGH;
	
	public CreateGalleryPro(DriverBase driver) {
		this.driver = driver;
		createGH = new CreateGalleryHandle(driver);
	}
	
	/*创建gallery post*/
	public void createGallery(String Title,String SeoTitle,String Tags,String photopath) throws IOException, InterruptedException {
		if(createGH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Gallery****");
			createGH.sendKeyTitleElement(Title);
			createGH.sendKeySeoTitleElement(SeoTitle+System.nanoTime());
			createGH.selectAudienceElement();
	//		createGH.sendKeyMainSlideTextElement(MainSlideText);
			createGH.sendKeyTagsElement(Tags);
			createGH.clickAddPhotoElement();
			Thread.sleep(3000);
			createGH.clickAddFilesElement(photopath);
			Thread.sleep(3000);
			createGH.clickDoneElement();
			Thread.sleep(2000);
			createGH.clickSaveGalleryElement();
		}else {
			System.out.println("创建gallery页面不存在");
		}
	}
	
	/*判断是否创建成功*/
	public void assertCreateGallery() throws IOException {
		if(createGH.assertGalleryPostPage()) {
			System.out.println("Gallery创建成功");
		}else {
			System.out.println("Gallery创建失败");
		}
	}
}
