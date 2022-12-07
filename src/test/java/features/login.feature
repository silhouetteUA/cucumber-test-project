Feature: Application Login
  Scenario: Home page default login 1
    Given User is on banking landing page
    When User login to application with username "Max" and password "Max123"
    Then Homepage is populated
    And cards are displayed "yes"

  Scenario: Home page default login 2
    Given User is on banking landing page
    When User login to application with username "Jay" and password "Jay123"
    Then Homepage is populated
    And cards are displayed "no"

#  Scenario: Home page default login 3
#    Given User is on banking landing page
#    When User login to application with the details
#      | username_jenny | password_123 | email@gmail.com | tel_380632103372 | address_Ukraine |
#    Then Homepage is populated
#    And cards are displayed "no"

  Scenario Outline: multiple values
    Given User is on banking landing page
    When Account login with <username> and password <password> and email <email>
    Then Homepage is populated
    And cards are displayed "no"
    Examples:
      | username | password | email |
      | user1    | pass1    | mail1 |
      | user2    | pass2    | mail2 |
      | user3    | pass3    | mail3 |
