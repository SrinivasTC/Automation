package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	  private WebDriver driver;
	    
	    @BeforeMethod
	    public void setUp() {
	        // set the path to the chromedriver executable file
	        System.setProperty("webdriver.chrome.driver", "C:\\drivers files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	        
	        // create a new instance of the Chrome driver
	        ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(opt);
	        // navigate to the Amazon website
	        driver.get("https://www.amazon.com");
	    }
	    
	    @AfterMethod
	    public void tearDown() {
	        // close the browser window
	        driver.quit();
	    }
	    
	    @Test
	    public void testSearch() {
	        // find the search box element
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        // enter the search keyword
	        searchBox.sendKeys("laptop");
	        // submit the search form
	        searchBox.submit();
	        // verify that the search results page is displayed
	        WebElement searchResults = driver.findElement(By.id("search"));
	        Assert.assertTrue(searchResults.isDisplayed());
	    }
	    
	    @Test
	    public void testAddToCart() {
	        // navigate to the product page
	        driver.get("https://www.amazon.com/dp/B08X8BX6CL");
	        // find the add to cart button element
	        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
	        // click the add to cart button
	        addToCartButton.click();
	        // verify that the product is added to the cart
	        WebElement cartCount = driver.findElement(By.id("nav-cart-count"));
	        Assert.assertEquals(cartCount.getText(), "1");
	        
	    }
	}

  
	  
	
