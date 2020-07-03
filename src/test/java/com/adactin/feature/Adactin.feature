Feature: Testing hotel booking and cancellation functionalities in adactin application

@Login
Scenario: Checking the valid username and password for login function
Given User launch the adactin application
When User enter the valid username
And User enter the valid password
And User click the login button
Then It lands to the homepage successfully 

@SearchHotel
Scenario: User searching the hotel in application
When User select the hotel location from the dropdown list
And User select the hotel from the dropdown list
And User select the room type from the dropdown list
And User select the number of rooms from the dropdown list
And User enter the check in date
And User enter the check out date
And User select the number of adults per room from the dropdown list
And User select the number of childs per room from the dropdown list
And User click the search button for searching the hotel
Then It lands to the search hotel page successfully

@SelectHotel
Scenario: User selecting and confirming the hotel in the application
When User reselects and confirms the selected hotel
And User clicks the continue button
Then It lands to the select hotel page successfully

@BookingHotel
Scenario: User booking the room in the hotel and making payment
When User enter the first name
And User enter the last name
And User enter the address 
And User enter the credit card number
And User enter the credit card type
And User enter the expiry month of the credit card 
And User enter the expiry year of the credit card
And User enter the credit card cvv number
And User booking the room by clicking booknow button
Then It lands to the booking hotel page successfully

@BookingConfirm
Scenario: User confirming the booked room in the hotel
When User click the my itinerary button and confirms
Then It lands to the booking confirm page successfully

@BookingCancel
Scenario: User cancel the booked room in the hotel
When User search the booked room and cancelling it
And User reconfirms the room cancellation
Then It lands to the booking itineray page successfully

@Logout
Scenario: User signing out from the hotel application
When User click the logout button for signing out
Then It lands to the signout page successfully 





