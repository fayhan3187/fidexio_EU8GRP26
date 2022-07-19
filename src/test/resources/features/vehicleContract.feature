@FIDE-1071
Feature: Creating A New Vehicle Contracts Function.
  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  @FIDE-107O
  Scenario: Verify that USER can create A New Vehicle Contracts.
    When user click on More button
    And user clicks on Fleet Button
    And user clicks on Vehicles Contracts button
    And user clicks on create button
    And user clicks on Vehicles type input column
    And user clicks on "car type" from menu
    And user enters Activation Cost 250
    And user clicks Recurring Cost Amount input column
    And user clicks on "Recurring Cost Amount" from select menu
    And user enters Recurring Cost Amount 500
    And user clicks on save button
    Then user should see "New Vehicle contract name" displayed