@Wip
Feature: Creating A New Vehicle Contracts Function.
  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  Scenario : Verify that USER can create A New Vehicle Contracts.
    When user clicks on More button
    And user clicks on Fleet button
    And user clicks on Vehicles Contracts button
    And user clicks on Vehicles Contracts create button
    And user clicks on Vehicles type input column
    And user clicks on the first car type from dropdown menu
    And user enters Activation Cost 250
    And user clicks Recurring Cost Amount input column
    And user clicks on the first Recurring Cost Amount from dropdown menu
    And user enters Recurring Cost Amount 500