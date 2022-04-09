Feature: LoginAndPasswordTest

  @ValidCredentials
  Scenario Outline: Login with valid data

    Given User is on Login page one
    When User set login: <login>
    And User set password: <password>
    And User click login button correct
    Then User should see welcome message "You are logged in!"

    Examples:
      | login | password  |
      |Bill|12345678|
      |Ann|876544321|