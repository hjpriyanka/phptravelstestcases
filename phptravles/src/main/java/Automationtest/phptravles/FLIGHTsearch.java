package Automationtest.phptravles;

//import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FLIGHTsearch extends Launch {
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By flightbutton=By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[2]/a");
	static By location=By.xpath("//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
static By locationl1=By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");

static By location2=By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
static By location2a=By.xpath("//*[@id=\"s2id_destination\"]/a");
   static By guestlink=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
   static By adultflight=By.xpath("//select[@id='madult']");
   
    public static void flight() throws InterruptedException
    {   	//driver.findElement(cookies).click();
    	//from field of flight
    	driver.findElement(flightbutton).click();
    	driver.findElement(cookies).click();
    	driver.findElement(location).click();
    	
    	//driver.findElement(locationl1).click();
    	driver.findElement(locationl1).sendKeys(prop.getProperty("Location1"));  
    	driver.findElement(locationl1).sendKeys(Keys.DOWN);
    	Thread.sleep(1000);
    	driver.findElement(locationl1).sendKeys(Keys.ENTER);
    	//driver.findElement(locationl1).click();
    	
    	//to field of flight
    	driver.findElement(location2).click();
    	driver.findElement(location2a).sendKeys(prop.getProperty("Location2"));  
    	driver.findElement(location2a).sendKeys(Keys.DOWN);
    	Thread.sleep(1000);
    	driver.findElement(location2a).sendKeys(Keys.ENTER);
    	
    	//date
    	driver.findElement(By.xpath("//input[@id='departure']")).click();
    	while(true)
    	{
    		String str1=driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText();
    		if(str1.equals(prop.getProperty("hotelMONTH")))
    				{
    			break;
    				}
    		else {
    			driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[3]")).click();
    		}
    	}
    	driver.findElement(By.xpath("//div[16]//tr//td[contains(text(),"+prop.getProperty("hday")+")]")).click();

    	//guest
       driver.findElement(guestlink).click();
       Thread.sleep(1000);
       driver.findElement(adultflight).click();
       driver.findElement(By.xpath("//select[@id='madult']//option[contains(text(),"+prop.getProperty("anumber")+")]")).click();
       driver.findElement(By.xpath("//select[@id='mchildren']")).click();
       driver.findElement(By.xpath("//select[@id='mchildren']//option[contains(text(),"+prop.getProperty("cnumber")+")]")).click();
       driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
      Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']")).click();
       
   
    
    }
	/*public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
Launchbrowser();
flight();
	}*/

}
