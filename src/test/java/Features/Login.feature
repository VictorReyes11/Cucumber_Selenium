Feature: LoginFeauture

  This feature deals with login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the users email address as Email:admin
    And I enter the following for Login
      | UserName | Password |
      | admin    | password |
    And I click login button
    Then I should see the userform page

  Scenario Outline: Login with correct username and password
    Given I navigate to the login page
    And I enter <username> and <password>
    And I click login button
    Then I should see the userform page

    Examples:
      | UserName | Password |
      | admin    | password |
      | admin    | admin    |
      | testing  | qa       |

    