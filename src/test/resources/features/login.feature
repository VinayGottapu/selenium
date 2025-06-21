
Feature: orangeHRM

  Scenario: login scenario
    Given open the browser
   Then enter the Username"<Username>"
   Then enter the Password"<Password>"
   And click on login button
  
   
 Examples:
|Username|Password|
| Admin |	Admin123|
|Admin	|admin123|
|User	  |user123|
|Admin	|user123|
   