package popsugar.selenium.page;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CreateRecipePage extends BasePage{

	public String filename = "data/CreateRecipeElement.properties";
	public CreateRecipePage(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/*获取create recipe标题的element*/
	public WebElement getCreateRecipeElement() throws IOException{
		return element(getByLocator.getLocator(filename, "CreateRecipe"));
	}
	
	/*获取headline的element*/
	public WebElement getHeadlineElement() throws IOException {
		return element(getByLocator.getLocator(filename,"Headline"));
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
	
	/*获取Body的element*/
	public WebElement getBodyElement() throws IOException {
		return element(getByLocator.getLocator(filename, "Body"));
	}
	
	/*获取Recipe Source的element*/
	public WebElement getRecipeSourceElement() throws IOException{
		return element(getByLocator.getLocator(filename, "RecipeSource"));
	}
	
	/*获取Ingredients的element*/
	public WebElement getIngredientsElement() throws IOException{
		return element(getByLocator.getLocator(filename, "Ingredients"));
	}
	
	/*获取Directions的element*/
	public WebElement getDirectionsElement() throws IOException{
		return element(getByLocator.getLocator(filename, "Directions"));
	}
	
	/*获取RecipeCategory的element*/
	public WebElement getRecipeCategoryElement() throws IOException{
		return element(getByLocator.getLocator(filename, "RecipeCategory"));
	}
	
	
	/*获取Tags的element*/	
	public WebElement getTagsElement() throws IOException {
		return element(getByLocator.getLocator(filename,"Tags"));
	}
	
	/*获取Create Post 的element*/
	public WebElement getCreatePostElement() throws IOException{
		return element(getByLocator.getLocator(filename, "CreatePost"));
	}
}
