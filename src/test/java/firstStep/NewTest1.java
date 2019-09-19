package firstStep;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest1 {
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println ("Open Browser");
  }
  
  @Test
  public void f1() {
	  System.out.println ("first testcase");
  }
  
  @Test
  public void f2() {
	  System.out.println ("Second testcase");
  }
  
  @AfterClass
  public void afterClass()
  {
	  System.out.println ("Cloe Browser");
  }

}
