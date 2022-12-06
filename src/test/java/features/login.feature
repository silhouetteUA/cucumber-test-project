Feature: Application Login
  Scenario: Home page default login
    Given User is on banking landing page
    When User login to application with username and password
    Then Homepage is populated
    And users cards are displayed