package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleServiceLogsPage {
    public VehicleServiceLogsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
         }
    @FindBy (xpath = "//span[contains(text(),'Fleet')]")
    public WebElement FleetButton;

    @FindBy (xpath = "//span[contains(text(),'Vehicles Services Logs')]")
    public WebElement ServiceLogsButton;

    @FindBy (xpath = "//button[contains(text(),'Create')]")
    public WebElement CreateButton;
}
