package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel {
	public WebDriver driver;

	public BookingHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement creditCardNo;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement cCardExpiryDate;

	@FindBy(id = "cc_exp_year")
	private WebElement cCardExpiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement cCardCVV;

	@FindBy(id = "book_now")
	private WebElement bookNowBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getcCardExpiryDate() {
		return cCardExpiryDate;
	}

	public WebElement getcCardExpiryYear() {
		return cCardExpiryYear;
	}

	public WebElement getcCardCVV() {
		return cCardCVV;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
}
