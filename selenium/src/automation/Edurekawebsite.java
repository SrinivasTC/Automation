package automation;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Edurekawebsite {

	public static void main(String[] args) throws IOException {
		
		
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		File srinivass=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		Files.copy(srinivass,new File("F:\\Deloite Resume\\kalyan.jpg"));
		
	}
	

	

	private static OutputStream newfile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public static void pics() throws IOException {
		
TakesScreenshot driver = null;
File srinivass=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		Files.copy(srinivass,new File("F:\\Deloite Resume\\kalyan.jpg"));
	}

	
	}





	
	

