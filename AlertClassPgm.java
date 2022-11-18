package HandilingWebElements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    
	      //Alert box
//	      driver.findElement(By.id("alertButton")).click();
//	      Alert simpleAlert = driver.switchTo().alert();
//	      simpleAlert.accept();
	   
	    //Prompt box
	    
	     driver.findElement(By.id("promtButton")).click();
	     Alert promptAlert  = driver.switchTo().alert();
	     String alertText = promptAlert.getText();
	     System.out.println("Alert text is " + alertText);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     promptAlert.sendKeys("Test User");
	        //promptAlert.accept();
	     // promptAlert.dismiss();
	     
	    
	     ////Confirmation box
	     
//	      driver.findElement(By.id("confirmButton")).click();
//	      Alert confirmationAlert = driver.switchTo().alert();
//	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	      String confText = confirmationAlert.getText();
//	      System.out.println("Alert text is " + confText);
//	      confirmationAlert.dismiss();
//
	}

}
