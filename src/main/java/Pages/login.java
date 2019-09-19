package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	By userName=By.name("userName");
	By password=By.name("password");
	By signin=By.name("login");
	
	public login(WebDriver driver)
	{
		this.driver=driver;
			}
	
  @Test
  public void loginUser(String un, String pass) {
	  driver.findElement(userName).sendKeys(un);
	  driver.findElement(password).sendKeys(pass);
	  driver.findElement(signin).click();
  }
}
