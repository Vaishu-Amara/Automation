Feature: newtours webapplication

  Scenario: newtours web app
    Given user is in newtours
    When user need to enter username and password
    Then user clicks on submit button
    And user takes Screenshot and close the page
