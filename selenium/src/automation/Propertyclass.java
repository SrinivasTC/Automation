package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.google.common.io.Files;
import com.google.j2objc.annotations.Property;

public class Propertyclass {

	private static final TakesScreenshot driver = null;
	private static Object input;
	private static InputStream newfile;

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		
		Properties props=new Properties();
		FileInputStream inputstream=new FileInputStream("C:\\Users\\usrin\\eclipse-workspace\\selenium\\src\\automation\\property.properties");
		props.load(inputstream);
		props.get("URL");
		System.out.println(props.get("input"));
		String browserName=props.getProperty("browser");// Initilazing object for the browser name 
		
		
		
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","F:\\firefox\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");	
		}
		else if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\drivers files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();}
			
		}
		
		
	
	

		
	


}
