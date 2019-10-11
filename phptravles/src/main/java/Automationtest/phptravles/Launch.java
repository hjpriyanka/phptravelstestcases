package Automationtest.phptravles;

import java.io.FileInputStream;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static void Launchbrowser() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\prr\\chromedriver.exe");
		driver = new ChromeDriver();
	    FileInputStream fis=new FileInputStream("C:\\Users\\Online Test\\Desktop\\swapnil\\phptravles\\src\\main\\java\\files\\data.properties");
	    prop.load(fis);
	    driver.get(prop.getProperty("HOST"));
	    driver.manage().window().maximize();   
	}
	
	    /*public static void main(String agrs[]) throws IOException {
	    
	    Launchbrowser();
	    
	}*/

}
