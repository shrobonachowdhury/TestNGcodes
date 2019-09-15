package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example2 {
	
	static WebDriver dv ;
	
	@BeforeMethod
	public static void setup(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		dv = new ChromeDriver();
		dv.get("http://www.google.com");
		dv.manage().window().maximize();
		dv.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dv.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	
	@Test(priority=3,groups="title")
	public static void testtitle(){
		String s = dv.getTitle();
		System.out.println(s);
	}
	
	@Test(priority=1,groups="logo")
	public static void testlogo(){
		boolean b = dv.findElement(By.xpath("//div[@class='ddlv-a']")).isDisplayed();
	}
	@Test(priority=2,groups="title")
	public static void testcontent(){
		boolean b = dv.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public static void teardown(){
		dv.quit();
	}
}
