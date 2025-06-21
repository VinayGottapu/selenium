
@tag
Feature: orangeHRM
  
  Scenario: login scenario
    Given open browser
    Then enter valid username
    Then enter valid password
    And click login button

 
  Scenario: Admin page
  Given open admin page section
  Then enter username
  Then choose user role 
  Then choose Admin from dropdown
  Then enter Employee Name
  Then click status
  Then choose Disabled from dropdown
  And click on search button
  
  
  Scenario: Add user
  Given click on add user button
  Then click on user role dropdown button
  Then select ESS
  Then enter employee1 name
  Then click on statusdropdown button
  Then select enabled option
  Then enter username1
  Then enter password
  Then reenter the password to conform
  And click on save
  
  
  Scenario: logout scenario
  Given Admin/User Management page
  Then go to Admin Admin profile
  Then click on the drop down option
  And select Logout
  Then close the browser