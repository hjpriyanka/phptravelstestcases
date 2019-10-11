package Automationtest.phptravles;

//import java.io.IOException;

import org.testng.annotations.Test;


public class Testcase4fs extends FLIGHTsearch 
{
	Launch l1=new Launch();
	FLIGHTsearch fs1=new FLIGHTsearch();
	
@Test
public void hsmethod() throws Exception
	{
	Launch.Launchbrowser();
	FLIGHTsearch.flight();	
	}
}
