package com.fidexio.step_definitions;

import com.fidexio.pages.NewVehiclePage;
import com.fidexio.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class NewVehicleStepDef {
    NewVehiclePage newVehicle = new NewVehiclePage();
    Random random = new Random();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Faker faker = new Faker();
    //Select select = new Select();

    //wait.until(ExpectedConditions.elementToBeClickable(NewVehiclePage.CreateButton));

    @When("user clicks on More button")
    public void userClicksOnMoreButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newVehicle.MoreButton));
        newVehicle.MoreButton.click();
    }

    @And("user click on Fleet button")
    public void userClickOnFleetButton() {

        wait.until(ExpectedConditions.elementToBeClickable(newVehicle.FleetButton));
        newVehicle.FleetButton.click();
    }

    @And("user clicks on Create button")
    public void userClicksOnCreateButton() {
        wait.until(ExpectedConditions.elementToBeClickable(NewVehiclePage.CreateButton));
        newVehicle.CreateButton.click();

    }

    @And("user enters Model")
    public void userEntersModel() {
        newVehicle.VehicleModel.click();
        newVehicle.SelectAudi.click();

    }


    @And("user enters License Plate")
    public void userEntersLicensePlate() {
        newVehicle.VehiclePlate.clear();
        newVehicle.VehiclePlate.sendKeys("01adana01");
    }

    @And("user select from the tag from Dropdown Menu")
    public void userSelectFromTheTagFromDropdownMenu() {

        newVehicle.TagsButton.click();
        newVehicle.SelectEmployeeCarTag.click();

    }

    @And("user select from the Driver from Dropdown Menu")
    public void userSelectFromTheDriverFromDropdownMenu() {
        //wait.until(ExpectedConditions.elementToBeClickable(newVehicle.DriverButton));
        //newVehicle.DriverButton.click();
        //wait.until(ExpectedConditions.elementToBeClickable(newVehicle.SelectDriver));
        //newVehicle.SelectDriver.click();
    }

    @And("user enters Location")
    public void userEntersLocation() {
        newVehicle.LocationEntry.sendKeys("ADANA");
    }

    @And("user enters Chasis Number")
    public void userEntersChasisNumber() {
        newVehicle.ChassisNumberEntry.sendKeys("2");
    }

    @And("user enters Model Year")
    public void userEntersModelYear() {newVehicle.ModelYearEntry.sendKeys("2020");
    }

    @And("user enters Seats Number")
    public void userEntersSeatsNumber() {newVehicle.SeatsNumberEntry.sendKeys("5");
    }

    @And("user enters Doors Number")
    public void userEntersDoorsNumber() {newVehicle.DoorsNumberEntry.sendKeys("5");
    }

    @And("user enters Color")
    public void userEntersColor() {newVehicle.ColorEntry.sendKeys("Caramel");
    }

    @And("user enters Last Odometer")
    public void userEntersLastOdometer() {
        newVehicle.LastOdometerEntry.clear();
        newVehicle.LastOdometerEntry.sendKeys("25000");

    }

    @And("user enters Immatriculation Date")
    public void userEntersImmatriculationDate() {
        //newVehicle.ImmatriculationDateButton.click();
        //newVehicle.SelectImmatriculationDateButton.click();
    }

    @And("user enters Catalog Value")
    public void userEntersCatalogValue() {
        newVehicle.CatalogValueEntry.clear();
        newVehicle.CatalogValueEntry.sendKeys("27000");
    }

    @And("user enters Residual Value")
    public void userEntersResidualValue() {
        newVehicle.ResidualValue.clear();
        newVehicle.ResidualValue.sendKeys("30000");
    }

    @And("user select from the Transmission from Dropdown Menu")
    public void userSelectFromTheTransmissionFromDropdownMenu() {

    }

    @And("user select from the Fuel Type from Dropdown Menu")
    public void userSelectFromTheFuelTypeFromDropdownMenu() {;

    }

    @And("user enters CO Emissions")
    public void userEntersCOEmissions() {
        newVehicle.CO2EmissionsEntry.clear();
        newVehicle.CO2EmissionsEntry.sendKeys("20");
    }

    @And("user enters Horsepower")
    public void userEntersHorsepower() {
        newVehicle.HorsePowerEntry.clear();
        newVehicle.HorsePowerEntry.sendKeys("170");
    }

    @And("user enters Horsepower Taxation")
    public void userEntersHorsepowerTaxation() {
        newVehicle.HorsePowerTaxationEntry.clear();
        newVehicle.HorsePowerTaxationEntry.sendKeys("175");
    }

    @And("user enters Power")
    public void userEntersPower() {
        newVehicle.PowerEntry.clear();
        newVehicle.PowerEntry.sendKeys("70");
    }

    @And("user click save button")
    public void userClickSaveButton() {newVehicle.SaveButton.click();
    }

    @Then("User Checks the Vehicle Data saved")
    public void userChecksTheVehicleDataSaved() {
        //WebElement createdVehicle = Driver.getDriver().findElement(By.xpath("//li[normalize-space()='Bmw/520ES/01adana01']"));
       // WebElement createdVehicle;
        //Assert.assertTrue(createdVehicle.isDisplayed());
    }

}