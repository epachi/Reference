Feature: github login

  Scenario: login without username and password
    Given user is on github homepage
    When user clicks on Sign in button
    Then user is displayed login screen
    
  Scenario: always pass
    Given given1
    When when1
    Then then1

