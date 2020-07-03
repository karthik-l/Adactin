$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing hotel booking and cancellation functionalities in adactin application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-function",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the valid username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the valid password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 1996971800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_username()"
});
formatter.result({
  "duration": 401190700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_valid_password()"
});
formatter.result({
  "duration": 234981900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 10477493600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_homepage_successfully()"
});
formatter.result({
  "duration": 222500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User searching the hotel in application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-searching-the-hotel-in-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SearchHotel"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User select the hotel location from the dropdown list",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User select the hotel from the dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User select the room type from the dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User select the number of rooms from the dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enter the check in date",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enter the check out date",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User select the number of adults per room from the dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User select the number of childs per room from the dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User click the search button for searching the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "It lands to the search hotel page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_the_hotel_location_from_the_dropdown_list()"
});
formatter.result({
  "duration": 292277700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_hotel_from_the_dropdown_list()"
});
formatter.result({
  "duration": 202653400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_room_type_from_the_dropdown_list()"
});
formatter.result({
  "duration": 168086500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_number_of_rooms_from_the_dropdown_list()"
});
formatter.result({
  "duration": 130668000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_check_in_date()"
});
formatter.result({
  "duration": 199373300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_check_out_date()"
});
formatter.result({
  "duration": 190430200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_number_of_adults_per_room_from_the_dropdown_list()"
});
formatter.result({
  "duration": 181466800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_number_of_childs_per_room_from_the_dropdown_list()"
});
formatter.result({
  "duration": 121743100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_search_button_for_searching_the_hotel()"
});
formatter.result({
  "duration": 1421997400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_search_hotel_page_successfully()"
});
formatter.result({
  "duration": 176200,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User selecting and confirming the hotel in the application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-selecting-and-confirming-the-hotel-in-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@SelectHotel"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "User reselects and confirms the selected hotel",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User clicks the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "It lands to the select hotel page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_reselects_and_confirms_the_selected_hotel()"
});
formatter.result({
  "duration": 175080800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_continue_button()"
});
formatter.result({
  "duration": 1073671500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_select_hotel_page_successfully()"
});
formatter.result({
  "duration": 138000,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "User booking the room in the hotel and making payment",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-booking-the-room-in-the-hotel-and-making-payment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@BookingHotel"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User enter the first name",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User enter the last name",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enter the address",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User enter the credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enter the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enter the expiry month of the credit card",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User enter the expiry year of the credit card",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enter the credit card cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User booking the room by clicking booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "It lands to the booking hotel page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_first_name()"
});
formatter.result({
  "duration": 261261000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_last_name()"
});
formatter.result({
  "duration": 210357200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_address()"
});
formatter.result({
  "duration": 274973300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_credit_card_number()"
});
formatter.result({
  "duration": 266604800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_credit_card_type()"
});
formatter.result({
  "duration": 160451500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_expiry_month_of_the_credit_card()"
});
formatter.result({
  "duration": 208925600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_expiry_year_of_the_credit_card()"
});
formatter.result({
  "duration": 314054700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_credit_card_cvv_number()"
});
formatter.result({
  "duration": 347902800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_booking_the_room_by_clicking_booknow_button()"
});
formatter.result({
  "duration": 184359400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_booking_hotel_page_successfully()"
});
formatter.result({
  "duration": 110500,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "User confirming the booked room in the hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-confirming-the-booked-room-in-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@BookingConfirm"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "User click the my itinerary button and confirms",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "It lands to the booking confirm page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_the_my_itinerary_button_and_confirms()"
});
formatter.result({
  "duration": 7201709600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_booking_confirm_page_successfully()"
});
formatter.result({
  "duration": 239300,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "User cancel the booked room in the hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-cancel-the-booked-room-in-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@BookingCancel"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "User search the booked room and cancelling it",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "User reconfirms the room cancellation",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "It lands to the booking itineray page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_search_the_booked_room_and_cancelling_it()"
});
formatter.result({
  "duration": 301478200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_reconfirms_the_room_cancellation()"
});
formatter.result({
  "duration": 26955200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_booking_itineray_page_successfully()"
});
formatter.result({
  "duration": 114200,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "User signing out from the hotel application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-signing-out-from-the-hotel-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 54,
      "name": "@Logout"
    }
  ]
});
formatter.step({
  "line": 56,
  "name": "User click the logout button for signing out",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "It lands to the signout page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_the_logout_button_for_signing_out()"
});
formatter.result({
  "duration": 2081929300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_signout_page_successfully()"
});
formatter.result({
  "duration": 110100,
  "status": "passed"
});
});