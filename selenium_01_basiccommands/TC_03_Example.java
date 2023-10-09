package selenium_01_basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.ebay.com/");
		String title = driver.getTitle();
		System.out.println("title 1 - "+title);
		driver.navigate().to("https://www.flipkart.com/");
		String title1 = driver.getTitle();
		System.out.println("title 2 -  "+title1);
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		String title2 = driver.getTitle();
		System.out.println("title 3 - "+title2);
		Thread.sleep(2000);
		driver.navigate().back();
		String url = driver.getCurrentUrl();
		System.out.println("url 1 -  "+url);
		Thread.sleep(2000);
		driver.navigate().forward();
		String title3 = driver.getTitle();
		System.out.println("title 4 - "+title3);
		String url1 = driver.getCurrentUrl();
		System.out.println("url 2 - "+url1);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		String url2 = driver.getCurrentUrl();
		System.out.println("url 3 - "+url2);
		driver.navigate().refresh();
		driver.close();
		
	}

}
