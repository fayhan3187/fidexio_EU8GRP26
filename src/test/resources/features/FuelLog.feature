@FIDE-1050
Feature: Creating new Fuel Log for the vehicle.

  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  Scenario: Verify that USER can create new Vehicles Fuel Logs.
    When user click on More button
    And user clicks on Fleet Button
    And user clicks on Vehicles Fuel Logs button
    And user clicks on create button
    And user clicks on Vehicle Id Left Arrow for selecting car
    And user clicks on the first car from dropdown menu
    And user enters 100000.00 as odometer values into related field
    And user enters 30.00 as loaded fuel amount
    And user enters 30.00 as fuel cost per liter
    Then user should see total price should as "900.00"
#    And user enters "07/15/2022" as date
    And user enter "12345qwerty" as invocie reference
#    And user clicks on vendor field
#    And user choose Shell as a vendor
    And user writes "any" test in information field
    And user clicks on save button
    Then user should see the edit button






