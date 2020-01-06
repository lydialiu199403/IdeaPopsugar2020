package popsugar.selenium.handle;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.page.CreateRecipePage;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CreateRecipeHandle {

	public DriverBase driver;
	public CreateRecipePage createRP;
	public CreateRecipeHandle(DriverBase driver) {
		this.driver = driver;
		createRP = new CreateRecipePage(driver);
	}
	
	/*判断是否是create Recipe页面*/
	public boolean assertIsNewCreatePage() throws IOException {
		return createRP.assertElementIsDisPlay(createRP.getCreateRecipeElement());
	}
	
	/*输入Headline*/
	public void sendKeyHeadlineElement(String Headline) throws IOException {
		driver.sendKeys(createRP.getHeadlineElement(), Headline);
	}
	
	/*输入Seo title*/
	public void sendKeySeoTitleElement(String SeoTitle) throws IOException {
		driver.sendKeys(createRP.getSEOTitleElement(), SeoTitle);
	}
	
	/*选择Intended Audience*/
	public void selectAudienceElement() throws IOException {
		Select select = new Select(createRP.getIntendedAudienceElement());
		select.selectByIndex(3);
	}
	
	/*输入Body Text*/
	public void sendKeyBodyElement(String Body) throws IOException{
		driver.sendKeys(createRP.getBodyElement(), Body);
	}
	
	
	/*输入RECIPE SOURCE */
	public void sendKeyRecipeSourceElement(String RecipeSource) throws IOException{
		driver.sendKeys(createRP.getRecipeSourceElement(), RecipeSource);
	} 
	
	/*输入Ingredients */
	public void sendKeyIngredientsElement(String Ingredients) throws IOException{
		driver.sendKeys(createRP.getIngredientsElement(), Ingredients);
	} 
	
	/*输入Directions */
	public void sendKeyDirectionsElement(String Directions) throws IOException{
		driver.sendKeys(createRP.getDirectionsElement(), Directions);
	} 
	
	/*选择Recipe Category*/
	public void selectRecipeCategoryElement() throws IOException {
		Select select = new Select(createRP.getRecipeCategoryElement());
		select.selectByIndex(3);
	}
	
	/*输入Tags*/
	public void sendKeyTagsElement(String Tags) throws IOException {
		driver.sendKeys(createRP.getTagsElement(), Tags);
	}
	
	/*点击Create post 按钮*/
	public void clickCreatePostElement() throws IOException {
		driver.click(createRP.getCreatePostElement());
	}
}
