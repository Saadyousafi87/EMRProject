Feature: Precription
In order to create precription.
As a registered user with valid user name and password.
I want to login to the app and click patient finder button and select the patient and click edit button on pricription then click add button and enter starting date, provider, drug, quantity, medicine units, take, refills and click save.

Scenario: positive test
Given user visit app and login with valid user name and password.
When user click on patient finder button and select patient
And click edit button on precription then click add button
And enter starting date, provider, drug quantity, medicine units, take, refills and click save
Then user get confirmation and close browser