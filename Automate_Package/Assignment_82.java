package Automate_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_82 {
//There is a class which will have After method,BeforeMethod,Test and AfterSuite and what is the order of execution.
	@BeforeMethod
	public void Method()
	{
		System.out.println("Method");
	}
	
	@Test
	public void Test()
	{
		System.out.println("Test");	
	}

	@AfterMethod
	public void Method1()
	{
		System.out.println("AfterMethod");
	}
	
	
}
