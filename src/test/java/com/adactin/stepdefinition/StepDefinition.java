package com.adactin.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.BookingHotel;
import com.adactin.pom.BookingItineraryPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.pom.SignInPage;
import com.adactin.pom.SignOutPage;
import com.adactin.runner.Runner;
import com.adactin.utility.FileReaderManager;
import com.adactin.utility.PageObjectManager;
import com.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	public static String firstName;

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		String url = FileReaderManager.getInstance().getCRInstance().getUrlConfig();
		getUrl(url);
	}

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		String userName = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("User Name");
		sendKeysText(pom.getSp().getUsername(), userName);
	}

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		String password = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Password");
		sendKeysText(pom.getSp().getPassword(), password);

	}

	@When("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		clickElement(pom.getSp().getLoginBtn());

	}

	@Then("^It lands to the homepage successfully$")
	public void it_lands_to_the_homepage_successfully() throws Throwable {
		String userName = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("User Name");
		String uName = pom.getSh().getUsername().getAttribute("value").replaceAll("Hello ","").replaceAll("!", "");
		Assert.assertEquals(userName, uName);
		System.out.println("Successfully landed on Login page\n");
	}

	@When("^User select the hotel location from the dropdown list$")
	public void user_select_the_hotel_location_from_the_dropdown_list() throws Throwable {
		String location = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Location");
		dropDownSelect(pom.getSh().getLocation(), "value", location);

	}

	@When("^User select the hotel from the dropdown list$")
	public void user_select_the_hotel_from_the_dropdown_list() throws Throwable {
		String hotels = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Hotels");
		dropDownSelect(pom.getSh().getHotel(), "value", hotels);

	}

	@When("^User select the room type from the dropdown list$")
	public void user_select_the_room_type_from_the_dropdown_list() throws Throwable {
		String roomType = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Room Type");
		dropDownSelect(pom.getSh().getRoomType(), "value", roomType);

	}

	@When("^User select the number of rooms from the dropdown list$")
	public void user_select_the_number_of_rooms_from_the_dropdown_list() throws Throwable {
		String numOfRooms = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Number of Rooms");
		dropDownSelect(pom.getSh().getRoomNos(), "value", numOfRooms);
	}

	@When("^User enter the check in date$")
	public void user_enter_the_check_in_date() throws Throwable {
		String chkInDate = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Check In Date");
		sendKeysText(pom.getSh().getCheckInDate(), chkInDate);

	}

	@When("^User enter the check out date$")
	public void user_enter_the_check_out_date() throws Throwable {
		String chkOutDate = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Check Out Date");
		sendKeysText(pom.getSh().getCheckOutDate(), chkOutDate);

	}

	@When("^User select the number of adults per room from the dropdown list$")
	public void user_select_the_number_of_adults_per_room_from_the_dropdown_list() throws Throwable {
		String adultsPerRoom = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Adults per Room");
		dropDownSelect(pom.getSh().getAdultsPerRoom(), "value", adultsPerRoom);

	}

	@When("^User select the number of childs per room from the dropdown list$")
	public void user_select_the_number_of_childs_per_room_from_the_dropdown_list() throws Throwable {
		String childPerRoom = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Children per Room");
		dropDownSelect(pom.getSh().getChildPerRoom(), "value", childPerRoom);

	}

	@When("^User click the search button for searching the hotel$")
	public void user_click_the_search_button_for_searching_the_hotel() throws Throwable {
		clickElement(pom.getSh().getSearchBtn());

	}

	@Then("^It lands to the search hotel page successfully$")
	public void it_lands_to_the_search_hotel_page_successfully() throws Throwable {
		String pageHeader = pom.getSl().getTitle1().getText();
		Assert.assertEquals("Select Hotel", pageHeader);
		System.out.println("Successfully landed on Select Hotel page\n");

	}

	@When("^User reselects and confirms the selected hotel$")
	public void user_reselects_and_confirms_the_selected_hotel() throws Throwable {
		clickElement(pom.getSl().getRadioBtn());

	}

	@When("^User clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable {
		clickElement(pom.getSl().getContinueBtn());

	}

	@Then("^It lands to the select hotel page successfully$")
	public void it_lands_to_the_select_hotel_page_successfully() throws Throwable {
		System.out.println("VALIDATION PENDING\n");

	}

	@When("^User enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		String firstName = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("First Name");
		sendKeysText(pom.getBh().getFirstName(), firstName);

	}

	@When("^User enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		String lastName = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Last Name");
		sendKeysText(pom.getBh().getLastName(), lastName);

	}

	@When("^User enter the address$")
	public void user_enter_the_address() throws Throwable {
		String billingAddress = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Billing Address");
		sendKeysText(pom.getBh().getAddress(), billingAddress);

	}

	@When("^User enter the credit card number$")
	public void user_enter_the_credit_card_number() throws Throwable {
		String creditCardNo = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Credit Card No.");
		sendKeysText(pom.getBh().getCreditCardNo(), creditCardNo);

	}

	@When("^User enter the credit card type$")
	public void user_enter_the_credit_card_type() throws Throwable {
		String creditCardType = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Credit Card Type");
		dropDownSelect(pom.getBh().getCreditCardType(), "value", creditCardType);

	}

	@When("^User enter the expiry month of the credit card$")
	public void user_enter_the_expiry_month_of_the_credit_card() throws Throwable {
		String expiryMonth = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Expiry Month");
		dropDownSelect(pom.getBh().getcCardExpiryDate(), "value", expiryMonth);

	}

	@When("^User enter the expiry year of the credit card$")
	public void user_enter_the_expiry_year_of_the_credit_card() throws Throwable {
		String expiryYear = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("Expiry Year");
		dropDownSelect(pom.getBh().getcCardExpiryYear(), "value", expiryYear);

	}

	@When("^User enter the credit card cvv number$")
	public void user_enter_the_credit_card_cvv_number() throws Throwable {
		String cVVNumber = FileReaderManager.getInstance().getTestDataInstance().TestDataMeth("CVV Number");
		sendKeysText(pom.getBh().getcCardCVV(), cVVNumber);

	}

	@When("^User booking the room by clicking booknow button$")
	public void user_booking_the_room_by_clicking_booknow_button() throws Throwable {
		clickElement(pom.getBh().getBookNowBtn());

	}

	@Then("^It lands to the booking hotel page successfully$")
	public void it_lands_to_the_booking_hotel_page_successfully() throws Throwable {
		System.out.println("VALIDATION PENDING\n");

	}

	@When("^User click the my itinerary button and confirms$")
	public void user_click_the_my_itinerary_button_and_confirms() throws Throwable {
		clickElement(pom.getBc().getItineraryBtn());

	}

	@Then("^It lands to the booking confirm page successfully$")
	public void it_lands_to_the_booking_confirm_page_successfully() throws Throwable {
		System.out.println("VALIDATION PENDING\n");

	}

	@When("^User search the booked room and cancelling it$")
	public void user_search_the_booked_room_and_cancelling_it() throws Throwable {
		clickElement(pom.getBi().getCancelBtn());

	}

	@When("^User reconfirms the room cancellation$")
	public void user_reconfirms_the_room_cancellation() throws Throwable {
		confirmAlert("ok");

	}

	@Then("^It lands to the booking itineray page successfully$")
	public void it_lands_to_the_booking_itineray_page_successfully() throws Throwable {
		System.out.println("VALIDATION PENDING\n");

	}

	@When("^User click the logout button for signing out$")
	public void user_click_the_logout_button_for_signing_out() throws Throwable {
		clickElement(pom.getSop().getLogoutBtn());

	}

	@Then("^It lands to the signout page successfully$")
	public void it_lands_to_the_signout_page_successfully() throws Throwable {
		System.out.println("VALIDATION PENDING\n");

	}

}
