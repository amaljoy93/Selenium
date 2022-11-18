package HandilingWebElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
		
	    driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		  
	    //using sendKeys()
	 /* WebElement addFile = driver.findElement(By.xpath(".//input[@type='file']"));
		addFile.sendKeys("E:\\ENTRI_APP_TESTING\\Automation Testing\\7_Webelements\\8_File\\sample.png");
		driver.findElement(By.xpath(".//span[text()='Start upload']")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		if(driver.findElement(By.xpath(".//a[text()='sample.png']")).isDisplayed()) {
		System.out.println( "Image Uploaded");
		}else {
			System.out.println( "Image not Uploaded");
		}
		
		*/
    		//using Robot class
		
		  
			   // file path passed as parameter to StringSelection
		        StringSelection s = new StringSelection("C:\\Users\\amalj\\OneDrive\\Desktop\\java-collection-hierarchy.png");
		        //String selection converts file name into an object and tranfering to the file upload window 
		        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		        // Toolkit is an abstract class for providing platforms specific details eg.Windows size, font ..etc
		      
		        
		      //identify element and click
		       WebElement fileBtn=driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]"));
		       fileBtn.click();
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		       // Robot object creation
		       Robot r = new Robot();
		       
		       //pressing ctrl+v
		       r.keyPress(KeyEvent.VK_CONTROL);
		       Thread.sleep(1000);
		       r.keyPress(KeyEvent.VK_V);
		       Thread.sleep(1000);
		       
		       //releasing ctrl+v
               r.keyRelease(KeyEvent.VK_V);
		       r.keyRelease(KeyEvent.VK_CONTROL);
		     
		       //pressing enter
		       r.keyPress(KeyEvent.VK_ENTER);
		       //releasing enter
		       
		       
		       r.keyRelease(KeyEvent.VK_ENTER);
		       Thread.sleep(1000);

	}

}
