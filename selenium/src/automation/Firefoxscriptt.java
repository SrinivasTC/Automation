package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxscriptt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","F:\\firefox\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("boss party song");
     	driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
     	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     	driver.findElement(By.xpath("//body/ytd-app/div[@id='content']/ytd-page-manager[@id='page-manager']/ytd-search[@role='main']/div[@id='container']/ytd-two-column-search-results-renderer[@class='style-scope ytd-search']/div[@id='primary']/ytd-section-list-renderer[@class='style-scope ytd-two-column-search-results-renderer']/div[@id='contents']/ytd-item-section-renderer[@class='style-scope ytd-section-list-renderer']/div[@id='contents']/ytd-video-renderer[1]/div[1]/ytd-thumbnail[1]/a[1]/yt-image[1]/img[1]")).click();
     	
	}
	
	}


