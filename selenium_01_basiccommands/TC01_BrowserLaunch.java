package selenium_01_basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01_BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.get(");
	}

}
