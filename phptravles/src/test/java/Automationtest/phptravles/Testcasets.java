package Automationtest.phptravles;

//import java.io.IOException;

import org.testng.annotations.Test;

public class Testcasets extends Toursearch {
	Launch l1=new Launch();
	Toursearch ts1=new Toursearch();
	@Test
	public void tourmethos() throws InterruptedException, Exception {
		Launch.Launchbrowser();
		Toursearch.Tours();
		
	}
	

}
