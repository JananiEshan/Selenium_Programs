package Automate_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//TestNG Topic -> In a class use all 9  annotations of testng and check what is the order of execution 
public class Assignment_81 {
	@BeforeSuite
	public void Suite()
	{
		System.out.println("Suite");
	}
	
	@Test
	public void Test()
	{
		System.out.println("Test");	
	}
	
	
	@BeforeClass
	public void Main()
	{
		System.out.println("Class");
	}
	
	@BeforeMethod
	public void Method()
	{
		System.out.println("Method");
	}
	@AfterMethod
	public void Method1()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void Class()
	{
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void Test1()
	{
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void Suite1()
	{
		System.out.println("After Suite");	
	}
	
}


