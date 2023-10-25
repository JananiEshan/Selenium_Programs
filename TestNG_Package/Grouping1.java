package TestNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 {

	@Test(groups = {"name"})
	public void method1(){
		Reporter.log("Janani");
	}
	
	@Test(groups = {"country"})
	public void method2(){
		Reporter.log("India");
	}
	
	@Test(groups = {"state"})
	public void method3() {
		Reporter.log("Karnataka");
	}
}
