package com.fidexio.step_definitions;

import com.fidexio.pages.FuelLogPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class FuelLogStepDefinition {

    FuelLogPage fuelLogPage= new FuelLogPage();

    @When("user click on More button")
    public void userClickOnMoreButton() {
        fuelLogPage.MoreButton.click();
    }

    @And("user clicks on Fleet Button")
    public void userClicksOnFleetButton() {
        fuelLogPage.fleetButton.click();
    }

    @And("user clicks on Vehicles Fuel Logs button")
    public void userClicksOnVehiclesFuelLogsButton() {

        fuelLogPage.vehiclesFuelLogsButton.click();
//        BrowserUtils.sleep(3000);
    }

    @And("user clicks on create button")
    public void userClicksOnCreateButton() {
        fuelLogPage.xForVehiclesList.click();

//        BrowserUtils.waitForVisibility(fuelLogPage.createButton, 2000);
        fuelLogPage.createButton.click();

    }

    @And("user clicks on Vehicle Id Left Arrow for selecting car")
    public void userClicksOnVehicleIdLeftArrowForSelectingCar()  {

        fuelLogPage.vehicleIdDropDown.click();
//        BrowserUtils.sleep(3000);
    }

    @And("user cliks on the first car from dropdown menu")
    public void userCliksOnTheFirstCarFromDropdownMenu() {
        fuelLogPage.firstCarSelection.click();
    }
}
