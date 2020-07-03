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

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		String url = FileReaderManager.getInstance().getCRInstance().getUrlConfig();
		getUrl(url);
	}

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		sendKeysText(pom.getSp().getUsername(), "PavithraN");
	}

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		sendKeysText(pom.getSp().getPassword(), "Pavi@2426");

	}

	@When("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		clickElement(pom.getSp().getLoginBtn());

	}

	@Then("^It lands to the homepage successfully$")
	public void it_lands_to_the_homepage_successfully() throws Throwable {
		//Assert.assertEquals("a", "A");
		System.out.println("Validation Pending");
	}

	@When("^User select the hotel location from the dropdown list$")
	public void user_select_the_hotel_location_from_the_dropdown_list() throws Throwable {
		dropDownSelect(pom.getSh().getLocation(), "value", "Sydney");

	}

	@When("^User select the hotel from the dropdown list$")
	public void user_select_the_hotel_from_the_dropdown_list() throws Throwable {
		dropDownSelect(pom.getSh().getHotel(), "value", "Hotel Creek");

	}

	@When("^User select the room type from the dropdown list$")
	public void user_select_the_room_type_from_the_dropdown_list() throws Throwable {
		dropDownSelect(pom.getSh().getRoomType(), "value", "Standard");

	}

	@When("^User select the number of rooms from the dropdown list$")
	public void user_select_the_number_of_rooms_from_the_dropdown_list() throws Throwable {
		dropDownSelect(pom.getSh().getRoomNos(), "value", "1");
	}

	@When("^User enter the check in date$")
	public void user_enter_the_check_in_date() throws Throwable {
		sendKeysText(pom.getSh().getCheckInDate(), "21/05/2020");

	}

	@When("^User enter the check out date$")
	public void user_enter_the_check_out_date() throws Throwable {
		sendKeysText(pom.getSh().getCheckOutDate(), "22/05/2020");

	}

	@When("^User select the number of adults per room from the dropdown list$")
	public void user_select_the_number_of_adults_per_room_from_the_dropdown_list() throws Throwable {
		dropDownSelect(pom.getSh().getAdultsPerRoom(), "value", "2");

	}

	@When("^User select the number of childs per room from the dropdown list$")
	public void user_select_the_number_of_childs_per_room_from_the_dropdown_list() throws Throwable {
		dropDownSelect(pom.getSh().getChildPerRoom(), "value", "0");

	}

	@When("^User click the search button for searching the hotel$")
	public void user_click_the_search_button_for_searching_the_hotel() throws Throwable {
		clickElement(pom.getSh().getSearchBtn());

	}

	@Then("^It lands to the search hotel page successfully$")
	public void it_lands_to_the_search_hotel_page_successfully() throws Throwable {
		System.out.println("Validation Pending");

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
		System.out.println("Validation Pending");

	}

	@When("^User enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		sendKeysText(pom.getBh().getFirstName(), "Karthik");

	}

	@When("^User enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		sendKeysText(pom.getBh().getLastName(), "Tony");

	}

	@When("^User enter the address$")
	public void user_enter_the_address() throws Throwable {
		sendKeysText(pom.getBh().getAddress(), "New york city, America");

	}

	@When("^User enter the credit card number$")
	public void user_enter_the_credit_card_number() throws Throwable {
		sendKeysText(pom.getBh().getCreditCardNo(), "1234132412341324");

	}

	@When("^User enter the credit card type$")
	public void user_enter_the_credit_card_type() throws Throwable {
		dropDownSelect(pom.getBh().getCreditCardType(), "value", "MAST");

	}

	@When("^User enter the expiry month of the credit card$")
	public void user_enter_the_expiry_month_of_the_credit_card() throws Throwable {
		dropDownSelect(pom.getBh().getcCardExpiryDate(), "value", "6");

	}

	@When("^User enter the expiry year of the credit card$")
	public void user_enter_the_expiry_year_of_the_credit_card() throws Throwable {
		dropDownSelect(pom.getBh().getcCardExpiryYear(), "value", "2022");

	}

	@When("^User enter the credit card cvv number$")
	public void user_enter_the_credit_card_cvv_number() throws Throwable {
		sendKeysText(pom.getBh().getcCardCVV(), "777");

	}

	@When("^User booking the room by clicking booknow button$")
	public void user_booking_the_room_by_clicking_booknow_button() throws Throwable {
		clickElement(pom.getBh().getBookNowBtn());

	}

	@Then("^It lands to the booking hotel page successfully$")
	public void it_lands_to_the_booking_hotel_page_successfully() throws Throwable {
		System.out.println("Validation Pending");

	}

	@When("^User click the my itinerary button and confirms$")
	public void user_click_the_my_itinerary_button_and_confirms() throws Throwable {
		clickElement(pom.getBc().getItineraryBtn());

	}

	@Then("^It lands to the booking confirm page successfully$")
	public void it_lands_to_the_booking_confirm_page_successfully() throws Throwable {
		System.out.println("Validation Pending");

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
		System.out.println("Validation Pending");

	}

	@When("^User click the logout button for signing out$")
	public void user_click_the_logout_button_for_signing_out() throws Throwable {
		clickElement(pom.getSop().getLogoutBtn());

	}

	@Then("^It lands to the signout page successfully$")
	public void it_lands_to_the_signout_page_successfully() throws Throwable {
		System.out.println("Validation Pending");

	}

}
