  Feature: Login for carious applications
  
    Scenario: Invaid username passowrd combination for login into zoho
    Given I am able to access "http://accounts.zoho.in/signin"
    When I update the "zoho" username as "rajitha.test1"
    And I click on the "zoho" next button
    Then I should get the "zoho" error message as "This account cannot be found. Please use a different account or sign up for a new account."