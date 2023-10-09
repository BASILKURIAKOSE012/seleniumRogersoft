package selenium_04_dropdown_selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc_01_Amazon_DropDownTeest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		// to create webelent object and save the select element
		
		WebElement dropDown  = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select(dropDown);
		select.selectByVisibleText("Amazon Devices");
		//https://demo.guru99.com/test/newtours/reservation.php

	}

}
