@FIDE-1079
Feature:  Sales Functionality S4-Emre

	#As a Sales Manager, I should be able to create and edit a new customers from "Sales" module

  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "salesmanager35@info.com"
    And user enters password "salesmanager"
    And user clicks to login button

  @FIDE-1078
  Scenario: : Verify that USER can create and edit a New Customers
    When user click on Sales button
    And user clicks on Customers Button on menu
    And user clicks on  Create button
    And user fill all inputt
    And user click on save button
    And user clicks edit button
    And user user change  name field
    And user clicks save button
    And user clicks on Customers Button on menu







