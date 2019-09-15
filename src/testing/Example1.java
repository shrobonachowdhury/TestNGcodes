package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 {
	
	@BeforeSuite
	public void test1(){
		System.out.println("i am in test1");
	}
	
	@BeforeTest
	public void test2(){
		System.out.println("i am in test2");
	}
	
	@BeforeClass
	public void test3(){
		System.out.println("i am in test3");
	}
	
	@BeforeMethod
	public void test4(){
		System.out.println("i am in test4");
	}
	
	@Test
	public static void test5(){
		System.out.println("i am in test5");
	}
	
	@AfterMethod
	public static void test6(){
		System.out.println("i am in test6");
	}
	
	@AfterClass
	public static void test7(){
		System.out.println("i am in test7");
	}
	
	@AfterTest
	public static void test8(){
		System.out.println("i am in test8");
	}
}
