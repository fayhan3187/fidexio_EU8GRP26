Feature: Fidexio Login feature

  Background: User should be at the "url" page
    Given user is at the login page of fidexio application

  @smoke
  Scenario Outline: Users can log in with valid credentials.
    When user enters username "<Username>"
    And user enters password "<Password>"
    And user clicks on the Log in button
    Then user sees "<UserID>" in the title

    Examples: The credentials that we are going to use in this scenario are as below table
      | Username                | Password     | UserID         |
      | salesmanager15@info.com | salesmanager | salesmanager15 |
      | posmanager10@info.com   | posmanager   | posmanager10   |







