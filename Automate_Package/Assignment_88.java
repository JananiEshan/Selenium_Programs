package Automate_Package;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment_88 {
//There is a class in which 1BS, 1AS and 3 @Test, 1AM, 1BM, What will be the order of execution?
	@BeforeSuite
	public void Suite()
	{
		System.out.println("Suite");
	}
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
	
	@Test
	public void Test11()
	{
		System.out.println("Test11");	
	}
	
	@Test
	public void Test111()
	{
		System.out.println("Test111");	
	}
	@AfterSuite
	public void Suite1()
	{
		System.out.println("After Suite");	
	}
}
