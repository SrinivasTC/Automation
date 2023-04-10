package Captchaautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","C:\\\\drivers files\\\\chromedriver_win32\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
			
		

		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		// Create an action object and perform left click action
		Actions actions=new Actions(driver);
		WebElement targetedelement= driver.findElement(By.xpath("//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases']"));
		
		actions.moveToElement(targetedelement);
		
		actions.click(targetedelement).build().perform();	
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
