@FIDE-1064
Feature: Default

	#Verify that USER can see these menus on the left side under the Fleet Module.
	@FIDE-1063
	Scenario: Test Fleet Menu Options
		Background: User should be at the "Url" page
		Given user is on the login page of fidexio page
		When user enters username "posmanager10@info.com"
		And user enters password "posmanager"
		Then user clicks to login button
		#Vehicles
		And User see Vehicles option left side under the Fleet Module. 
		And User see Vehicles Odometer option left side under the Fleet Module 
		And User see Vehicle Costs option left side under the Fleet Module 
		And User see Vehicles Contracts option left side under the Fleet Module 
		And User see Vehicles Fuel Logs option left side under the Fleet Module 
		And User see Vehicles Services Logs option left side under the Fleet Module
		#Reporting
		And User see Costs option left side under the Fleet Module 
		And User see Indicative Costs option left side under the Fleet Module
		#Configuration
		And User see Vehicle Model option left side under the Fleet Module 
		And User see Model make of Vehicle option left side under the Fleet Module 
		And User see Service Types option left side under the Fleet Module 
		And User see Contract Types option left side under the Fleet Module 
		And User see Vehicle status option left side under the Fleet Module 
		Then User see Vehicle Tags option left side under the Fleet Module