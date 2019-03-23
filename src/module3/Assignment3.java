
package module3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Sirisha\\Selenium\\Installation\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().window().maximize();
				
		//Select One way option
		List<WebElement> rb1 = driver.findElements(By.name("tripTabs"));
	    // Create a boolean variable which will hold the value (True/False)
		boolean bVal = false;
		// This statement will return True, in case of first Radio button is selected
		bVal = rb1.get(0).isSelected();
		// This will check that if the bValue is True means if the first radio button is selected
		if(bVal = false)
		     {
		 		 // This will select first Radio button(oneway) if its not selected by default
		            rb1.get(0).click();
		 	 }
	
        //Select Bangalore to Lucknow  
		
	
		driver.findElement(By.xpath("//div[@class='autocomplete-result station-result clearfix airport-item' and @data-iata='BLR']")).click();
//		System.out.println("Dropdown Val:" + s);
//		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[3]/div[1]/div[1]/div/div/input")).sendKeys(s);
	
		
		/*
		 * List<WebElement> options = driver.findElements(By.
		 * xpath("//div[@class='autocomplete-result station-result clearfix airport-item']"
		 * )); System.out.println("Number of elements:" +options.size());
		 * 
		 * for (int i=0; i<options.size();i++){ System.out.println("Dropdown:" +
		 * options.get(i).getAttribute("data-iata")); }
		 * 
		 * for (WebElement option1 : options) {
		 * if("BLR".equals(option1.getAttribute("data-iata").trim())) option1.click();
		 * };
		 */		
		//Select 3 Adult
		
		
		//Select 2 Kids

		
	}
}
