package com.adactin.utility;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.BookingHotel;
import com.adactin.pom.BookingItineraryPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.pom.SignInPage;
import com.adactin.pom.SignOutPage;

public class PageObjectManager {
	public static WebDriver driver;

	private SignInPage sp;
	private SearchHotel sh;
	private SelectHotel sl;
	private BookingHotel bh;
	private BookingConfirmPage bc;
	private BookingItineraryPage bi;
	private SignOutPage sop;

	@SuppressWarnings("static-access")
	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public SignInPage getSp() {
		sp = new SignInPage(driver);
		return sp;
	}

	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getSl() {
		sl = new SelectHotel(driver);
		return sl;
	}

	public BookingHotel getBh() {
		bh = new BookingHotel(driver);
		return bh;
	}

	public BookingConfirmPage getBc() {
		bc = new BookingConfirmPage(driver);
		return bc;
	}

	public BookingItineraryPage getBi() {
		bi = new BookingItineraryPage(driver);
		return bi;
	}

	public SignOutPage getSop() {
		sop = new SignOutPage(driver);
		return sop;
	}

}
