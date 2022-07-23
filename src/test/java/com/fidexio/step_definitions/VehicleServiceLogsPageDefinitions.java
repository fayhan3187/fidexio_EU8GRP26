package com.fidexio.step_definitions;

import com.fidexio.pages.VehicleServiceLogsPage;
import com.fidexio.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class VehicleServiceLogsPageDefinitions {
    VehicleServiceLogsPage VehiclePage = new VehicleServiceLogsPage();

    Random random = new Random();

    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 10);

    Faker faker = new Faker();
    @And("user clicks on Fleet button")
    public void userClicksOnFleetButton() {
        VehiclePage.FleetButton.click();
    }

    @And("user clicks ServiceLogs Button")
    public void userClicksServiceLogsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(VehiclePage.ServiceLogsButton));
        VehiclePage.ServiceLogsButton.click();
    }

    @And("user clicks to Create button")
    public void userClicksToCreateButton() {
        VehiclePage.CreateButton.click();
    }

    @And("user fill all inputs")
    public void userFillAllInputs() {

        VehiclePage.VehicleInput1.click();
      //  BrowserUtils.sleep(3);
       // wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(By.xpath("//ul[@id=\"ui-id-3\"]//li[2]"))));
        Driver.getDriver().findElement(By.xpath("//ul[@id=\"ui-id-3\"]//li[2]")).click();
        VehiclePage.OdometerInput.clear();
        VehiclePage.OdometerInput.sendKeys("222");
        VehiclePage.TotalPriceInput.clear();
        VehiclePage.TotalPriceInput.sendKeys("333");
        VehiclePage.DateInput.clear();
        VehiclePage.DateInput.sendKeys("10/08/2021");
        VehiclePage.PurchaserInput1.click();
        VehiclePage.PurchaserInput2.click();
        VehiclePage.VendorInput1.click();
        VehiclePage.VendorInput2.click();
        VehiclePage.ServiceInput1.clear();
        VehiclePage.ServiceInput1.sendKeys("555");
        VehiclePage.textAreaInput.clear();
        VehiclePage.textAreaInput.sendKeys("336");




    }

    @And("user clicks Save Button")
    public void userClicksSaveButton() {
        VehiclePage.SaveButton.click();
    }

    @Then("user sees the ServiceLogs Panel")
    public void userSeesTheServiceLogsPanel() {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Audi/A1/1-AUD-001')]")).getText(),"Audi/A1/1-AUD-001");
    }
}
