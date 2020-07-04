package com.adactin.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.adactin.utility.TestData;

public class BookingItineraryPage extends TestData {
	public WebDriver driver;

	public BookingItineraryPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCancelBtn() {
		WebElement cancelBtn = driver
				.findElement(By.xpath("//input[@value='" + firstName + "']//parent::td//preceding-sibling::td[4]"));
		return cancelBtn;
	}
}
