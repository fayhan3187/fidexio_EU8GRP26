package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewVehiclePage {
    public NewVehiclePage() {PageFactory.initElements(Driver.getDriver(), this);}



    @FindBy(xpath = "//*[@id=\"menu_more_container\"]/a")
    public static WebElement MoreButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Fleet']")
    public static WebElement FleetButton;

    @FindBy (xpath = "//span[normalize-space()='Vehicles']")
    public static WebElement VehicleButton;

    @FindBy (xpath = "//button[normalize-space()='Create']")
    public static WebElement CreateButton;

    @FindBy(xpath="//div[@name='model_id']//input[@class='o_input ui-autocomplete-input']")
    public static WebElement VehicleModel;

    @FindBy (xpath = "//li[@id='ui-id-7']//a[contains(text(),'Bmw/520ES')]")
    public static WebElement SelectAudi;

    @FindBy(xpath="//input[@name='license_plate']")
    public WebElement VehiclePlate;

    @FindBy(xpath="//div[@class='o_field_many2manytags o_input o_field_widget']//input[@class='o_input ui-autocomplete-input']")
    public WebElement TagsButton;

    @FindBy (xpath = "//a[normalize-space()='Employee Car']")
    public static WebElement SelectEmployeeCarTag;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/input[1]")
    public WebElement DriverButton;

    @FindBy (xpath = "//A[153]")
    public WebElement SelectDriver;

    @FindBy(xpath="//input[@name='location']")
    public WebElement LocationEntry;

    @FindBy(xpath="//input[@name='vin_sn']")
    public WebElement ChassisNumberEntry;

    @FindBy(xpath="//input[@name='model_year']")
    public WebElement ModelYearEntry;

    @FindBy(xpath="//input[@name='seats']")
    public WebElement SeatsNumberEntry;

    @FindBy(xpath="//input[@name='doors']")
    public WebElement DoorsNumberEntry;

    @FindBy(xpath="//input[@name='color']")
    public WebElement ColorEntry;

    @FindBy(xpath="//input[@name='odometer']")
    public WebElement LastOdometerEntry;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")
    public WebElement ImmatriculationDateButton;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/input[1]")
    public WebElement SelectImmatriculationDateButton;

    @FindBy(xpath="//input[@class='o_datepicker_input o_input']")
    public WebElement SelectImmatriculationDate;

    @FindBy(xpath="//input[@name='car_value']")
    public WebElement CatalogValueEntry;

    @FindBy(xpath="//input[@name='residual_value']")
    public WebElement ResidualValue;

    @FindBy(xpath="//select[@name='transmission']")
    public static WebElement TransmissionButton;

    @FindBy(xpath="//select[@name='fuel_type']")
    public static WebElement FuelTypeButton;

    @FindBy(xpath="//div[@class='o_form_sheet']//tr[4]//div[@class='o_row']/input[@class='o_field_float o_field_number o_field_widget o_input']")
    public WebElement CO2EmissionsEntry;

    @FindBy(xpath="//input[@name='horsepower']")
    public WebElement HorsePowerEntry;

    @FindBy(xpath="//input[@name='horsepower_tax']")
    public WebElement HorsePowerTaxationEntry;

    @FindBy(xpath="//input[@name='power']")
    public WebElement PowerEntry;

    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement SaveButton;
}
