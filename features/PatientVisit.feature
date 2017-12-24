Feature: Patient Visit
In order to create patient's visit.
As a registered user with valid user name and password.
I want to login to the app and select the patient from patient finder and click on patient/client button and click on visit button and click on create visit button then enter consultation brief description, visit category, facility, billing facility, sensitivity, date of service then click on issue button and enter type, title, reffered by, outcome and click save button and click save button again.

Scenario: Positive test
Given user login to app with valid user name and password
When user select patient from patient finder
And click on patient/client button and click on visits button and click on create visit button
And enter consultation brief description, visit category, facility, billing facility, sensitivity and date of service
And click on issue button and enter type, title, reffered by, out comes, click save button and click save button again
Then user receiving confirmation message and close the browser