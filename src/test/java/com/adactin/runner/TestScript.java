package com.adactin.runner;

import org.junit.Test;

import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.BookingHotel;
import com.adactin.pom.BookingItineraryPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.pom.SignInPage;
import com.adactin.pom.SignOutPage;
import com.baseclass.BaseClass;

public class TestScript extends BaseClass {

	@Test
	private void testAdactin() {

		driver = browserLaunch("chrome");
		getUrl("http://adactinhotelapp.com/");

		SignInPage sp = new SignInPage(driver);
		sendKeysText(sp.getUsername(), "PavithraN");
		sendKeysText(sp.getPassword(), "Pavi@2426");
		clickElement(sp.getLoginBtn());

		SearchHotel sh = new SearchHotel(driver);
		dropDownSelect(sh.getLocation(), "value", "Sydney");
		dropDownSelect(sh.getHotel(), "value", "Hotel Creek");
		dropDownSelect(sh.getRoomType(), "value", "Standard");
		dropDownSelect(sh.getRoomNos(), "value", "1");
		sendKeysText(sh.getCheckInDate(), "21/05/2020");
		sendKeysText(sh.getCheckOutDate(), "22/05/2020");
		dropDownSelect(sh.getAdultsPerRoom(), "value", "2");
		dropDownSelect(sh.getChildPerRoom(), "value", "0");
		clickElement(sh.getSearchBtn());

		SelectHotel sl = new SelectHotel(driver);
		clickElement(sl.getRadioBtn());
		clickElement(sl.getContinueBtn());

		BookingHotel bh = new BookingHotel(driver);
		sendKeysText(bh.getFirstName(), "Karthik");
		sendKeysText(bh.getLastName(), "Tony");
		sendKeysText(bh.getAddress(), "New york city, America");
		sendKeysText(bh.getCreditCardNo(), "1234132412341324");
		dropDownSelect(bh.getCreditCardType(), "value", "MAST");
		dropDownSelect(bh.getcCardExpiryDate(), "value", "6");
		dropDownSelect(bh.getcCardExpiryYear(), "value", "2022");
		sendKeysText(bh.getcCardCVV(), "777");
		clickElement(bh.getBookNowBtn());

		BookingConfirmPage bc = new BookingConfirmPage(driver);
		clickElement(bc.getItineraryBtn());

		BookingItineraryPage bi = new BookingItineraryPage(driver);
		clickElement(bi.getCancelBtn());

		confirmAlert("ok");

		SignOutPage sop = new SignOutPage(driver);
		clickElement(sop.getLogoutBtn());
		
		browserClose("close");

	}

}
