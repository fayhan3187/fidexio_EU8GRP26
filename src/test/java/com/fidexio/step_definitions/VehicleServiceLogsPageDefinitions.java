package com.fidexio.step_definitions;

import com.fidexio.pages.VehicleServiceLogsPage;
import io.cucumber.java.en.And;

public class VehicleServiceLogsPageDefinitions {
    VehicleServiceLogsPage VehiclePage = new VehicleServiceLogsPage();
    @And("user clicks on Fleet button")
    public void userClicksOnFleetButton() {
        VehiclePage.FleetButton.click();
    }

    @And("user clicks ServiceLogs Button")
    public void userClicksServiceLogsButton() {
        VehiclePage.ServiceLogsButton.click();
    }

    @And("user clicks to Create button")
    public void userClicksToCreateButton() {
        VehiclePage.CreateButton.click();
    }
}
