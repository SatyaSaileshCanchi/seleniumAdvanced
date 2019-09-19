package moveTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MoveTwo {
WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	  search.sendKeys("h");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  search.sendKeys("a");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  search.sendKeys("n");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
 
   	  }
}