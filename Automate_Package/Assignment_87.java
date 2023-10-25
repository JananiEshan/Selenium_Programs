package Automate_Package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_87 {
//There is a class in which we have 3 @Test and only 1BM, what will be the order of execution?
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
}