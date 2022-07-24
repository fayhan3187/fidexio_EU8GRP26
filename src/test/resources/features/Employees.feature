@US_77

Feature: As a Posmanager, I should be able to create and edit a new employee from "Employees" module

  Background: User logged in on the fidexio page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button


    Scenario: Verify that all buttons work as expected at the employees stage
      When User click to Employees button
      Then  user see Employees section
      And User click to create button
      Then User see Create employees section
      And User click to back button
      Then  user see Employees section
      And User click to Import button
      Then User see import section
      And User click to back button
      Then  user see Employees section
      And User click to Advanced Search button
      Then User see advanced search
      And User click to Filters button
      Then user see Filters dropdown
      And User click to Group By button
      Then user see Group By dropdown
      And User click to Favorites button
      Then User see Favorites dropdown
      And User click Search bar and write anything
      Then User see search result
      And User click to List button
      Then Employees profiles appears as a list
      And User click to Kanban button
      Then Employees profiles appears as a Kanban

      Scenario:   "Employee created" message appears under full profile.
        When User click to Employees button
        And User click to any employees
        Then User see Employee created message appears under full profile.

      Scenario: user should be able to see created employee is listed after clicking the Employees module
        When User click to Employees button
        And User click to create button
        Then User type name on the Name bar
        And User click to Save button
        When User click to Employees button
        Then User see created employee is listed







