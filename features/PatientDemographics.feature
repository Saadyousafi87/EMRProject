Feature: Patient Demographics
In order to get patient demographics.
As a registered user with valid user name and password.
I want to login to the app and click on patient and choose new/search link and enter name, dob, ss, marital status, external id, sex, and license id into who section and enter address, city, state, contry, postal code, emergency contact, phone number and email into the contact section and enter language, ethinicity and rece into the stats section and enter primary insurance information and click create new patient

Scenario: positive test
Given user login to the app with valid user name and password
When user click on patient button and click new/search link
And enter name, dob, ss, marital status, external id, sex and license id into who section
And enter address, city, state, country, postal code, emergency contact, mobile number and email into the contact section
And enter language, ethnicity and race into the stats section
And enter primary insurance information and click create new patient button
Then user receives confirmation message and close the browser