package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class FleetMenuOptionsPage {

    public FleetMenuOptionsPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//a[contains(text(),\"More\")]")
    public WebElement MoreButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Fleet']")
    public WebElement FleetButton;

    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public WebElement vehiclesButton;

    @FindBy(xpath = "//span[contains(text(), 'Vehicles Odometer']")
    public WebElement vehiclesOdometerButton;

    @FindBy(xpath = "//span[contains(text(), 'Vehicle Costs']")
    public WebElement vehicleCostsButton;

    @FindBy(xpath = "//span[contains(text(), 'Vehicles Contracts']")
    public WebElement vehiclesContractsButton;

    @FindBy(xpath = "//span[contains(text(), 'Vehicles Fuel Logs']")
    public WebElement vehiclesFuelLogsButton;

    @FindBy(xpath = "//span[contains(text(), 'Vehicles Services Logs']")
    public WebElement vehiclesServicesLogsButton;

    @FindBy(xpath = "//span[contains(text(), 'Costs']")
    public WebElement CostsButton;

    @FindBy(xpath = "//span[contains(text(), 'Indicative Costs']")
    public WebElement IndicativeCostsButton;

    @FindBy(xpath = "//span[contains(text(), 'Vehicle Model']")
    public WebElement vehicleModelButton;

    @FindBy(xpath = "//span[contains(text(), 'Model make of Vehicle']")
    public WebElement ModelmakeofVehicleButton;

    @FindBy(xpath = "//span[contains(text(), 'Service Types']")
    public WebElement ServiceTypesButton;

    @FindBy(xpath = "//span[contains(text(), 'Contract Types']")
    public WebElement ContractTypesButton;

    @FindBy(xpath = "//span[contains(text(), 'Vehicle Status']")
    public WebElement vehicleStatusButton;

    @FindBy(xpath = "//span[contains(text(), 'Vehicle Tags']")
    public WebElement vehicleTagsButton;















}
