package LibraryFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browserFactory {
	static WebDriver driver;
  @Test
  public static WebDriver startBrowser(String browserName, String url) {
	  if(browserName.equals("firefox"))
	  {
		  System.setProperty("webdriver.geco.driver", "C:\\FireFoxGeckoDriver_win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
  }
	  driver.manage().window().maximize();
	  driver.get(url);
	  return driver;
}
}