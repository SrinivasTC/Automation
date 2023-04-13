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
	    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).sendKeys(Keys.ENTER);
	    driver.findElement( By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	    Set<String> windows = driver.getWindowHandles();
	    Iterator <String> it = windows.iterator(); // moving to child windows 
	    String p = it.next();
	    String c= it.next();
	    driver.switchTo().window(c);
	    Thread.sleep(3000);// sleeps for 3 seconds only 
	    
	    driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("(//*[@id='attach-sidesheet-checkout-button']/span/input)")).click();
		driver.switchTo().window(p);
		
		
}
	public static void sendkeys(WebDriver driver,String str) {
		
		
		
		
	}
	
	}


