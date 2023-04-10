package Captchaautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class resu1 {

 static WebDriver driver;
	private static void initializeDriver() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\drivers files\\\\chromedriver_win32\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(opt);
	
	        driver.get("https://www.amazon.com/");	
	        driver.manage().window().maximize();
	
	        
	        
	
	}

	}


