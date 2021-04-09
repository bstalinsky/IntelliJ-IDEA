Feature: Logged in user should be able to checking favorite compositions


  Background: Login into account with correct credentials
    Given User navigates to Mixcloud website
    When User clicks on the login button on page
    And User enters a valid username
    And User enters a valid password
    When User clicks on the log in button
    Then User should be successfully logged in


  Scenario: Go to user profile and checking favorite compositions
    Given User clicks View Profile
    Then User clicks on artist composition profile
