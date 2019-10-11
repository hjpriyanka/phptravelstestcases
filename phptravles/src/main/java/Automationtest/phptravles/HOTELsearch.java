package Automationtest.phptravles;
//import java.io.Exception;
import org.openqa.selenium.By;
public class HOTELsearch extends Launch{
	static By Homebutton=By.xpath("//span[contains(text(),'Hotels')]");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By Hotelname=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	static By Hotel1name=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	static By CheckIn=By.xpath("//div[@id='dpd1']//input[contains(@placeholder,'Check in')]");
	static By Hotelclick=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div");

public void hotel() throws Exception{
//hotel field
driver.findElement(Homebutton).click();
driver.findElement(cookies).click();
driver.findElement(Hotelname).click();
driver.findElement(Hotel1name).sendKeys(prop.getProperty("HOTELNAME"));
Thread.sleep(3000);
driver.findElement(Hotelclick).click();
driver.findElement(CheckIn).click();


//check-in
while(true)
{
	String str1=driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[2]")).getText();
	if(str1.equals(prop.getProperty("MONTH")))
			{
		break;
			}
	else {
		driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[3]")).click();
	}
}
driver.findElement(By.xpath("//div[14]//tr//td[contains(text(),"+prop.getProperty("day")+")]")).click();


//check-out


	while(true)
	{
		String str1=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
		if(str1.equals(prop.getProperty("MONTH1")))
				{
			break;
				}
		else {
			driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[3]")).click();
			str1=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
		}
	}

driver.findElement(By.xpath("//div[15]//tr//td[contains(text(),"+prop.getProperty("day1")+")]")).click();

//guests

driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();
driver.findElement(By.xpath("//input[@id='hadultInput']")).sendKeys(prop.getProperty("adultip"));
driver.findElement(By.xpath("//input[@id='hchildInput']")).sendKeys(prop.getProperty("childip"));

//search
driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
}
/* driver.close();
public static void main(String[] args) throws Exception{
Launchbrowser();
hotel();
} */
}