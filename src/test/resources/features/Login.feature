#@FIDE-967 user story
@FIDE-983 @smoke  #FIDE-983 Test Execution
Feature: Fidexio Login feature

  Background: User in "url" page
    Given user is on the login page of fidexio page

  @FIDE-977 #FIDE-977 Test Case
  Scenario Outline: Positive Login Scenarios
    When user enters username "<Username>"
    And user enters password "<Password>"
    And user clicks to login button
    Then user sees "<UserID>" in the title


    Examples: Search values we are going to be using in this scenario is as below table
      | Username                | Password     | UserID         |
      | salesmanager35@info.com | salesmanager | salesmanager35 |
      | posmanager101@info.com  | posmanager   | posmanager101  |
