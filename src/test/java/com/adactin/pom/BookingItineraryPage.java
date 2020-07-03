package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingItineraryPage {
	public WebDriver driver;

	public BookingItineraryPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Karthik']//parent::td//preceding-sibling::td[4]")
	private WebElement cancelBtn;

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
}
