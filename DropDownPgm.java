package HandilingWebElements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    //Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	     //Selecting an item from Drop Down list Box
	    Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
	    // dropdown.selectByVisibleText("Amazon Devices");
	      dropdown.selectByIndex(5);
	    //dropdown.selectByValue("search-alias=alexa-skills");

	}

}
