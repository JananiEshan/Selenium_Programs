package Automate_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//There is a class in which we have 3 @Test, 1BM and 1AM, what will be the order of execution?
public class Assignment_85 {
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
	@AfterMethod
	public void Method1()
	{
		System.out.println("AfterMethod");
	}
	
}
