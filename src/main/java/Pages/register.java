package Pages;

import org.apache.poi.ss.formula.ptg.IntPtg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class register {
	WebDriver driver;
	By register=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	By firstName=By.name("firstName");
	By lastName=By.name("lastName");
	By phone=By.name("phone");
	By email=By.xpath("//*[@id=\"userName\"]");
	By address1= By.name("address1");
	By address2= By.name("address2");
	By city= By.name("city");
	By state=By.name("state");
	By postalCode=By.name("postalCode");
	By userName=By.xpath("//*[@id=\"email\"]");
	By usrPass= By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input");
	By confirmPassword= By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input");
	By submitUsr=By.name("register");
	
			
	public register(WebDriver driver)
	{
		this.driver=driver;
			}
	

  public void contactInfo(String fn, String ln, String ph, String em) {
	  	  
		driver.findElement(register).click();
	  	  driver.findElement(firstName).sendKeys(fn);
	  	  driver.findElement(lastName).sendKeys(ln);
	  	  driver.findElement(phone).sendKeys(ph);
	  	  driver.findElement(email).sendKeys(em);
  }
  public void mailInfo(String a1, String a2, String ct, String st, String pc) {
  	  
		
	  	  driver.findElement(address1).sendKeys(a1);
	  	  driver.findElement(address2).sendKeys(a2);
	  	  driver.findElement(city).sendKeys(ct);
	  	  driver.findElement(state).sendKeys(st);
	  	  driver.findElement(postalCode).sendKeys(pc);
}
  public void usrInfo1(String un, String up, String cp) {
  	  
		
  	  driver.findElement(userName).sendKeys(un);
  	  driver.findElement(usrPass).sendKeys(up);
  	  driver.findElement(confirmPassword).sendKeys(cp);
  	  driver.findElement(submitUsr).click();
  	  
  }



}
