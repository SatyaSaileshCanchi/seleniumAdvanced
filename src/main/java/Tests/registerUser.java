package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import LibraryFunction.browserFactory;
import Pages.login;
import Pages.register;



public class registerUser {
	WebDriver driver;
  @Test
  public void test() {
	  WebDriver driver=browserFactory.startBrowser("chrome", "http://demoaut.com/");
	  register reg=new register(driver);
	  reg.contactInfo("sam", "worthington", "123456789", "samW@email.com");
	  reg.mailInfo("North Road 5-1", "CITY BOULEVARD", "BRECKSVILL", "OHIO", "4404");
	  reg.usrInfo1("samW@email.com", "abc123", "abc123");
	  
  }
}
