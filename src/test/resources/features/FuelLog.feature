@FIDE-1050
Feature: Creating new Fuel Log for the vehicle.

  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  Scenario: Verify that USER can create new Vehicles Fuel Logs.
    When user click on More button

