Feature: Logged in user should be able to search  for necessary music artist and then delete him from favorite


  Background: Login into account with correct credentials
    Given User navigates to Mixcloud website
    When User clicks on the login button on page
    And User enters a valid username
    And User enters a valid password
    When User clicks on the log in button
    Then User should be successfully logged in


  Scenario: Delete favorite artist song sector "Favorites"
    Given User clicks Favorites
    Then User clicks on remove Favorite