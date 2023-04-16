package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

import com.google.common.io.Files;

public class IRCTCRegistration  {

	public static void main(String[] args) throws IOException {
		
		
		
		// TODO Auto-generated method stub
		//IRCTC REGISTRATION 
		System.setProperty("webdriver.chrome.driver", "C:\\drivers files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-s");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//input[@id='userName']"));
		element.click();
		element.sendKeys("UpparaSrinivasulu");
		WebElement element1=driver.findElement(By.xpath("//input[@id='usrPwd']"));
		element1.click();
		element1.sendKeys("Srinu12345@");
		WebElement element2=driver.findElement(By.xpath("//input[@id='cnfUsrPwd']"));
		element2.sendKeys("Srinu12345@");
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[3]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='English']")).click();
		driver.findElement(By.xpath(("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-15 pi pi-chevron-down']"))).click();
	    driver.findElement(By.xpath("//span[normalize-space()='What is your pet name?']")).click();
	    WebElement element3=driver.findElement(By.xpath("//input[@placeholder='Security Answer']"));
	    element3.click();
	    element3.sendKeys("chinna");
	    driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("uppaara");
	    driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("srini");
	    driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("vasulu");
	    driver.findElement(By.xpath("//div[@class='ng-tns-c65-16 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
	    driver.findElement(By.xpath("//span[normalize-space()='PUBLIC']")).click();
	    WebElement element6=driver.findElement(By.xpath("//input[@placeholder='Date Of Birth']"));
	    element6.click();
	   	WebElement element7=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]/option[99]"));
	   	element7.click();
	   	WebElement element8=driver.findElement(By.xpath("//option[normalize-space()='August']"));
	    element8.click();
	    driver.findElement(By.xpath("//a[normalize-space()='5']")).click();
	    driver.findElement(By.xpath("//p-radiobutton[@id='unmarried']//span[@class='ui-radiobutton-icon ui-clickable']")).click();
	    Select select12=new Select(driver.findElement(By.xpath("//*[@id='ui-tabpanel-1']/div/div[8]/select")));
	    select12.selectByValue("94");
	    driver.findElement(By.xpath("//span[normalize-space()='Male']")).click();
	    WebElement element9=driver.findElement(By.xpath("//input[@id='email']"));
	    element9.click();
	    element9.sendKeys("upparasrinivasulu37@gmail.com");
	    driver.findElement(By.xpath("//input[@id='isd']")).click();
	    WebElement element10=driver.findElement(By.xpath("//input[@id='mobile']"));
	    element10.click();
	    element10.sendKeys("9550972143");
	    Select select=new Select(driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select")));
	    select.selectByValue("94");
	    driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    WebElement element12=driver.findElement(By.xpath("//*[@id='resAddress1']"));
	    element12.click();
	    element12.sendKeys("76/97-444");
	    WebElement element11=driver.findElement(By.xpath("//*[@id='resAddress2']"));
	    element11.click();
	    element11.sendKeys("Nagendra Nagar");
	    WebElement element13=driver.findElement(By.xpath("//*[@id='resAddress3']"));
	    element13.click();
	    element13.sendKeys("All India Radio Station");
	    WebElement element14=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input"));
	    element14.click();
	    element14.sendKeys("518003");
        driver.findElement(By.xpath("//input[@id='resState']")).sendKeys("ANDHRA PRADESH");
	    Select select22=new Select(driver.findElement(By.xpath("//select[@formcontrolname='resCity']")));
	    select22.selectByValue("KURNOOL");
	    Select select34=new Select(driver.findElement(By.xpath("//select[@formcontrolname='resPostOff']")));
	    select34.selectByValue("SAP Camp kNL S.O");
	    driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select/option[5]")).click();
	    WebElement element15= driver.findElement(By.xpath("//input[@id='resPhone']"));
	    element15.click();
	    element15.sendKeys("9550972143");
	    driver.findElement(By.xpath("//p-radiobutton[@id='yes']//span[@class='ui-radiobutton-icon ui-clickable']")).click();
	    driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-2\"]/div/div[12]/span[1]")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[normalize-space()='REGISTER']")).click();
        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/p-dialog/div/div/div[2]/app-registration-confirmation/div/div[3]/button[1]")).click();

        

	}


	 
	}


