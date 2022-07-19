package com.fidexio.step_definitions;

import com.fidexio.pages.VehicleContractPage;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class VehicleContractStepDefinition {


    VehicleContractPage vehicleContractPage = new VehicleContractPage();

    @And("user clicks on Vehicles Contracts button")
    public void userClicksOnVehiclesContractsButton() {
        vehicleContractPage.VehiclesContracts.click();
    }

    @And("user clicks on Vehicles type input column")
    public void userClicksOnVehiclesTypeInputColumn() {
        vehicleContractPage.Vehicle.click();
    }

    @And("user clicks on {string} from menu")
    public void userClicksOnFromMenu(String arg0) {
        vehicleContractPage.Bmw.click();
    }

    @And("user enters Activation Cost {int}")
    public void userEntersActivationCost(int ActCost) {
        vehicleContractPage.ActivationCost.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        vehicleContractPage.ActivationCost.sendKeys(ActCost+"");
    }

    @And("user clicks Recurring Cost Amount input column")
    public void userClicksRecurringCostAmountInputColumn() {
        vehicleContractPage.CostPeriod.click();
    }

    @And("user clicks on {string} from select menu")
    public void userClicksOnFromSelectMenu(String string) {
        vehicleContractPage.SelectOption.click();
    }

    @And("user enters Recurring Cost Amount {int}")
    public void userEntersRecurringCostAmount(int RecCost) {
        vehicleContractPage.RecurringCost.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        vehicleContractPage.RecurringCost.sendKeys(RecCost+"");
    }

    @Then("user should see {string} displayed")
    public void userShouldSeeDisplayed(String string) {
        Assert.assertTrue(vehicleContractPage.VehicleContractName.isDisplayed());
        BrowserUtils.sleep(1);
    }

}