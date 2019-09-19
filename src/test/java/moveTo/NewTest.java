package moveTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
		
		WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
		WebElement ouroffice=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
		WebElement chennai=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));
	
		Actions act=new Actions(driver);
		act.moveToElement(aboutus).click().build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver,50);
		
		wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
		act.moveToElement(ouroffice).click().build().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(chennai));
		act.moveToElement(chennai).click().build().perform();
  }

		  @BeforeClass
		  
			 public void beforeClass()
			 {
		     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		     driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("http://10.232.237.143:443/TestMeApp");
		     WebDriverWait wait=new WebDriverWait(driver, 60);
		     WebElement ex1;
		     ex1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'slider-carousel\']/div/div[3]/div[1]/h1/span")));

		     	  }
		
  }

