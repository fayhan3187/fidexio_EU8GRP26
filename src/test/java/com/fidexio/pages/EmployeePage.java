package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[16]/a")
    public WebElement employees;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]")
    public WebElement kanban;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(id = "o_employee_container")
    public WebElement employeeContainer;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[2]")
    public WebElement importButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/form/div[1]/div[2]/div/span[1]/label")
    public WebElement importSection;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span")
    public WebElement advancedSearch;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]")
    public WebElement advancedSearchSection;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]")
    public WebElement filtersButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul")
    public WebElement filtersDropDown;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]")
    public WebElement groupButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/ul")
    public WebElement groupDropDown;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]")
    public WebElement favoritesButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul")
    public WebElement favoritesDropdown;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    public WebElement searchBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[2]")
    public WebElement listButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[1]")
    public WebElement kanbanButton;

    @FindBy(xpath = "//*[@id=\"oe_hr_attendance_status\"]")
    public WebElement employee;

    @FindBy(xpath = "//*[@id=\"o_field_input_709\"]")
    public WebElement nameBar;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;


}
