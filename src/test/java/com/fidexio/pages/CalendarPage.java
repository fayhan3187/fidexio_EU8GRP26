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

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]")
    public  WebElement EmptyBody;

    @FindBy(xpath = "//body/div[@id='modal_6']/div[1]/div[1]/div[3]/button[1]")
    public WebElement CreateButton;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement SummaryInput;

    @FindBy(xpath = "//a[contains(text(),' enable desktop notifications')]")
    public WebElement EnableDesktopNotifications;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    public WebElement DeleteButton;

    @FindBy(xpath = "(//span[contains(text(),'Edit')])[2]")
    public WebElement EditButton;




}
