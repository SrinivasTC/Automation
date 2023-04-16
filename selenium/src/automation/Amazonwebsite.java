package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazonwebsite {
	
	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","C:\\\\drivers files\\\\chromedriver_win32\\\\chromedriver_win32\\\\chromedriver.exe");

			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(opt);
			driver.get("https://www.amazon.in/ref=nav_logo");	
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("hp laptop");
		    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		    driver.findElement( By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		    Set<String> windows = driver.getWindowHandles();
		    Iterator <String> it = windows.iterator(); // moving to child windows 
		    String p = it.next();
		    String c= it.next();
		    driver.switchTo().window(c);
		    Thread.sleep(3000);// sleeps for 3 seconds only 
		    
		    driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.xpath("//*[@id=\"detailpage-imageblock-player-86d21e97-1cbb-4131-bb39-e1a96c085ec4-container-element_html5_api\"]"));
			driver.findElement(By.className("nav-a-content")).click();
			driver.close();
			
		
}}