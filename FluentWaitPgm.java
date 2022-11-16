package basiccommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    /*
		 * In Fluent wait we can add the polling time of some seconds.
		 * in implicit and explicit wait the function will keep on polling to the
		 * DOM to check whether the element is present or not.
		 * this hammering process of implicit wait and explicit is giving the main thread 
		 * a extra load.
		 * to avoid this we can give a interval of time to poll using fluent wait.
		 */
	    
	    driver.findElement(By.partialLinkText("Account & Lists")).click();
	    
	     Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	    	       .withTimeout(Duration.ofSeconds(20)) // this defines the total amount of time to wait for
	    	       .pollingEvery(Duration.ofSeconds(7)) // this defines the polling frequency
	    	       .ignoring(NoSuchElementException.class); // this defines the exception to ignore
	fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
	     WebElement forgotMob =driver.findElement(By.id("ap_email"));
	     forgotMob.sendKeys("1234568");
	    

	}

}
