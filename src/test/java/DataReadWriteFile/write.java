package DataReadWriteFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class write  {
  @Test
  public void f() throws IOException {
	  File src=new File("C://Selenium_Advanced//data.xlsx");
	  
	  FileInputStream fis= new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1= wb.getSheetAt(0);
	  
	  sheet1.getRow(0).createCell(2).setCellValue("Pass");
	  sheet1.getRow(1).createCell(2).setCellValue("Fail");
	  
	  FileOutputStream fo = new FileOutputStream(src);
	  wb.write(fo);
	  	  wb.close();
	    
	  
  }
}
