package moveTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MoveTo {
	WebDriver driver;
	  @Test
  public void move() {
	  
	  driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	  search.sendKeys("h");
	  driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 search.sendKeys("a");
	 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 search.sendKeys("n");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Actions act1=new Actions(driver);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	 String text=driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
	 Assert.assertTrue(text.contains("Hand bag")); 
	 System.out.println(text);
	 	  	 	    
	    }
  @BeforeClass
  
	 public void beforeClass()
	 {
     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
     //ChromeOptions options = new ChromeOptions();
     //options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
     //options.addArguments("--disable-extensions");
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://10.232.237.143:443/TestMeApp");
     WebDriverWait wait=new WebDriverWait(driver, 60);
     WebElement ex;
     ex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'slider-carousel\']/div/div[3]/div[1]/h1/span")));

     	  }
}