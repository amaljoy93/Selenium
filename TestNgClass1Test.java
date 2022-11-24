package TestNgClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass1Test {
	WebDriver driver ;//Globally created 
	
	
	@Test(priority = 1)
	public void test_Method1() {
	  
	    String baseUrl = "https://www.google.com/";
	    System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amalj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Launching Google Chrome browser"); 
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String testTitle = "Facebook – log in or sign up.";
        String originalTitle = driver.getTitle();
        System.out.println("Original title: "+originalTitle);
	        if(testTitle.contains(originalTitle))
	        {
	        	 System.out.println("Matching tittles");
	        }
	        else
	        {
	        	 System.out.println("Not Matching tittles");
	        }
}
	   @Test(priority = 2)
		public void test_Method2() {
		   System.out.println("test_Method2");
	   }
 @BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod: Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() {
	
		System.out.println("@AfterMethod: Finished Test On Chrome Browser");
	}
@BeforeClass
	 public void beforeClass() {
	   System.out.println("@BeforeClass: This will execute before the Class");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	   System.out.println(" @AfterClass: This will execute after the Class");
	 }
	 
	 @BeforeTest
	 public void beforeTest() {
	   System.out.println(" @BeforeTest: This will execute before the Test");
	 }
@AfterTest
	 public void afterTest() {
	   System.out.println(" @AfterTest: This will execute after the Test");
	 }
	 
	 @BeforeSuite
	 public void beforeSuite() {
	   System.out.println(" @BeforeSuite: This will execute before the Test Suite");
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	   System.out.println(" @AfterSuite: This will execute after the Test Suite");
	 }


}
