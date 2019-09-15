package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example6 {
	static WebDriver dv;
	@Test
	@Parameters({"browser","url","username","password"})
	
	public static void validation(String browser,String url,String username,String password){
		if(browser.contains("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\chromedriver.exe");
		dv = new ChromeDriver();
		}
		else if(browser.contains("FF")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\workspace\\ExtLib\\geckodriver.exe");
			dv = new FirefoxDriver();	
		}
		dv.manage().window().maximize();
		dv.get(url);
		dv.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		dv.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dv.manage().deleteAllCookies();
		dv.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		dv.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		dv.findElement(By.xpath("//input[@value='Login']")).click();
		
		
	}

}
