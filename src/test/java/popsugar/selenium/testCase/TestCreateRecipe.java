package popsugar.selenium.testCase;

import com.popsugar.selenium.base.DriverBase;
import com.popsugar.selenium.business.CreateRecipePro;
import com.popsugar.selenium.util.HandleCookie;
import com.popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateRecipe extends CaseBase{

	public DriverBase driver;
	public CreateRecipePro createRP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = InitialDriver("chrome");
		createRP = new CreateRecipePro(driver);
		pro = new ProUtil("data/CreateRecipeData.properties");
		handleCookie = new HandleCookie(driver);
		driver.get("https://popsugar.dev10.onsugar.com");
		driver.maxWindow();
		handleCookie.setCookie();
		Thread.sleep(3000);
		driver.get(pro.getPro("CreateRecipeURL"));
		Thread.sleep(5000);
	}
	
	@Test
	public void createTextTest() throws IOException {
		createRP.createRecipe(pro.getPro("Headline"),pro.getPro("SeoTitle")+System.nanoTime(), pro.getPro("Body"),pro.getPro("RecipeSource"),pro.getPro("Ingredients"),pro.getPro("Directions"), pro.getPro("Tags"));
	}
	
	/*@AfterClass
	public void close() {
		driver.close();
	}*/
}
