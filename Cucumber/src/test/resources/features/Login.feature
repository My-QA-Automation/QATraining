  Feature: Login for carious applications
    
    Scenario: Invaid username password combination for login into gmail
    Given I am able to access "http://gmail.com"
    When I update the "gmail" username as "rajitha.test1"
    And I click on the "gmail" next button
    Then I should get the "gmail" error message as "Session is insecured"
    
    Scenario: Invaid username passowrd combination for login into zoho
    Given I am able to access to "http://accounts.zoho.in/signin"
    When I update "zoho" username as "rajitha.test1"
    And I clcik on the "zoho" next button
    Then I should get the "zoho" error message as "This account cannot be found. Please use a different account"
    
      