package Automationtest.phptravles;

import org.testng.annotations.Test;

public class testcase1 extends Registrationpage{
	Launch l2=new Launch();
	Homepage l1=new Homepage();
	Registrationpage r1=new Registrationpage();
	
   @Test
	public void method1() throws Exception {
	   Launch.Launchbrowser();
		//l1.Signup();
		r1.Registration();
	}

}
