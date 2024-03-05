Feature: Validation of Ticket Booking 

@Regression 
Scenario: Open the flyDubai site and confirm the ticket booking 
	Given User hits the Flydubai url 
	And User enter the route date and no of passengers 
	Then User click on search button 
	Then verify if user lands on the flights result page 
	And user click on the flight tab and select one fare brand 
	Then user select the onward and return flights 
	Then user select inbound flights and verify if system redirects to extras page 
	And user select 10kg additional baggage 
	And user clicks on continue to passenger details hyperlink 
	Then verify if user landed on passenger detail page 
	And user now enter the passenger information 
	And user click on review booking button 
	Then verify if user landed on the review your bookings page 
	And user validates the fare and tax component displayed in the first page is same 