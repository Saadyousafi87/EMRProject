Feature: Medical Billing
In order to create a medical bill.
As a registered user with valid user name and password.
I want to login to the app and select the patient from patient finder then click on payment option from fees option and enter payment method, check/ref number, patient coverage and payment against then click genereate invoice.

Scenario: positive test
Given user login to app with valid user name and password..
When user select patient from patient finder.
And click on fees and click on payment link
And enter payment method, check/ref number, patient, coverage, payment against
And click generate invoice
Then user receives confirmation message and close the browser..