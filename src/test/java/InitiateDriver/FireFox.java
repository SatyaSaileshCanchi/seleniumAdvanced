package InitiateDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FireFox {
	WebDriver driver;
	//String ExpectedResult = "google";
		
  @Test
  public void f() {
	  
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Seleniumhq.org");
	  driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]")).submit();
	  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div[1]/a/h3/div")).click();
	  //Assert.assertEquals(ExpectedResult, driver.getTitle());
	 	    
  }
  
  @BeforeClass
  
	 public void beforeClass()
	 {
     System.setProperty("webdriver.gecko.driver", "C:\\FireFoxGeckoDriver_win64\\geckodriver.exe");
     driver=new FirefoxDriver();
       
	  }
  
// @AfterClass
// public void afterClass()
//    {
 //driver.close();
//  }
  }


