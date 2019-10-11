package Automationtest.phptravles;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TourBooking extends Toursearch {

static By Booknow=By.xpath("//button[@class='btn btn-block btn-action btn-lg loader']");
static By tourfirstname=By.xpath("//input[@placeholder='First Name']");
static By tourlastname=By.xpath("//input[@placeholder='Last Name']");
static By touremail=By.xpath("//div[@class='col-md-5 col-xs-12']//input[@placeholder='Email']");
static By tourconfrmemail=By.xpath("//input[@placeholder='Confirm Email']");
static By tourmobile=By.xpath("//input[@placeholder='Contact Number']");
static By tourAddress=By.xpath("//input[@placeholder='Address']");
static By country=By.xpath("//span[@class='select2-chosen']");
static By country1=By.xpath("//a[@class='select2-choice']");
static By countryname=By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div/span");
static By checkbox=By.xpath("//form[@id='guestform']//div[@class='control__indicator']");
static By guestinfo=By.xpath("//tr[1]//td[4]//label[1]//span[1]//span[2]");
static By couponcode=By.xpath("//input[@placeholder='Coupon Code']");
static By applycode=By.xpath("//span[@class='btn btn-danger applycoupon btn-block']");
static By guestname=By.xpath("//div[@class='form-horizontal']//div[1]//div[1]//input[1]");
static By passportno=By.xpath("//div[@class='form-horizontal']//div[1]//div[2]//input[1]");
static By age=By.xpath("//div[@class='form-horizontal']//div[1]//div[3]//input[1]");
static By confirmbooking=By.xpath("//button[@name='guest']");

public static void tourbooking() throws Exception {
	 driver.findElement(Booknow).click();
	 driver.findElement(tourfirstname).sendKeys(prop.getProperty("tourfirstname"));
	 driver.findElement(tourlastname).sendKeys(prop.getProperty("tourlastname"));
	 driver.findElement(touremail).sendKeys(prop.getProperty("touremail"));
	 driver.findElement(tourconfrmemail).sendKeys(prop.getProperty("tourconfrmemail"));
	 driver.findElement(tourmobile).sendKeys(prop.getProperty("tourmobile"));
	 driver.findElement(tourAddress).sendKeys(prop.getProperty("tourAddress"));
	 driver.findElement(country).click();
	 driver.findElement(country1).sendKeys(prop.getProperty("countryname"));
	 driver.findElement(countryname).click();
	 driver.findElement(checkbox).click();
	 driver.findElement(guestinfo).click();
	 driver.findElement(couponcode).sendKeys(prop.getProperty("coupon"));
	// driver.findElement(applycode).click();
	 driver.findElement(guestname).click();
	 driver.findElement(guestname).sendKeys(prop.getProperty("guestname"));
	 driver.findElement(passportno).click();
	 
	 driver.findElement(passportno).sendKeys(prop.getProperty("passportno"));
	 driver.findElement(age).click();
	 driver.findElement(age).sendKeys(prop.getProperty("age"));
	 driver.findElement(confirmbooking).click();
	 
	 Thread.sleep(8000);
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFileToDirectory(src, new File("C:\\priyanka"));
	 
	
	 

}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Launchbrowser();
		Tours();
		tourbooking();
		
	}

}
