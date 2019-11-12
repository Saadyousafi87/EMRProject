Feature: Electronic Medical Record
In order to create Electronic Medical Record.
As a registered user with valid user name and password.
I want to login to the app and click patient finder button and select the patient and click edit button on medical problems and click add then enter problem type, title, begin date, end date, occurrance, reffered by, outcome and click save then select allergies and click edit button and click add button then enter type, title, begin date, end date, occurrance, severity, reaction, reffered by, outcome and click save and select medication edit button and click add button then enter type, title, begin date, end date, occurrance, reffered by, outcome and click save and select immunization button and enter date, time, administered, name and title of immunization administration, date immunization statement given, immunization order provider and click save immunization button.

Scenario: positive test
Given user visit the app and login with valid user name and password
When user select patient and click edit button on medical problems
And click add and enter problem type, title begin date, end date, occurrance, reffered by, outcome and click save
And select allergies edit button and click add button then enter type, title, begin date, end date, occurrance, severity, reffered by, outcome and click save
And select medication edit button and click add button then enter type, title, begin date, end date, occurrance, reffered by, outcome and click save
And select immunization edit button and enter date, time, name, title of immunization administrator, date immunization statement given, immunization order provider and click save immunization button
Then user gets comfirmation message and close browser