package com.baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassCheck extends BaseClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();
	
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
	Select sc = new Select(findElement);
	List<WebElement> options = sc.getOptions();
	
	for (WebElement webElement : options) {
		System.out.println(webElement.getText());	
	}
	
	getAllDropdownOptions(findElement);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String windowTitle = getWindowTitle(driver);
	System.out.println(windowTitle);
}
}
