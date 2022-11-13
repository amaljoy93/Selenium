package basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.gmail.com");
	      // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("amaljoy");
	       //Absolute Xpath //*[@id="identifierId"]
	       driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("amal");
	       driver.findElement(By.xpath("//button[@type='button']")).click();
	       driver.findElement(By.xpath("//*[contains(text(),'Learn')]")).click();
	       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello");
	       
	       
	}

}
