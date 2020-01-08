package popsugar.selenium.testCase;

//import com.popsugar.selenium.base.DriverBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import popsugar.selenium.business.CreateRecipePro;
import popsugar.selenium.util.HandleCookie;
import popsugar.selenium.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCreateRecipe extends CaseBase{

	public WebDriver driver;
	public CreateRecipePro createRP;
	public ProUtil pro;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = getDriver("chrome");
		createRP = new CreateRecipePro(driver);
		pro = new ProUtil("src/test/resources/CreateRecipeData.properties");
		handleCookie = new HandleCookie(driver);
//		driver.get("https://popsugar.dev10.onsugar.com");
		driver.get(pro.getPro("URL"));
		driver.manage().window().maximize();
		handleCookie.setCookie();
		Thread.sleep(3000);
		driver.get(pro.getPro("CreateRecipeURL"));
		Thread.sleep(5000);
	}
	
	@Test
	public void createTextTest() throws IOException {
		createRP.createRecipe(pro.getPro("Headline"),pro.getPro("SeoTitle")+System.nanoTime(), pro.getPro("Body"),pro.getPro("RecipeSource"),pro.getPro("Ingredients"),pro.getPro("Directions"), pro.getPro("Tags"));
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
}
