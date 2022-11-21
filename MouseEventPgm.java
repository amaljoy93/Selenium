package HandilingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventPgm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
		driver.findElement(By.id("L2AGLb")).click();
	   
	      WebElement signLink = driver.findElement(By.linkText("Sign in"));
	      Actions actionProvider = new Actions(driver);
	      //actionProvider.clickAndHold(signLink).build().perform();
	     // actionProvider.contextClick(signLink).build().perform();
	     // actionProvider.doubleClick(signLink).build().perform();
	      actionProvider.moveToElement(signLink).build().perform();
	      
//	      Actions actionProvider = new Actions(driver);
//	      driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
//	      WebElement sourceEle = driver.findElement(By.id("draggable"));
//	      WebElement targetEle = driver.findElement(By.id("droppable"));
//	     // Performs drag and drop action of sourceEle onto the targetEle
//	      actionProvider.dragAndDrop(sourceEle, targetEle).build().perform();
	      

	}

}
