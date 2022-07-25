package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleContractPage extends BasePage{

    @FindBy(xpath = "//span[normalize-space(text()) = 'Vehicles Contracts']")
    public WebElement VehiclesContracts;

    @FindBy(xpath ="(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement Vehicle;

    @FindBy(xpath ="//a[contains(text(),'Bmw/Serie 1/1-BMW-001')]")
    public WebElement Bmw;

    @FindBy(name="amount")
    public WebElement ActivationCost;

    @FindBy(name="cost_frequency")
    public WebElement CostPeriod;

    @FindBy(xpath = "//option[text()='Monthly']")
    public WebElement SelectOption;

    @FindBy(name="cost_generated")
    public WebElement RecurringCost;

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement VehicleContractName;


}
