package Captchaautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\drivers files\\\\chromedriver_win32\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/ref=nav_logo");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("hp laptop");
	    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	    
	    String currentWindowHandle = driver.getWindowHandle();
	    
	    driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[1]")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    
	  
	    
	    for (String windowHandle : windowHandles) {
	       if (!windowHandle.equals(currentWindowHandle)) {
	            driver.switchTo().window(windowHandle);
	            
	            Thread.sleep(3000);
	            // perform actions on the new window
	            driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	       
	          
		
		
		
	}}}}
		
		
		
	