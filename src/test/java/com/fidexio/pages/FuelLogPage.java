package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FuelLogPage {
    public FuelLogPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[contains(text(),\"More\")]")
    public WebElement MoreButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Fleet']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Vehicles Fuel Logs']")
    public WebElement vehiclesFuelLogsButton;

    @FindBy(xpath = "//div[@class='fa fa-sm fa-remove o_facet_remove']")
    public WebElement xForVehiclesList;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//div[@name='vehicle_id']//input")
    public WebElement vehicleIdDropDown;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[1]")
    public WebElement firstCarSelection;

    @FindBy(name = "odometer") ////input[@name='odometer']
    public WebElement odometerValueInput;

    @FindBy(name="liter") // //input[@name="liter"]
    public WebElement literInputField;

    @FindBy(name = "price_per_liter")
    public WebElement priceperliterInput;

    @FindBy(name = "amount")
    public WebElement amountInput;

    @FindBy(name = "date")
    public WebElement dateInput;

    @FindBy(id = "o_field_input_13")
    public WebElement purchaserInput;

    @FindBy(name = "inv_ref")
    public WebElement invoiceRefInput;

    @FindBy(id = "o_field_input_15")
    public WebElement vendorInputField;

    @FindBy(xpath = "//div[contains(text(),\"Shell, Shell\")]")
    public WebElement chooseShell;

    @FindBy(name = "notes")
    public WebElement notesTextarea;

    @FindBy(css = ".o_form_button_save")
    public WebElement saveButton;

    @FindBy(css = ".o_form_button_cancel")
    public WebElement discardButton;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

}
