Feature: Test Login Functionality

  Scenario Outline: As a user, I can login into the dashboard area
    Given I am on the login page
    When I insert <username> and <password>
    Then I should see a message <message>

    Examples: 
      | username | password             | message                        |
      | tomsmith | SuperSecretPassword	| You logged into a secure area! |
      | testA    | testB                | Your username is invalid!      |