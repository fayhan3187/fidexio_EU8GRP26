package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveyPage {

    public SurveyPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath ="//a[@data-menu='475']//span")
    public WebElement surveysButton;

    @FindBy (xpath = "//input[@placeholder='Survey Title']")
    public WebElement surveyTitle;

    @FindBy(xpath = "//a[text()='Options']")
    public WebElement optionsButton;

    @FindBy(xpath = "//label[text()='Login required']")
    public WebElement loginRequired;

    @FindBy (xpath = "//button[.='Design Survey']")
    public WebElement designSurvey;

    @FindBy (xpath = "//p[.='Survey created']")
    public WebElement surveyCreatedMessage;

    @FindBy (xpath = "//span[.='Crow']")
    public WebElement newSurvey;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveSurvey;

    @FindBy(xpath = "//button[normalize-space(text()) = 'Create']")
    public WebElement surveyCreateButton;










    
    
    
    

    




}
