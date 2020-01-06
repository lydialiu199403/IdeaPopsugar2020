package popsugar.selenium.business;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.handle.CreateGalleryHandle;

import java.io.IOException;

public class CreateGalleryHybridPro {

	public DriverBase driver;
	public CreateGalleryHandle createGH;
	
	public CreateGalleryHybridPro(DriverBase driver) {
		/*this.driver = driver;*/
		this.driver = driver;
		createGH = new CreateGalleryHandle(driver);
	}
	
	public void createGalleryHybrid(String Title,String SeoTitle,String Tags,String PaidForByLabel, String PaidForByBrand, String photopath) throws IOException, InterruptedException {
		if(createGH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Gallery****");
			createGH.sendKeyTitleElement(Title);
			createGH.sendKeySeoTitleElement(SeoTitle+System.nanoTime());
			createGH.selectAudienceElement();
			createGH.sendKeyTagsElement(Tags);
			createGH.clickProOptionsElement();
			Thread.sleep(3000);
			createGH.sendkeyPaidForByLabelElement(PaidForByLabel);
			createGH.sendkeyPPaidForByBrandElement(PaidForByBrand);
			createGH.clickAddPhotoElement();
			Thread.sleep(3000);
			createGH.clickAddMulFilesElement(photopath);
			Thread.sleep(10000);
			createGH.clickDoneElement();
			Thread.sleep(2000);
			createGH.clickSaveGalleryElement();
		}else {
			System.out.println("创建gallery页面不存在");
		}
	}
	
	/*判断是否创建成功*/
	public void assertCreateGallery() throws IOException {
		if(createGH.assertGalleryHybridPage()) {
			System.out.println("Hybrid Gallery创建成功");
		}else {
			System.out.println("Hybrid Gallery创建失败");
		}
	}
}
