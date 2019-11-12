Feature: pharmacy
In order to add pharmacy.
As a registered user with valid user name and password.
I want to login to the app and click addministration button and enter name, address, city, state, zip, email, phone and click save button.

Scenario: positive test
Given user visit app and login with valid username and password.
When user click on addministration button
And enter name, address, city, state, zip, email, phone
And click save button
Then userr get confirmation message and close browser