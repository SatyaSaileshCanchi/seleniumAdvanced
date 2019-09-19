package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import LibraryFunction.browserFactory;
import Pages.login;


public class logintestprog {
	WebDriver driver;
  @Test
  public void test() {
	  WebDriver driver=browserFactory.startBrowser("chrome", "http://demoaut.com/");
	  login log=new login(driver);
	  log.loginUser("tutorial", "tutorial");
	  
  }
}
