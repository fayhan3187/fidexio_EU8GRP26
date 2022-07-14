package com.fidexio.step_definitions;

import com.fidexio.pages.FuelLogPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class FuelLogStepDefinition {

    FuelLogPage fuelLogPage= new FuelLogPage();

    @When("user click on More button")
    public void userClickOnMoreButton() {
        fuelLogPage.MoreButton.click();
    }


}
