package TestNgClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	WebDriver driver ;
	@BeforeMethod
	public void test_Method1() throws Exception {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    driver = new ChromeDriver();
	    String url = "https://www.google.com";
  	  driver.get(url);
  	  driver.manage().window().maximize();
  	  Thread.sleep(3000);
  	  driver.findElement(By.id("L2AGLb")).click();
	    
  }
@DataProvider(name ="excel-data")
	  	public Object[][] excelDP() throws IOException{
	        	//We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
	        	Object[][] arrObj = getExcelData("C:\\TestData\\GoogleTestData.xlsx","SEARCH");
	        	return arrObj;
	  	}
	   @Test(dataProvider ="excel-data")
	  	public void search(String keyWord1, String keyWord2){
		   WebElement txtBox = driver.findElement(By.name("q"));
	       txtBox.sendKeys(keyWord1," ",keyWord2);
	          txtBox.sendKeys(Keys.ENTER);
	        
	  	}
	   public String[][] getExcelData(String fileName, String sheetName){
       	
       	String[][] data = null;
try
 	  	{
 	   	FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fis);// This class is using to perform excel file operation so need to add apache poi dependency in pom.xml file 
 	   	XSSFSheet sh = wb.getSheet(sheetName);
 	   	XSSFRow row = sh.getRow(0);
 	   	int noOfRows = sh.getPhysicalNumberOfRows();
 	   	int noOfCols = row.getLastCellNum();
 	   	Cell cell;
 	   	data = new String[noOfRows-1][noOfCols];

for(int i =1; i<noOfRows;i++){
 		     for(int j=0;j<noOfCols;j++){
 		    	   row = sh.getRow(i);
 		    	   cell= row.getCell(j);
 		    	   data[i-1][j] = cell.getStringCellValue();
 	   	 	   }
 	   	}
 	  	}
 	  	catch (Exception e) {
 	     	   System.out.println("The exception is: " +e.getMessage());
 	     	           	}
 	  	
       	return data;
       	
 	}

	

}
