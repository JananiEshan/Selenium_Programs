package Automate_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Assignment_86 {
// There is a class in which we have 3 @Test and only 1AM, what will be the order of execution?
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

