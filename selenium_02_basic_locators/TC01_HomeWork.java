package selenium_02_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_HomeWork {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("valid");
		driver.findElement(By.name("password")).sendKeys("valid");
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.partialLinkText("REG")).click();
		driver.close();
		
		
	}
}
