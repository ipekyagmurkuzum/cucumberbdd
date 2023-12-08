
Feature: google search functionality

  @smoke
  Scenario: validate google search is working
    Given browser is open
    And user is on the google main page
    When user enters a text in search box
    And hits enter
    Then user is navigated to the search results