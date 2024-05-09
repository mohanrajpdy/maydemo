Feature: user can book the hotel using adaction
Scenario: user can login into the Adaction
Given user Can Able to Lunch the Url
When user Can Enter the User Name in UsernameField
And user Can Enter the Password in PasswordField
Then user Can Click the Login Button Move on to Next Page

Scenario: user can search the Hotel
When user Can Select the Location
And user Can Select the Hotel
And user Can Select the RoomType
And User Can Select the NonofRoom
And user Can Select the CheckinDate
And user Can Select the Checkoutdate
And user Can Select the AdultsPerRoom
And user Can Select the ChildrenPerRoom
Then user Can Click the Search Button to Navigate Next Page

Scenario: user can select the Hotel
When User Can Select the Hotel
Then user Can Click the Countinue Button for Move On Next Page

Scenario: user can book a hotel
When user Can Write the First Name in FirstNameField
And user Can Write Last Name in LastNameField
And user Can Write Customer Address in BillingAddressField
And user Can Enter Credit Card Number in CreditCardNoField
And user Can Selct CreditCard Type in CreditCardType Field
And user Can Selct ExpiryDate  in ExpiryDateField
And user Can Select CvvNumber in CvvNumberField
Then user Can Click BookNow Button Move On to Next Page

Scenario: user can booking confirmation
Then user Can Click LogOut Button for LogOutSite