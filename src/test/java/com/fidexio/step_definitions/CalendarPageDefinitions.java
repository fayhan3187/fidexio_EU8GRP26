package com.fidexio.step_definitions;

import com.fidexio.pages.CalendarPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class CalendarPageDefinitions {
    CalendarPage calendar= new CalendarPage();
    Faker faker= new Faker();
    Random random= new Random();
    WebDriverWait wait= new WebDriverWait(Driver.getDriver(),20);
    @Given("User first lands on weekly display")
    public void userFirstLandsOnWeeklyDisplay() {
        calendar.EnableDesktopNotifications.click();
        calendar.CalendarButton.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//li[contains(text(),'Week')]")).getText().contains("Week"));
    }

    @When("User can change display between Day-Week-Month")
    public void userCanChangeDisplayBetweenDayWeekMonth() {
        wait.until(ExpectedConditions.elementToBeClickable(calendar.CalendarButtonDay));
        calendar.CalendarButtonDay.click();
        calendar.CalendarButtonWeek.click();
        calendar.CalendarButtonMonth.click();
        Assert.assertTrue(calendar.CalendarButton.isEnabled());
    }

    @And("User can create event by clicking on time box")
    public void userCanCreateEventByClickingOnTimeBox() {
        calendar.CalendarButtonWeek.click();
        calendar.EmptyBody.click();
        calendar.SummaryInput.sendKeys("zafer");
        calendar.CreateButton.click();


    }

    @Then("User can edit a created event")
    public void userCanEditACreatedEvent() {
       Driver.getDriver().findElement(By.xpath("//div[contains(text(),'zafer')]")).click();
        calendar.EditButton.click();
        Assert.assertTrue(calendar.verifyWord.getText().contains("zafer"));
        calendar.DiscardButton.click();

    }



    @Then("User delete data which we added")
    public void userDeleteDataWhichWeAdded() {

            calendar.AfterAddedButton.click();
            wait.until(ExpectedConditions.visibilityOf(calendar.DeleteButton));
            calendar.DeleteButton.click();
            calendar.OkButton.click();

    }
}
