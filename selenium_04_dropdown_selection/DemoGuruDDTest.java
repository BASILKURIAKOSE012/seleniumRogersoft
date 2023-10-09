package selenium_04_dropdown_selection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuruDDTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		// to give implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// to select trip type radio button
		driver.findElement(By.xpath("(//input[@name='tripType'])[2]")).click();
		
		// to select passenger count
		WebElement passengerDropDown = driver.findElement(By.xpath("//select[@name='passCount']"));
		Select s1 = new Select(passengerDropDown);
		s1.selectByVisibleText("2");
		
		// to select departing port
		WebElement departingDropDown = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s2 = new Select(departingDropDown);
		s2.selectByVisibleText("Paris");
		
		// to select from month
		WebElement fromMonthDropDown = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select s3 = new Select(fromMonthDropDown);
		s3.selectByVisibleText("October");
		
		// to select from day
		WebElement fromDayDropDown = driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select s4 = new Select(fromDayDropDown);
		s4.selectByVisibleText("10");
		
		// to select to port
		WebElement arrivingDropDown = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s5 = new Select(arrivingDropDown);
		s5.selectByVisibleText("London");
		
		// to select to month
		WebElement toMonthDropDown = driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select s6 = new Select(toMonthDropDown);
		s6.selectByVisibleText("October");
		
		// to select to day 
		WebElement toDayDropDown = driver.findElement(By.xpath("//select[@name='toDay']"));
		Select s7 = new Select(toDayDropDown);
		s7.selectByVisibleText("15");
		
		// to select seat class radio button
		driver.findElement(By.xpath("(//input[@name='servClass'])[2]")).click();
		
		// to select airlines
		WebElement airLineDropDown = driver.findElement(By.xpath("//select[@name='airline']"));
		Select s8 = new Select(airLineDropDown);
		s8.selectByVisibleText("Blue Skies Airlines");
		Thread.sleep(2000);
		
		// to click continue button
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
