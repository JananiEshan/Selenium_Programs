package Automate_Package;

import org.testng.annotations.Test;

public class Assignment_93 {

	// TEST PARAMATER = INVOCATION COUNT - NO OF TIMES EXECUTED
	
			@Test(invocationCount=5)
			public void One_1()
			{
				System.out.println("1");
			}
			
			@Test
			public void One_2()
			{
				System.out.println("2");	
			}
			
			@Test(enabled=false)
			public void One_3()
			{
				System.out.println("3");
			}
			
	}
