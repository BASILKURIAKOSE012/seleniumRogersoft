package selenium_02_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_GoogleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// find element by id and passing the value
	    driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
//	    WebElement text = driver.findElement(By.id("APjFqb"));
//	    System.out.println(text);
		Thread.sleep(2000);
		
		//find element by name and click
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
