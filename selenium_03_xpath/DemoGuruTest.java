package selenium_03_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuruTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("basil");
		driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("26/05/1991");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("home");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Aluva");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("kerala");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("645667");
		//driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9989787690");
		// contains method
		driver.findElement(By.xpath("//input[contains(@name,'phoneno')]")).sendKeys("9989787690");
		//driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("123@gmail.com");
		//starts with method
		driver.findElement(By.xpath("//input[starts-with(@name,'email')]")).sendKeys("123@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name='res']")).click();
		Thread.sleep(2000);
		// text method
		driver.findElement(By.xpath("//a[text()='Edit Customer']")).click();
		//driver.findElement(By.xpath("//input[@name='sub']")).click();
		Thread.sleep(3000);
//		driver.close();
		
		
		
	}

}
