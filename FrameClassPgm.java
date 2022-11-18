package HandilingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Frame is a webpage embedded inside another webpage (inline frame)*/

public class FrameClassPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    String nse_Value ;
		WebElement option;
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	        
		//switch to  frame using ID
//		  driver.switchTo().frame("moneyiframe");   //moneyiframe is the id of the iframe
//        option = driver.findElement(By.id("nseindex"));
//        nse_Value = option.getText();
//        System.out.println("The NSE value is " +nse_Value);
        
	    
	    //switch to  frame using name
	       driver.switchTo().frame("moneyiframe"); //moneyiframe is the name of the iframe
	       option = driver.findElement(By.id("nseindex"));
	       nse_Value = option.getText();
	       System.out.println("The NSE value is " +nse_Value);
	       
	        
	     //switch to  frame using index
	       
	       /* driver.switchTo().frame(0); //switching to 1st frame
	         option = driver.findElement(By.id("nseindex"));
	         nse_Value = option.getText();
			 System.out.println("The NSE value is " +nse_Value);
	        */
	        
        //switch to  frame using web element
//        WebElement iframe_element = driver.findElement(By.xpath("//iframe[@class='moneyiframe']"));
//        driver.switchTo().frame(iframe_element);
//        option = driver.findElement(By.id("nseindex"));
//        nse_Value = option.getText();
//        System.out.println("The NSE value is " +nse_Value);

	}

}
