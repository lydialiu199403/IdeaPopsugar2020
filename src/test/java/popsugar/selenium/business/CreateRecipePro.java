package popsugar.selenium.business;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.handle.CreateRecipeHandle;

import java.io.IOException;

public class CreateRecipePro {

	public DriverBase driver;
	public CreateRecipeHandle createRH;
	
	public CreateRecipePro(DriverBase driver) {
		this.driver = driver;
		createRH = new CreateRecipeHandle(driver);
	}	
	
	/*创建Recipe post*/
	public void createRecipe(String Headline,String SeoTitle,String Body,String RecipeSource,String Ingredients, String Directions,String Tags) throws IOException {
		if(createRH.assertIsNewCreatePage()) {
			System.out.println("****开始创建Recipe****");
			createRH.sendKeyHeadlineElement(Headline);
			createRH.sendKeySeoTitleElement(SeoTitle);
			createRH.selectAudienceElement();
			createRH.sendKeyBodyElement(Body);
			createRH.sendKeyRecipeSourceElement(RecipeSource);
			createRH.sendKeyIngredientsElement(Ingredients);
			createRH.sendKeyDirectionsElement(Directions);
			createRH.selectRecipeCategoryElement();
			createRH.sendKeyTagsElement(Tags);
			createRH.clickCreatePostElement();
			System.out.println("****创建Recipe成功****");
		}else {
			System.out.println("页面不存在");
		}
	}
	
}
