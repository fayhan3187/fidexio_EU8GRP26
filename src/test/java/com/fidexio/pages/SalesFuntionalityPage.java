package com.fidexio.pages;

import com.fidexio.step_definitions.SalesFuntionalityDefinitions;
import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesFuntionalityPage {
    public SalesFuntionalityPage(){
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//a[@href='/web#menu_id=445&action=']/span") ////a[@href='/web#menu_id=445&action=']/span
    public WebElement salesbutton;

//
  //  @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[6]/a")
 //   public WebElement salesbutton;

    @FindBy(xpath = "//a[@href='/web#menu_id=447&action=48']/span")
    public WebElement customersButton;

   // @FindBy(xpath = "//button[@accesskey='c']")

    @FindBy (xpath = "//button[normalize-space()='Create']")
    public WebElement createButton;

  //  @FindBy(xpath = "//button[@class="btn btn-primary btn-sm o_list_button_add")
  //  public WebElement createButton;


    @FindBy(xpath = "//input[@name='name']")
  //  @FindBy (css =" #o_field_input_2351")
    public WebElement nameInput;

   // @FindBy(xpath = "//*[@id='o_field_input_606']")
    //public WebElement nameInput;

  //  @FindBy(xpath = "//*[@id='o_field_input_520']")
  //  public WebElement nameInput;

   // @FindBy(id = "o_field_input_37")
   // public WebElement streetInput;

    @FindBy(xpath = "//input[@name='street']")
   public WebElement streetInput1;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInput;


 //   @FindBy(xpath = "//*[@id='o_field_input_42']")
 //  public WebElement countrydInput;

    @FindBy(xpath = "//input[@id='o_field_input_532']")
    public WebElement jobposıtıonInput;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath ="//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(xpath ="//button[@accesskey='s']")
    public WebElement saveButon;

 //   @FindBy(xpath ="//input[@id=o_field_input_524]")
 //   public WebElement streetInput;
















  






}
