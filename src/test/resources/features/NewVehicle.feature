Feature: Default
	@FIDE-1069
	

	Scenario: US-24 Verify that USER can create a new VEHICLE.
		Feature:Creating A New Vehicle  Function.
		Background:User should be at the "url" page
		    Given user is on the login page of fidexio page
		    When user enters username "posmanager10@info.com"
		    And user enters password "posmanager"
		    And user clicks to login button

		    When user clicks on More button
		    And user click on Fleet button
		    And user clicks on Create button
		    And user enters Model
		    And user enters License Plate
		    And user select from the tag from Dropdown Menu
		    And user select from the Driver from Dropdown Menu
		    And user enters Location
		    And user enters Chasis Number
		    And user enters Model Year
		    And user enters Seats Number
		    And user enters Doors Number
		    And user enters Color
		    And user enters Last Odometer
		    And user enters Immatriculation Date
		    And user enters Catalog Value
		    And user enters Residual Value
		    And user select from the Transmission from Dropdown Menu
		    And user select from the Fuel Type from Dropdown Menu
		    And user enters CO Emissions
		    And user enters Horsepower
		    And user enters Horsepower Taxation
		    And user enters Power
		    And user click save button
		    Then User Checks the Vehicle Data saved