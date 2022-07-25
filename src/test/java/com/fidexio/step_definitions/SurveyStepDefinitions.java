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

    @Given("user is on the survey page of fidexio page")
    public void user_is_on_the_survey_page_of_fidexio_page() {

        surveyPage.surveysButton.click();
    }

    @When("user clicks on create button")
    public void userClicksOnCreateButton() {

        surveyPage.surveyCreateButton.click();
    }
    @Then("user sees {string} under Title header")
    public void user_sees_under_header(String string, String string2) {

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
    @Then("user sees {string} message on the right")
    public void user_sees_message_on_the_right(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
