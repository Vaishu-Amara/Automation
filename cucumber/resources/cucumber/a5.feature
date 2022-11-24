Feature: web application

  Scenario: working on newtours page
    Given user opens newtours website
    When user clicks on register
    Then user need to get country names from dropdown
    And user navigate back to home page
    And user close the window
