package com.fidexio.step_definitions;

import com.fidexio.pages.FleetMenuOptionsPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FleetMenuOpt_StepDef {
    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 10);
    FleetMenuOptionsPage fleetMenuOptionsPage= new FleetMenuOptionsPage();
    @And("User see Vehicles option left side under the Fleet Module.")
    public void userSeeVehiclesOptionLeftSideUnderTheFleetModule() {
        fleetMenuOptionsPage.MoreButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(fleetMenuOptionsPage.FleetButton));
        fleetMenuOptionsPage.FleetButton.click();
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//span[normalize-space(text()) = 'Vehicles']")).getText(),"Vehicles");
    }

    @And("User see Vehicles Odometer option left side under the Fleet Module")
    public void userSeeVehiclesOdometerOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//span[normalize-space(text()) = 'Vehicles Odometer']")).getText(),"Vehicles Odometer");
    }

    @And("User see Vehicle Costs option left side under the Fleet Module")
    public void userSeeVehicleCostsOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//span[normalize-space(text()) = 'Vehicle Costs']")).getText(),"Vehicle Costs");
    }

    @And("User see Vehicles Contracts option left side under the Fleet Module")
    public void userSeeVehiclesContractsOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Vehicles Contracts']")).getText(),"Vehicles Contracts");
    }

    @And("User see Vehicles Fuel Logs option left side under the Fleet Module")
    public void userSeeVehiclesFuelLogsOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Vehicles Fuel Logs']")).getText(),"Vehicles Fuel Logs");
    }

    @And("User see Vehicles Services Logs option left side under the Fleet Module")
    public void userSeeVehiclesServicesLogsOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Vehicles Services Logs']")).getText(),"Vehicles Services Logs");
    }

    @And("User see Costs option left side under the Fleet Module")
    public void userSeeCostsOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Costs']")).getText(),"Costs");
    }

    @And("User see Indicative Costs option left side under the Fleet Module")
    public void userSeeIndicativeCostsOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Indicative Costs']")).getText(),"Indicative Costs");
    }

    @And("User see Vehicle Model option left side under the Fleet Module")
    public void userSeeVehicleModelOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Vehicle Model']")).getText(),"Vehicle Model");
    }

    @And("User see Model make of Vehicle option left side under the Fleet Module")
    public void userSeeModelMakeOfVehicleOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Model make of Vehicle']")).getText(),"Model make of Vehicle");
    }

    @And("User see Service Types option left side under the Fleet Module")
    public void userSeeServiceTypesOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Service Types']")).getText(),"Service Types");
    }

    @And("User see Contract Types option left side under the Fleet Module")
    public void userSeeContractTypesOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Contract Types']")).getText(),"Contract Types");
    }

    @And("User see Vehicle status option left side under the Fleet Module")
    public void userSeeVehicleStatusOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Vehicle Status']")).getText(),"Vehicle Status");
    }

    @Then("User see Vehicle Tags option left side under the Fleet Module")
    public void userSeeVehicleTagsOptionLeftSideUnderTheFleetModule() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[normalize-space(text()) = 'Vehicle Tags']")).getText(),"Vehicle Tags");
    }
}
