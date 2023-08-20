Feature: Testing Book APIs

  Scenario: Get User Details
    Given the base API endpoint is "https://simple-books-api.glitch.me"
    When I make a POST request with bookid "5" and name "Jim"      
    Then the response status code should be 201
    And the response body contains "true"
    And I make a GET request with orderId from previous call "orderId"
