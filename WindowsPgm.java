package HandilingWebElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://secure.indeed.com/account/login");
	    //implicit wait
	    
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.findElement(By.id("apple-signin-button")).click();
	      
	    // window handles
	      String parent=driver.getWindowHandle();//return a unique ID of the current window 
	      
	   // This will return the number of windows opened by Webdriver and will return Set of Strings
	      Set<String>s1=driver.getWindowHandles();
	      
	   //Now we will iterate using Iterator
	      Iterator<String> I1= s1.iterator();
	      while(I1.hasNext())
	   {
	    
	      String child_window=I1.next();
	    
	   // Here we will compare if parent window is not equal to child window then we            will close
	    
	   if(!parent.equals(child_window))
	   {
	   driver.switchTo().window(child_window);
	   System.out.println("Child window title:"+driver.switchTo().window(child_window).getTitle());
	    
	   driver.close();
	   }
	    
	   }
	   System.out.println("Parent window title:"+driver.switchTo().window(parent).getTitle())	;

	}

}
