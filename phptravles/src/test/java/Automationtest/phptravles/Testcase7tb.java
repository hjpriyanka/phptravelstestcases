package Automationtest.phptravles;

import org.testng.annotations.Test;

public class Testcase7tb extends TourBooking {
	Launch l1=new Launch();
	Toursearch ts1=new Toursearch();
	TourBooking tb1=new TourBooking();
	
	@Test
	public void tourmethos() throws InterruptedException, Exception {
		Launch.Launchbrowser();
		Toursearch.Tours();
		TourBooking.tourbooking();
		
		
	}
	

}
