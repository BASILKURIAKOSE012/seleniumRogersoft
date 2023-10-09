package selenium_01_basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_LoadingURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("title - "+title +" url - "+url);
		driver.close();
	}

}
