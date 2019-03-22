package module2;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait; 

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Sirisha\\Selenium\\Installation\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//PageLoad
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Script timeout
		//driver.manage().timeouts().setScriptTimeout(arg1, arg2);
		
		//Find element Search by name and pass "Selenium"
	    driver.findElement(By.name("user_v1[query]")).sendKeys("Selenium");
	    
	  //Find element Search button by Xpath and click
	    driver.findElement(By.xpath("//*[@id='search-button-top']")).click();
	    
	  //Explicit wait until Selenium course link is clickable
	    WebDriverWait wait = new WebDriverWait(driver, 10);		
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-training-courses']/a[1]/div[1]")));
		e.click();
		
		//Get the Page Title and validate if it is “Selenium 3.0 WebDriver Online Training"
    	String AppTitle = driver.getTitle();
        boolean AppTitleResult = AppTitle.equals("Selenium 3.0 WebDriver Online Training");
		System.out.println(AppTitleResult + "-" + AppTitle);
		
		//Navigate to previous page using Back button
		driver.navigate().back();
	 		
		//Wait until page load and select All courses
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		WebElement e1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbar']/ul/li[2]/a")));
		e1.click();
		
		
		//Fluent wait
	/*	FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		*/
		
	}

}
