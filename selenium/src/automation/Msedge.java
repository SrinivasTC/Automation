package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Msedge {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.edge.driver","F:\\Edgedrivers\\edgedriver_win64\\msedgedriver.exe");
	
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("bug life cycle");
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
driver.navigate().to("https://www.geeksforgeeks.org/bug-life-cycle-in-software-development/");
driver.navigate().to("https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e");

}}
