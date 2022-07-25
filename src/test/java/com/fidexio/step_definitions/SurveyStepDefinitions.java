package com.fidexio.step_definitions;

import com.fidexio.pages.SurveyPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SurveyStepDefinitions {

    SurveyPage surveyPage = new SurveyPage();

    @When("user is on the survey page of fidexio page")
    public void user_is_on_the_survey_page_of_fidexio_page() {

        surveyPage.surveysButton.click();
        BrowserUtils.sleep(3);
    }
    @Then("user sees {string} under Title header")
    public void user_sees_under_title_header(String string) {

        Assert.assertTrue(surveyPage.surveyTitle.isDisplayed());
    }
    @Then("user clicks on Options button")
    public void user_clicks_on_options_button() {
        surveyPage.optionsButton.click();
    }
    @Then("user sees {string} choice at survey creation section")
    public void user_sees_choice_at_survey_creation_section(String string) {

        Assert.assertTrue(surveyPage.loginRequired.isDisplayed());
    }
    @Then("user clicks on Design Survey button")
    public void user_clicks_on_design_survey_button() {

        surveyPage.designSurvey.click();
    }
    @When("user enters title name at the Survey Title field")
    public void user_enters_title_name_at_the_survey_title_field() {

        surveyPage.surveyTitle.sendKeys("Crow");
    }
    @Then("user sees {string} message under Today line")
    public void user_sees_message_under_today_line(String string) {

        Assert.assertTrue(surveyPage.surveyCreatedMessage.isDisplayed());
    }
    @Then("user sees the new created survey on the Surveys page")
    public void user_sees_the_new_created_survey_on_the_surveys_page() {

        BrowserUtils.sleep(2);
        Assert.assertTrue(surveyPage.newSurvey.isDisplayed());

    }

    @And("user clicks on survey create button")
    public void userClicksOnSurveyCreateButton() {

        BrowserUtils.sleep(4);
        surveyPage.surveyCreateButton.click();
    }
}
