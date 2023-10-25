package DataProviderAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample_Case1 {

	@Test(dataProvider ="Sample")
	public void Login(String a, String b, String c, String d, String e, String f) {
			System.out.println(a);
	}
		
	@DataProvider(name = "Sample")
	public Object[][] login_details() 
		{	
			Object aa[][] = new Object[2][6];
			aa[0][0]="1";
			aa[0][1]="2";
			aa[0][2]="3";
			aa[0][3]="4";
			aa[0][4]="5";
			aa[0][5]="6";
			
			aa[1][0]="1";
			aa[1][1]="2";
			aa[1][2]="3";
			aa[1][3]="4";
			aa[1][4]="5";
			aa[1][5]="6";
		return aa;
		}
	}		
	
		
	
		
		
	
	
	

