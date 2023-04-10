package Captchaautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertyfile {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties props=new Properties();
		FileInputStream inputstream=new FileInputStream("C:\\Users\\usrin\\eclipse-workspace\\IRCTCcaptcha\\src\\test\\java\\Captchaautomation\\property.properties");
		props.load(inputstream);
		props.get("URL");
		System.out.println(props.get("input"));
		String browserName=props.getProperty("browser");// Initilazing object for the browser name 
		
		
		
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","F:\\firefox\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");	
		}
		else if(browserName.equals("chrome")) {
			

			System.setProperty("webdriver.chrome.driver","C:\\\\drivers files\\\\chromedriver_win32\\\\chromedriver_win32\\\\chromedriver.exe");

			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(opt);

			driver.get("https://www.amazon.in/ref=nav_logo");
		
		}
			
		}
		
	
	}


