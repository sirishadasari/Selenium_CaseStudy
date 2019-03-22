package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Sirisha\\Selenium\\Installation\\ExeFiles\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				System.setProperty("webdriver.gecko.driver", "C:\\Sirisha\\Selenium\\Installation\\ExeFiles\\geckodriver.exe");
				WebDriver driver1 = new FirefoxDriver();
				
					
				driver.get("https://www.edureka.co/");
				driver.manage().window().maximize();
				
				driver1.get("https://www.edureka.co/");
				driver1.manage().window().maximize();
								
			//Find element Search by id 
			//   driver.findElement(By.id("search-inp")).sendKeys("Selenium");
			
		    //Find element Search by name
		    //   driver.findElement(By.name("user_v1[query]")).sendKeys("Java");
			   
		    //Find element Search by class -- not working correctly..Ruby is not being displayed in search box *************************
			//driver.findElement(By.className("search_inp collapse giTrackElementHeader")).sendKeys("Ruby");
			// driver1.findElement(By.className("search_inp collapse giTrackElementHeader")).sendKeys("Ruby");
			                                   
				
		    //Find element Search by CSS selector
		    //    driver.findElement(By.cssSelector("#search-inp")).sendKeys("AWS");
			
		    //Find element Search by tag  -- not working.. its always showing (0,0) for edureka website**********************************
			//     WebElement a = driver.findElement(By.tagName(""));
		    //     System.out.println(a.getSize());
			       
		    //Find element Login by linktext
		    //      driver.findElement(By.linkText("Log In")).click();
		    
		    //Find element Login by partial linktext
			//      driver.findElement(By.partialLinkText("Log")).click();   
			
	
	}
}
