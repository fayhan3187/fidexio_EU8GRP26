@FIDE-1058
Feature: Creating and designing a new survey from "Surveys" module.

  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  Scenario: Verify that all buttons work as expected at the survey design state
    Given user is on the survey page of fidexio page
    When user clicks on create button
    Then user sees "Survey Title" under Title header
    And user clicks on Options button
    Then user sees "Login required" choice at survey creation section
    And user clicks on Design Survey button
    Then user sees "The following fields are invalid:" message on the right

  Scenario: Verify that "Survey created" message appears under the survey


