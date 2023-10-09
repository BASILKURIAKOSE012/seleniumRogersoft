package selenium_03_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// create object of webdriver wait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		// to close the popup 
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		// to pass the value to input box
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile");
		// to click the search button
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		// to get the index position 1 element
		
		//driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='_4rR01T'])[1]"))).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
