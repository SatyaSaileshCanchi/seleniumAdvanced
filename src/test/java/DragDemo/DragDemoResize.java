package DragDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragDemoResize {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	  WebElement resize= driver.findElement(By.xpath("/html/body/div/div[3]"));
	  Actions action = new Actions(driver);
	  action.dragAndDropBy (resize, 400, 200).build().perform();
	  
  }

  @BeforeClass

public void beforeClass()
{
System.setProperty("webdriver.gecko.driver", "C:\\FireFoxGeckoDriver_win64\\geckodriver.exe");
driver=new FirefoxDriver();
 }
 
  @AfterClass
   public void afterClass()
   {
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.close();
   }
   }
  