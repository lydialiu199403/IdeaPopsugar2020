package popsugar.selenium.business;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.WebDriver;
import popsugar.selenium.handle.CreateGalleryHandle;
import junit.framework.Assert;

import java.io.IOException;

public class CreateGalleryDelPicPro {
	public WebDriver driver;
	public CreateGalleryHandle createGH;
	
	public CreateGalleryDelPicPro(WebDriver driver) {
		this.driver = driver;
		createGH = new CreateGalleryHandle(driver);
	}
	
	/*创建gallery post*/
	public void createGalleryDelPic(String Title,String SeoTitle,String Tags,String photopath) throws IOException, InterruptedException {
		if(createGH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Gallery****");
			createGH.sendKeyTitleElement(Title);
			createGH.sendKeySeoTitleElement(SeoTitle+System.nanoTime());
			createGH.selectAudienceElement();
			createGH.sendKeyTagsElement(Tags);
			createGH.clickAddPhotoElement();
			Thread.sleep(3000);
			createGH.clickAddMulFilesElement(photopath);
			Thread.sleep(10000);
			createGH.moveToFirstPicElement();
			Thread.sleep(2000);
			createGH.clickDelFirstPicElement();
			//验证是否成功
			try {
			Assert.assertTrue(createGH.assertDelPic());
			System.out.println("删除第一张图片成功");
			}catch(Exception e){
				System.out.println("删除第一张图片失败");
			}
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
