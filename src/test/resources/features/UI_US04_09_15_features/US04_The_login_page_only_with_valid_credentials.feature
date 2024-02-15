Feature: US04 Login page should accessible only with valid credentials
  Scenario: TC01 There should be a valid username and password validating the success message to login
    Given The User goes to Medunna
    Then Click on the user icon at the top right
    And The User cliks Sign in
    And Enter valid username and password
    And Clicks on the remember me button
    And Clicks on the Sign in button
    Then Verifies that the user is logged in with username
    And closes the page






