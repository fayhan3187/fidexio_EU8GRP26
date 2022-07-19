package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleContractPage {

    public VehicleContractPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[contains(text(),\"More\")]")
    public WebElement moreButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Fleet']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Vehicles Contracts']")
    public WebElement oeMenuTextSpan;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement btnButton;

    @FindBy(xpath ="//input[@id='o_field_input_124']")
    public WebElement dropdownButton;

    @FindBy(xpath ="//input[@id='o_field_input_382']")
    public WebElement firstCarType;
    
    @FindBy(xpath ="//input[@id='o_field_input_126']")
    public WebElement amountInput;

    @FindBy(xpath ="//select[@id='o_field_input_127']")
    public WebElement select;

    @FindBy(xpath ="//select[@id='o_field_input_386']")
    public WebElement FirstRecurringCost;

    @FindBy(xpath ="//input[@id='o_field_input_128']")
    public WebElement costGeneratedInput;


}
