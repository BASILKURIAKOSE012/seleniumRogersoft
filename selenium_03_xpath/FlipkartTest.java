package selenium_03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		// to close the popup 
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		// to pass the value to input box
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile");
		// to click the search button
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		// to get the index position 1 element
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
