package selenium_03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_Relative_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// find element by relative xpath and passing the value
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		Thread.sleep(2000);

		// find element by name and click
		driver.findElement(By.name("//input[@class='gNO89b']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
