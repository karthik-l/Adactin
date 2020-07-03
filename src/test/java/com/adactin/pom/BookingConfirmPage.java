package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage {
	public WebDriver driver;

	public BookingConfirmPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "my_itinerary")
	private WebElement itineraryBtn;
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getItineraryBtn() {
		return itineraryBtn;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
}
