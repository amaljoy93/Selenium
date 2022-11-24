package TestNgClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPgm {
	WebDriver driver ;
	   @Test(priority = 1)
	public void test_Method1() {
	  
	    String baseUrl = "https://www.amazon.com/";
 	    System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	        String testTitle = "Amazon.com. Spend less. Smile more.";
	        String originalTitle = driver.getTitle();
Assert.assertEquals(originalTitle, testTitle);
	    
}
	   @Test(priority=2,dataProvider = "dataCollection")
	    public void testMethod2(String data) {
	        System.out.println("Data is: " + data);
	    }
@DataProvider(name = "dataCollection")
	    public Object[][] dataProviderMethod() {
	        return new Object[][] {
	        	{ "data one" }, { "data two" }, { "data three" } };
	    }
	

}
