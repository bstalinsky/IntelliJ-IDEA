Feature: Logged in user should be able to search  for necessary music artist and then add to Favorite


  Background: Login into account with correct credentials
    Given User navigates to Mixcloud website
    When User clicks on the login button on page
    And User enters a valid username
    And User enters a valid password
    When User clicks on the log in button
    Then User should be successfully logged in


  Scenario: Add music to favorite
    Given User enters artistname in the Search field
    When User start listening
    Then User clicks add to Favorite
