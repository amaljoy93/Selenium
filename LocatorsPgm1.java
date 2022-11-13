package basiccommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsPgm1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com");
	      
	       
	       

      WebElement  username =  driver.findElement(By.name("email"));
      username.sendKeys("amal joy");
      driver.findElement(By.id("email")).sendKeys("amal joy");
       driver.findElement(By.className("inputtext")).sendKeys("amal joy");
       driver.findElement(By.tagName("input")).sendKeys("Hello");
       driver.findElement(By.cssSelector("input#identifierId")).sendKeys("amaljoy");
	       //locating by css selector using tag and id
       driver.findElement(By.cssSelector("input.whsOnd")).sendKeys("hello");//locating using tag and class
       driver.findElement(By.cssSelector("input[name = 'identifier']")).sendKeys("hello1");//locating using css selector with tag and attribute
       driver.findElement(By.linkText("Learn more")).click();
       driver.findElement(By.partialLinkText("Learn")).click();       
	       
       
	}
         
           
   
}
