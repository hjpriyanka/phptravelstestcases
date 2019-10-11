package Automationtest.phptravles;

//import java.io.IOException;

import org.testng.annotations.Test;

public class Testcase2login extends Homepage{
	Launch l1=new Launch();
	Loginpage ll=new Loginpage();
	
	@Test
	public void test1() throws Exception 
	{
		Launch.Launchbrowser();
		ll.LoggingIn();
		
	}


}
