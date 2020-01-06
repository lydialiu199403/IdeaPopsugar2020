package casefortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;



public class testScroll {

	@BeforeClass
	public void beforeClass() {
		System.out.println("用例前执行打印本句！");
		System.out.println("每条Test用例是互不相干的");
		System.out.println("用例开始执行…………");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("用例结束后运行");
	}
	@Test
	public void actions() {
		//设置驱动所在位置
		System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\chromedriver\\chromedriver.exe");
		//引用火狐浏览器驱动
		WebDriver driver = new ChromeDriver();
		//打开禅道界面
		driver.get("http://www.baidu.com");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,800)");
		//关闭浏览器进程及驱动
//		driver.close();

	}

}