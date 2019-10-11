package Automationtest.phptravles;

//import java.io.IOException;

import org.testng.annotations.Test;


public class Testcase6cs extends Carsearch
{
	Launch l1=new Launch();
	Carsearch c1=new Carsearch();
	
@Test
public void csmethod() throws Exception
    {
		Launch.Launchbrowser();
		Carsearch.Cars();		
	}
}
