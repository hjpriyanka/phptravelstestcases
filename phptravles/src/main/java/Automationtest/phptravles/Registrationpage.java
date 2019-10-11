package Automationtest.phptravles;
//import java.io.IOException;
//import java.util.Properties;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
public class Registrationpage extends Homepage {
	
	static By firstName= By.xpath("//input[@placeholder='First Name']");
	static By lastName=By.xpath("//input[@placeholder='Last Name']");
	static By MobileNumber=By.xpath("//input[@placeholder='Mobile Number']");
	static By email=By.xpath("//input[@placeholder='Email']");
	static By password=By.xpath("//input[@placeholder='Password']");
	static By confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
	static By submit=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	public  void Registration()
	{
		driver.findElement(Signupbutton).click();
		driver.findElement(firstName).sendKeys(prop.getProperty("Firstname"));
		driver.findElement(lastName).sendKeys(prop.getProperty("lastname"));
		driver.findElement(MobileNumber).sendKeys(prop.getProperty("Mobile"));
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(password).sendKeys(prop.getProperty("pass"));
	
		driver.findElement(confirmpassword).sendKeys(prop.getProperty("confrmpass"));
		driver.findElement(cookies).click();
		driver.findElement(submit).click();
	}
	/*
	 public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Launchbrowser();
		Signup();
		Registration();	}
		*/
}
