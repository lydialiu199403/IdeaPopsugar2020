package popsugar.selenium.page;


import org.openqa.selenium.WebDriver;
import popsugar.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class GalleryPostPage extends BasePage{
	
	public String filename = "src/test/resources/GalleryPostElement.properties";
	
	public GalleryPostPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/*获取Start Slideshow按钮element*/
	public WebElement getStartSlideElement() throws IOException {
		return getElement(getByLocator.getLocator(filename, "StartSlide"));
	}
	
	/*获取shoppable 按钮element*/
	public WebElement getShoppableElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "ShoppableIcon"));
	}
	
	/*获取image-thumb element*/
	public List<WebElement> getThumbImageElement() throws IOException{
		
		return elements(getByLocator.getLocator(filename,"ImageThumb"));
	}
	
	/*获取Hybrid element*/
	public WebElement getHybridElement() throws IOException{
		return getElement(getByLocator.getLocator(filename, "HybridBrand"));
	}
	

}
