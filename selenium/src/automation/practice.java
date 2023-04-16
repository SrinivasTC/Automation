package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class practice {
	
	
	public static void main(String[] args) {
		
	}

	public static <webelement> void main1(String[] args, TimeUnit thread) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		// creating object for webdriver 
			WebDriver driver = null;
			
			Properties props=new Properties();// creating object in our class to access the property file elements 
			FileInputStream inputstream=new FileInputStream("C:\\Users\\usrin\\eclipse-workspace\\selenium\\src\\automation\\property.properties");
			props.load(inputstream);// loads the property file data into the props object  
			System.out.println(props.get("input"));
			String browserName=props.getProperty("browser");// creating object for browser 
			
			
			
			if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","F:\\firefox\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
			else if(browserName.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\drivers files\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
				 }
			
driver.get(props.getProperty("URL"));
driver.manage().window().maximize();
WebElement element=driver.findElement(By.xpath("//*[@name='search_query']"));
element.sendKeys("jai balaya video song");
element.click();
driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button/yt-icon")).click();

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div[2]/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).click();

thread.sleep(3000);
driver.navigate().to("https://www.amazon.in/ref=nav_logo");

Actions action=new Actions(driver);
action.sendKeys(Keys.PAGE_DOWN).click().perform();
	
	}

	public static <webelement, file> void main(String[] args, TimeUnit thread, Object FileUtils) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		// creating object for webdriver 
			WebDriver driver = null;
			
			Properties props=new Properties();// creating object in our class to access the property file elements 
			FileInputStream inputstream=new FileInputStream("C:\\Users\\usrin\\eclipse-workspace\\selenium\\src\\automation\\property.properties");
			props.load(inputstream);// loads the property file data into the props object  
			System.out.println(props.get("input"));
			String browserName=props.getProperty("browser");// creating object for browser 
			
			
			
			if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","F:\\firefox\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
			else if(browserName.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\drivers files\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
				 }
			
driver.get(props.getProperty("URL"));
driver.manage().window().maximize();
WebElement element=driver.findElement(By.xpath("//*[@name='search_query']"));
element.sendKeys("jai balaya video song");
element.click();
driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button/yt-icon")).click();

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div[2]/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).click();

thread.sleep(3000);
driver.navigate().to("https://www.amazon.in/ref=nav_logo");





	}
}
