package testing;

import org.testng.annotations.Test;

public class Example3 {
	
	@Test()
	public static void googlesearch(){
		System.out.println("googlesearch");
		int i =9/0;
	
	}
	@Test(dependsOnMethods = "googlesearch")
	public static void googlelogin(){
		System.out.println("googlelogin");
	}
	@Test(dependsOnMethods = "googlesearch")
	public static void googlelogout(){
		System.out.println("googlelogout");
	}
}
