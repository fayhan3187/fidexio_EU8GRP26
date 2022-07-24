 @FIDE-1059
    Feature:US 35 - Calendar Functionality

  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button
@smoke
  Scenario: Verify that USER can create new event
   Given  User first lands on weekly display
   When  User can change display between Day-Week-Month
   And   User can create event by clicking on time box
   Then User can edit a created event
