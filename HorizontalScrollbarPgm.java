package HandilingWebElements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScrollbarPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.album.alexflueras.ro/index.php");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	     JavascriptExecutor js = (JavascriptExecutor) driver; // JavascriptExecutor is an interface to execute methods in JavaScripit 

	     js.executeScript("window.scrollBy(9000,0)");
	 try
	     {
	         Thread.sleep(4000);
	     }
	     catch (InterruptedException e)
	     {
	         e.printStackTrace();
	     }
	     js.executeScript("window.scrollBy(-3000,0)");

	}

}
