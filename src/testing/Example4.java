package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example4 {
	
	static WebDriver dv;
	@Test(invocationCount = 10)
	public static void login(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		dv = new ChromeDriver();
		dv.manage().window().maximize();
		dv.get("http://www.google.com");
		dv.quit();
	}

}
