package HandilingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventPgm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://google.com");
	    Thread.sleep(3000);
	    driver.findElement(By.id("L2AGLb")).click();
	    Actions actionProvider = new Actions(driver); //Actions class
	    
	     driver.findElement(By.name("q")).sendKeys("selenium webdriver" + Keys.ENTER);
         Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();  //Action interface
	     keydown.perform();
	     /* Actions is a class and using to perform mouse and keyboard actions 
	      * Action is an interface to perform a series of action items build by Actions class
	      */
	      
	    
//	     WebElement el = driver.findElement(By.name("q"));
//	     actionProvider.keyDown(Keys.SHIFT).sendKeys(el,"qwerty").keyUp(Keys.SHIFT).sendKeys("qwerty").perform();

	}

}
