package popsugar.selenium.handle;

//import com.popsugar.selenium.base.DriverBase;
import popsugar.selenium.page.CreateRecipePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CreateRecipeHandle {

	public WebDriver driver;
	public CreateRecipePage createRP;
	public CreateRecipeHandle(WebDriver driver) {
		this.driver = driver;
		createRP = new CreateRecipePage(driver);
	}
	
	/*判断是否是create Recipe页面*/
	public boolean assertIsNewCreatePage() throws IOException {
		return createRP.assertElementIsDisPlay(createRP.getCreateRecipeElement());
	}
	
	/*输入Headline*/
	public void sendKeyHeadlineElement(String Headline) throws IOException {
		createRP.sendKeys(createRP.getHeadlineElement(), Headline);
	}
	
	/*输入Seo title*/
	public void sendKeySeoTitleElement(String SeoTitle) throws IOException {
		createRP.sendKeys(createRP.getSEOTitleElement(), SeoTitle);
	}
	
	/*选择Intended Audience*/
	public void selectAudienceElement() throws IOException {
		Select select = new Select(createRP.getIntendedAudienceElement());
		select.selectByIndex(3);
	}
	
	/*输入Body Text*/
	public void sendKeyBodyElement(String Body) throws IOException{
		createRP.sendKeys(createRP.getBodyElement(), Body);
	}
	
	
	/*输入RECIPE SOURCE */
	public void sendKeyRecipeSourceElement(String RecipeSource) throws IOException{
		createRP.sendKeys(createRP.getRecipeSourceElement(), RecipeSource);
	} 
	
	/*输入Ingredients */
	public void sendKeyIngredientsElement(String Ingredients) throws IOException{
		createRP.sendKeys(createRP.getIngredientsElement(), Ingredients);
	} 
	
	/*输入Directions */
	public void sendKeyDirectionsElement(String Directions) throws IOException{
		createRP.sendKeys(createRP.getDirectionsElement(), Directions);
	} 
	
	/*选择Recipe Category*/
	public void selectRecipeCategoryElement() throws IOException {
		Select select = new Select(createRP.getRecipeCategoryElement());
		select.selectByIndex(3);
	}
	
	/*输入Tags*/
	public void sendKeyTagsElement(String Tags) throws IOException {
		createRP.sendKeys(createRP.getTagsElement(), Tags);
	}
	
	/*点击Create post 按钮*/
	public void clickCreatePostElement() throws IOException {
		createRP.click(createRP.getCreatePostElement());
	}
}
