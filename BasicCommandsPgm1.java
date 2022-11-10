package basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommandsPgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	       WebDriver driver = new ChromeDriver();//WebDriver is an interface so we cannot create object, chromeDriver is a class.
	        String url = "https://www.google.com";
//   	  driver.get(url);
	        driver.navigate().to(url); // it stores browser history
   	  
   	  driver.manage().window().maximize();
		
	}

}
