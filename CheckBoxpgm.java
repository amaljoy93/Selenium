package HandilingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://smartwebby.com/PHP/Phptips2.asp");
	    driver.manage().window().maximize();
	    //Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	    driver.findElement(By.xpath("//input[@value='JavaScript']")).click();
	    driver.findElement(By.xpath("//input[@value='PHP']")).click();

	}

}
