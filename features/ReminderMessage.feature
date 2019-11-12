Feature: Reminder Message
In order to send reminder message.
As a registered user with valid user name and password.
I want to login to the app and select the patient from patient finder and click on messages button then click on add new link and enter type, patient, status, to, enter the message and click on send message.

Scenario: positive test
Given user login to  app with valid user name and password.
When user select the patient from patient finder
And click on message button and click on add new link
And enter type, patient, status, to, enter the message and click on send message button
Then user receive confirmation message then close the browser