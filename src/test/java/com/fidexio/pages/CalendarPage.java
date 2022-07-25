package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[contains(text(),'Calendar')])[1]")
    public WebElement CalendarButton;


    @FindBy(xpath = "//button[contains(text(),'Day')]")
    public WebElement CalendarButtonDay;

    @FindBy(xpath = "//button[contains(text(),'Week')]")
    public WebElement CalendarButtonWeek;

    @FindBy(xpath = "//button[contains(text(),'Month')]")
    public WebElement CalendarButtonMonth;

    @FindBy(xpath = "(//td[@class='fc-day fc-widget-content fc-sun fc-past'])[1]")
    public  WebElement EmptyBody;

    @FindBy(xpath = "//body/div[@id='modal_6']/div[1]/div[1]/div[3]/button[1]")
    public WebElement CreateButton;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement SummaryInput;

    @FindBy(xpath = "//a[contains(text(),' enable desktop notifications')]")
    public WebElement EnableDesktopNotifications;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    public WebElement DeleteButton;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]/span")
    public WebElement EditButton;

    @FindBy(xpath = "//h4[contains(text(),'zafer')]")
    public  WebElement verifyWord;

    @FindBy(xpath = "//a[contains(@class,'fc-day-grid-event')]")
    public  WebElement AfterAddedButton;

    @FindBy(xpath = "//span[.='Discard']")
    public WebElement DiscardButton;
    @FindBy(xpath = "//span[.='Ok']")
    public WebElement OkButton;







}
