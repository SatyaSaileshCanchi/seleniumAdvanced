package InitiateDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InitiateDriverChrome {
	WebDriver driver;
	//String ExpectedResult = "google";
		
  @Test
  public void f() {
	  
	  driver.get("http://10.232.237.143:443/TesrMeApp");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
	  driver.findElement(By.className("VdLsw gsfi")).sendKeys("Seleniumhq.org");
	  driver.findElement(By.className("gN089b")).submit();
	  //Assert.assertEquals(ExpectedResult, driver.getTitle());
	 	    
  }
  
  @BeforeClass
  
	 public void beforeClass()
	 {
     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
       
	  }
  
// @AfterClass
// public void afterClass()
//    {
 //driver.close();
//  }
  }

