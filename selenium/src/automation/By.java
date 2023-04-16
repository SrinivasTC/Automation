package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class By {
 

	private static TakesScreenshot driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(org.openqa.selenium.By.className("gLFyf")).sendKeys("hyr tutorials");
		driver.findElement(
				org.openqa.selenium.By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"))
				.click();
		driver.navigate().to("https://www.hyrtutorials.com/");
		
		driver.navigate().to("https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&fm=neo%2Fmerchandising&iid=M_914ee9c0-412f-4b5e-9e6c-25d477d6b408_1_372UD5BXDFYS_MC.CBUR1Q46W5F1&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Grocery_CBUR1Q46W5F1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=CBUR1Q46W5F1");
		
		File srinivas=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(srinivas, new File("F:\\Srinivas Resume\\snapshotexmples.jpg"));

	Alert alert=new Alert();
	
}

	public static org.openqa.selenium.By cssSelector(String string) {
		// TODO Auto-generated method stub
		return null;
	}
		


}
	


