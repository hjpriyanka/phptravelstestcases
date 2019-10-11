package Automationtest.phptravles;

import org.testng.annotations.Test;

public class Testcase3hs extends HOTELsearch {
	
Launch l1=new Launch();
HOTELsearch hs1=new HOTELsearch();
@Test
public void hsmethod() throws Exception {
	Launch.Launchbrowser();
	hs1.hotel();
}
	

}
