package basiccommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.get("https://www.amazon.com/");
	    driver.findElement(By.partialLinkText("Account & Lists")).click();
	    
	     //Explicit wait
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
	    // wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_email")));
	    driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");

	}

}
