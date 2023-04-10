package Captchaautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class IRCTCtrainssearch {
	
	
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\drivers files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(opt);
		
	 
     	driver.get("https://www.irctc.co.in/");
     	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     	driver.findElement(By.xpath("//*[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("kurnool");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[normalize-space()='KURNOOL CITY - KRNT']")).click();
        driver.findElement(By.xpath("//*[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("hyderabad");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[normalize-space()='HYDERABAD DECAN - HYB']")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\'jDate\']/span/input")).click();
		driver.findElement(By.xpath("//a[normalize-space()='14']")).click();
	    driver.findElement(By.xpath("//span[@class='ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='AC First Class (1A)']")).click(); 
		driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
	    driver.findElement(By.xpath(("//span[@class='ng-star-inserted'][normalize-space()='GENERAL']"))).click();
	    driver.findElement(By.xpath("//label[@for='availableBerth']")).click();
    	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
        driver.findElement(By.xpath("//*[@class='active btnDefault']")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/button")).click();
    	driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all ui-clickable ng-star-inserted ui-slider-handle-active']")).click();
        driver.findElement(By.xpath("//div[@class='col-sm-3 hidden-xs filter-div']//div[3]//p-slider[1]//div[1]//span[3]")).click();
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,2000)");
        driver.findElement(By.xpath("//span[@class='ng-tns-c19-148 pi pi-times']")).click();
        driver.findElement(By.xpath("//*[@class='active btnDefault']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/button")).click();
      
    	
        // Print text displayed in the avaliable trains list 
    	 
    	
        String text=driver.findElement(By.xpath("//span[contains(text(),'6 Results for')]")).getText();
    	System.out.println(text);
        
    	// Scroll down vertically 
    	JavascriptExecutor js= (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,4000)");
      

	}
	 
	
	

	}



	
	
	
	


