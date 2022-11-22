package HandilingWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWebTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
//		String sRow = "2";
//		String sCol = "4";              
//		
//		//Here we are locating the xpath by passing variables in the xpath
//		String sCellValue = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
//		System.out.println(sCellValue);
		
		
		 //To locate Table
        WebElement mytable = driver.findElement(By.id("customers"));
        //To locate rows of the table
       List<WebElement> RowList = mytable.findElements(By.tagName("tr"));
     
       //To find no of Rows
      int RowListCount = RowList.size();
      System.out.println("No of Rows are :"+RowListCount);
      
     //This loop will go till last row in the table
      	for (int row = 0; row < RowListCount; row++) 
    { 
          
        // To locate columns of that specific row
         List<WebElement> ColumnList = RowList.get(row).findElements(By.tagName("td"));
            
        //To calculate no of columns in that specific row
           int ColumnsListCount = ColumnList.size();
           System.out.println("No of cells in Row "+row+" are "+ColumnsListCount);
//This loop will execute till last column in the specific row
              for (int column = 0; column < ColumnsListCount; column++) 
                {
             
           // To retrieve text from that specific cell
                String celtext = ColumnList.get(column).getText();
                System.out.println("Cell Value of row number " + row + " and column number " + column + " - " + celtext);
           }
    System.out.println("---------------------------------------");
    }
	}

}


	






	