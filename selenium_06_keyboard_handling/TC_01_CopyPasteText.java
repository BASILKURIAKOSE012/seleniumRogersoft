package selenium_06_keyboard_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_CopyPasteText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement copyText = driver.findElement(By.xpath("//input[@name='firstName']"));
		
		copyText.sendKeys(Keys.SHIFT,"basil");
		
		copyText.sendKeys(Keys.CONTROL,"a");
		
		copyText.sendKeys(Keys.CONTROL,"c");
		
		WebElement pasteText = driver.findElement(By.xpath("//input[@name='lastName']"));
		
		pasteText.sendKeys(Keys.CONTROL,"v");
	}

}
