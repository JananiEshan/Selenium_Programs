package Automate_Package;

import org.testng.annotations.Test;

public class Assignment_91 {

	// TEST PARAMATER = PRIORITY
	
				@Test(priority=-1)
				public void One_1()
				{
					System.out.println("1");
				}
				
				@Test// if we don't mention then its in default priority
				public void One_2()
				{
					System.out.println("2");	
				}
				
				@Test(priority=-10)
				public void One_3()
				{
					
					System.out.println("3");
				}
				
	}

