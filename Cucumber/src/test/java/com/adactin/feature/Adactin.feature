Feature: Login Booking Hotel In Adactin Application
@smoketest
Scenario: Check Login With Valid Credentials
Given User Launch Application
When User Enter UserName In UserName and Password Field as
|gowthamkg25|gowtham|
Then User Click Login Button And It Navigate To Search Hotel Page 
@sanity
Scenario: Search Hotel With Valid Input And Search
When User Select Location
And User Select Hotel
And User Selet Room Type
And User Select Number Of Rooms
And User Enter Check In Date
And User Enter Check Out Date
And User Select Adults Per Room
And User Select Children Per Room
Then User Select Search Button
@UnitTest
Scenario: Select Hotel from Hotel List
When User Select Hotel By Radio Button
Then User Select Select Button
@UnitTest2
Scenario: To Confirm Booking In Hotel
When User Enters First Name
And User Enters Last Name
And User Enters Billing Address
And User Enters Digit Credit Card Number
And User Select Credit Card Type
And User Select Expiry Month 
And User Select Expiry Year
And User Enters CVV Number
Then Click BooK Now Button
 @RegressionTest 
Scenario: Booking Confirmation
When User Click Booked Itinerary to check booking Conformation
Then Click Logout