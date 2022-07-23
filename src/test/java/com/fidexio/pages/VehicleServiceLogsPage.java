package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleServiceLogsPage {
    public VehicleServiceLogsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
         }
    @FindBy (xpath = "//span[contains(text(),'Fleet')]")
    public WebElement FleetButton;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement ServiceLogsButton;

    @FindBy (xpath = "//button[@class=\"btn btn-primary btn-sm o_list_button_add\"]")
    public WebElement CreateButton;

    @FindBy(xpath="//input[@class='o_input ui-autocomplete-input']")
    public WebElement VehicleInput1;
    @FindBy(xpath="//input[@name='odometer']")
    public WebElement OdometerInput;

    @FindBy(xpath="//input[@id=\"o_field_input_476\"]")
    public WebElement ServiceInput1;

    @FindBy (xpath = "//ul[@id=\"ui-id-4\"]//li")
    public List<WebElement> ServiceTypeDropdown;

    @FindBy(xpath="//input[@name='amount']")
    public WebElement TotalPriceInput;

    @FindBy(xpath="//input[@name='date']")
    public WebElement DateInput;

    @FindBy(xpath="(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement PurchaserInput1;

    @FindBy(xpath="//a[contains(text(),'&*&*)_( (copy), jhgfdghjkhgg')]")
    public WebElement PurchaserInput2;

    @FindBy(xpath="(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement VendorInput1;

    @FindBy(xpath="//a[contains(text(),'&*&*)_(, 7854422')]")
    public WebElement VendorInput2;

    @FindBy(xpath="//input[@name='inv_ref']")
    public WebElement InvoiceInput;

    @FindBy(xpath="//textarea[@name='notes']")
    public WebElement textAreaInput;

    @FindBy(xpath="//button[@accesskey='s']")
    public WebElement SaveButton;



}
