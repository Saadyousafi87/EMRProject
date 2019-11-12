Feature: Patient Schedule
In order to schedule a patient.
As a registered user with valid user name and password.
I want to login to the app and click on calender buton and click on new appointment button and enter category, date, time, title, patient, provider, room number and comment and click save.

Scenario: positive test
Given user login  the app with valid user name and password
When user click on calender button
And click on new appointment button
And enter category, date, time, title, patient, provider, room number, comments and click save
Then user receive confirmation message and close the browser