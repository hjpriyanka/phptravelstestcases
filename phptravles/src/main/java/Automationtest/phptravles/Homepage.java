package Automationtest.phptravles;

//import java.io.FileInputStream;

//import java.io.IOException;
//import java.sql.Driver;
//import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage extends Launch {
	static By MyAccount= By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	static By Signupbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
    static By loginbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	static By Homebutton=By.xpath("//span[contains(text(),'Hotels')]");
	public static void Signup() {
		driver.findElement(MyAccount).click();	
		driver.findElement(Signupbutton).click();		
		}
	public static void login() {
		driver.findElement(MyAccount).click();	
		driver.findElement(loginbutton).click();	
	/*public static void Hotel()
		{
		driver.findElement(Homebutton).click();
		}
		
	}*/
	/*public static void main(String args[]) throws IOException {
		Launchbrowser();
		//Signup();
		login();
		
	}*/
}
	
}
