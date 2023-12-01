package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testjen1 {
	WebDriver driver;
	
  @Test
  public void launchBrowser() throws InterruptedException {
	  
	  try {
			driver = new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
      // Maximize the browser
      driver.manage().window().maximize();

      // Launch Website
      driver.get("https://www.geeksforgeeks.org/");
      Thread.sleep(3000);
      System.out.println(driver.getTitle());
      driver.close();
      }
  
}