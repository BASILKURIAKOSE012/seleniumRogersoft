package selenium_03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_HomeWork_Relative_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("valid");
		driver.findElement(By.name("password")).sendKeys("valid");
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.partialLinkText("REG")).click();
		//to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("basil");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kuriakose");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2680222");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("basil@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("home");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("kochi");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("kerala");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("681111");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("india");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("basil@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
