package com.fidexio.step_definitions;

import com.fidexio.pages.VehicleContractPage;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class VehicleContractStepDefinition {


    VehicleContractPage vehicleContractPage = new VehicleContractPage();


    @When("user clicks on More button")
    public void userClicksOnMoreButton() {
        vehicleContractPage.moreButton.click();
    }

    @And("user clicks on Fleet button")
    public void userClicksOnFleetButton() {
        vehicleContractPage.fleetButton.click();
    }
    @And("user clicks on Vehicles Contracts button")
    public void userClicksOnVehiclesContractsButton() {
        vehicleContractPage.oeMenuTextSpan.click();
        //BrowserUtils.sleep(5);
    }

    @And("user clicks on Vehicles Contracts create button")
    public void userClicksOnVehiclesContractsCreateButton() {
        vehicleContractPage.btnButton.click();
    }

    @And("user clicks on Vehicles type input column")
    public void userClicksOnVehiclesTypeInputColumn() {
        vehicleContractPage.dropdownButton.click();
    }

    @And("user clicks on the first car type from dropdown menu")
    public void userClicksOnTheFirstCarTypeFromDropdownMenu() {
        vehicleContractPage.firstCarType.click();
    }

    @And("user enters Activation Cost {int}")
    public void userEntersActivationCost() {
        vehicleContractPage.amountInput.sendKeys(Keys.BACK_SPACE);
        vehicleContractPage.amountInput.sendKeys("250");
    }

    @And("user clicks Recurring Cost Amount input column")
    public void userClicksRecurringCostAmountInputColumn() {
        vehicleContractPage.select.click();

    }

    @And("user clicks on the first Recurring Cost Amount from dropdown menu")
    public void userClicksOnTheFirstRecurringCostAmountFromDropdownMenu() {
        vehicleContractPage.FirstRecurringCost.click();
    }

    @And("user enters Recurring Cost Amount {int}")
    public void userEntersRecurringCostAmount() {
        vehicleContractPage.costGeneratedInput.sendKeys(Keys.BACK_SPACE);
        vehicleContractPage.costGeneratedInput.sendKeys("500");
    }

}