 package Captchaautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class IRCTCcaptcha {

	public static void main(String[] args) throws IOException, TesseractException, InterruptedException {
		
		System.setProperty("gc.h.gc", "C:\\drivers files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
		Thread.sleep(5000);
	    File src=driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[4]/div/app-captcha/div/div/div[2]/span[1]/img")).getScreenshotAs(OutputType.FILE);
	    String path=System.getProperty("user.dir")+"screenshots\'captcha.0x89 0x50";
	    System.out.println(path);
	   Files.copy(src,new File(path));
	   ITesseract image=new Tesseract();
	   String imageText=image.doOCR(new File(path));
	   System.out.println(imageText);
	   
	   String finaltext=imageText.split("below")[1].replaceAll("[^a-zA-Z]","");
	    System.out.println("final cpatcha is:"+finaltext);
	    driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(finaltext);
	  
	   driver.findElement(By.xpath("//label[normalize-space()='Login & Booking With OTP']")).click();
}
}