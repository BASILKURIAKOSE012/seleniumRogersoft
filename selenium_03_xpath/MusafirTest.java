package selenium_03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MusafirTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.musafir.com/");
		driver.findElement(By.xpath("//input[@name='Origin']")).sendKeys("Kochi, India (COK)");
		driver.findElement(By.xpath("//input[@name='Destination']")).sendKeys("Dubai International Airport, Dubai, United Arab Emirates (DXB)");
		driver.findElement(By.xpath("//input[@name='StartDate']")).sendKeys("12/10/23");
		driver.findElement(By.xpath("//input[@name='EndDate']")).sendKeys("17/10/23"); 
		driver.findElement(By.xpath("//select[@name='AdultsFlight']")); 
		

	}

}
