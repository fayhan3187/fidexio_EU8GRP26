@FIDE-1058
Feature: Creating and designing a new survey from "Surveys" module.

  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  @FIDE-1082 @smoke
  Scenario: Verify that all buttons work as expected at the survey design state
    When user is on the survey page of fidexio page
    And user clicks on survey create button
    Then user sees "Survey Title" under Title header
    And user clicks on Options button
    Then user sees "Login required" choice at survey creation section
    And user clicks on Design Survey button


  @FIDE-1083
  Scenario: Verify that "Survey created" message appears under the survey
    When user is on the survey page of fidexio page
    And user clicks on survey create button
    And user enters title name at the Survey Title field
    And user clicks on save button
    Then user sees "Survey created" message under Today line


  @FIDE-1084
  Scenario: Verify that user sees created survey is listed at Surveys module
    When user is on the survey page of fidexio page
    Then user sees the new created survey on the Surveys page






