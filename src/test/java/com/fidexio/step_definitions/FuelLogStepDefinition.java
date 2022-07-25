package com.fidexio.step_definitions;

import com.fidexio.pages.FuelLogPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static com.fidexio.utilities.BrowserUtils.*;

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

    @And("user clicks on the first car from dropdown menu")
    public void userClicksOnTheFirstCarFromDropdownMenu() {
        waitFor(2);
        fuelLogPage.firstCarSelection.click();
    }


    @And("user enters {double} as odometer values into related field")
    public void userEntersAsOdometerValuesIntoRelatedField(double value) {
        fuelLogPage.odometerValueInput.clear();
        fuelLogPage.odometerValueInput.sendKeys(""+value);

    }

    @And("user enters {double} as loaded fuel amount")
    public void userEntersAsLoadedFuelAmount(double fuelLiter) {
        fuelLogPage.literInputField.clear();
        fuelLogPage.literInputField.sendKeys(""+fuelLiter);
    }

    @And("user enters {double} as fuel cost per liter")
    public void userEntersAsFuelCostPerLiter(double fuelLiterCost) {
        fuelLogPage.priceperliterInput.clear();
        fuelLogPage.priceperliterInput.sendKeys(""+fuelLiterCost, Keys.ENTER);
//        BrowserUtils.sleep(3000);,
        fuelLogPage.literInputField.sendKeys(Keys.ENTER);



    }

    @Then("user should see total price should as {string}")
    public void userShouldSeeTotalPriceShouldAs(String totalPrice) {
        waitFor(2);
        fuelLogPage.amountInput.click();
        String ExpectedPrice= totalPrice;
        String ActualPrice= fuelLogPage.amountInput.getAttribute("value");
        System.out.println("ActualPrice = " + ActualPrice);
        Assert.assertEquals(ExpectedPrice,ActualPrice);
    }

//    @And("user enters {string} as date")
//    public void userEntersAsDate(String arg0) {
//
////        fuelLogPage.dateInput.click();
////        fuelLogPage.dateInput.click();
//        fuelLogPage.dateInput.sendKeys(Keys.BACK_SPACE);
////        fuelLogPage.dateInput.clear();
//        fuelLogPage.dateInput.sendKeys(arg0);
//    }

    @And("user enter {string} as invocie reference")
    public void userEnterAsInvocieReference(String arg0) {
        fuelLogPage.invoiceRefInput.sendKeys(arg0);
    }

//    @And("user clicks on vendor field")
//    public void userClicksOnVendorField() {
//        fuelLogPage.vendorInputField.sendKeys("Shell");
//    }
//
//    @And("user choose Shell as a vendor")
//    public void userChooseShellAsAVendor() {
//        fuelLogPage.chooseShell.click();
//    }

    @And("user writes {string} test in information field")
    public void userWritesTestInInformationField(String arg0) {
//        fuelLogPage.notesTextarea.click();
        fuelLogPage.notesTextarea.sendKeys(arg0);
    }

    @Then("user clicks on save button")
    public void userClicksOnSaveButton() {
        fuelLogPage.saveButton.click();
    }

    @Then("user should see the edit button")
    public void userShouldSeeTheEditButton() {
        boolean displayed = fuelLogPage.editButton.isEnabled();
        System.out.println("displayed = " + displayed);
        Assert.assertTrue(displayed);

            }
}
