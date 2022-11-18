package HandilingWebElements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VericalScrollBarPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.google.in/");
	    driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);//Keys is an enum(it is a special class or data type for creating constants) and Enter is enum value 
        driver.manage().window().maximize();
        //to perform Scroll on application using Selenium
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        //Scrolling by pixel
        
//        js.executeScript("window.scrollBy(0,1200)");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        js.executeScript("window.scrollBy(0,-1000)");  //scroll up
//        
        
        //scroll down to an element in Selenium until it is visible
        
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div/div[1]/div/a/h3"));
         // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
       
        //scroll down to the bottom of the webpage 
        
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
