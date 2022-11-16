package basiccommands;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	     driver.findElement(By.partialLinkText("Account & Lists")).click();
	     //implicit wait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
	     driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
	}

	
	
	
}
