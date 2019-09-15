package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class Example5 {
	
	static WebDriver dv ;
	@BeforeMethod
	public static void Setup(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		dv = new ChromeDriver();
		dv.get("http://www.google.com");
		dv.manage().window().maximize();
	}
	
	@Test
	public static void logintest(){
		String s = dv.getTitle();
		System.out.println(s);
		
		Assert.assertEquals(s,"Google");
	}
	
	@Test
	public static void logotest(){
	boolean  b = dv.findElement(By.id("hplogo")).isDisplayed();
	
	Assert.assertTrue(b,"logo displayed");
	}
	
	@Test
	public static void linktest(){
		boolean c = dv.findElement(By.linkText("Gmail")).isDisplayed();
		
		Assert.assertTrue(c,"link displayed");
	}
	
	@AfterMethod
	public static void teardown(){
		dv.quit();
	}
}
