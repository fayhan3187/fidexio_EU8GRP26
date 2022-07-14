package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page of fidexio page")
    public void user_is_on_the_login_page_of_fidexio_page() {

        String url = ConfigurationReader.getProperty("fidexioUrl");
        Driver.getDriver().get(url);

    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {

        loginPage.userNameInput.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {

        loginPage.passwordInput.sendKeys(string);

    }
    @When("user clicks to login button")
    public void user_clicks_on_the_login_button() {

        loginPage.loginButton.click();

    }
    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String string) {

        String expectedResult= string;
        String actualResult= LoginPage.title.getText();
        System.out.println("actualResult = " + actualResult);
        Assert.assertTrue(actualResult.equalsIgnoreCase(expectedResult));
        // Assert.assertTrue(FidexioErpPage.title.contains(string));

    }


}
