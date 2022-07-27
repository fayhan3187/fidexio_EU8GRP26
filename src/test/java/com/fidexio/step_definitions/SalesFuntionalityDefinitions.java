package com.fidexio.step_definitions;

import com.fidexio.pages.SalesFuntionalityPage;
//import com.fidexio.pages.VehicleServiceLogsPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static com.fidexio.utilities.BrowserUtils.*;



public class SalesFuntionalityDefinitions {
    SalesFuntionalityPage salesFuntionalitypage = new SalesFuntionalityPage();

     WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 0);

   //  Random random=new Random();

     String string=new String();

    @When("user click on Sales button")
    public void userClickOnSalesButton() {
        waitFor(5);
        salesFuntionalitypage.salesbutton.click();
        //       salesFuntionalitypage.customersButton.click();
    }

    @And("user clicks on Customers Button on menu")
    public void userClicksOnCustomersButtonOnMenu() {
        waitFor(4);
        // wait.until(ExpectedConditions.elementToBeClickable(salesFuntionalitypage.customersButton));
        salesFuntionalitypage.customersButton.click();
    }

    @And("user clicks on  Create button")
    public void userClicksOnCreateButton() {
        waitFor(5);
        //  wait.until(ExpectedConditions.elementToBeClickable(salesFuntionalitypage.createButton));
        salesFuntionalitypage.createButton.click();
    }

    @And("user fill all inputt")
    public void userFillAllInputt() {
        waitFor(1);
        salesFuntionalitypage.nameInput.sendKeys("Jason");
        salesFuntionalitypage.streetInput1.sendKeys("abc");
        salesFuntionalitypage.cityInput.sendKeys("is");
        // salesFuntionalitypage.countrydInput.sendKeys("TR");
        salesFuntionalitypage.jobposıtıonInput.sendKeys("employee");

    }

    @And("user click on save button")
    public void userClickOnSaveButton() {
        salesFuntionalitypage.saveButton.click();
        //   Thread.sleep(3000);

    }

    @And("user clicks edit button")
    public void userClicksEditButton() {
        waitFor(5);
        salesFuntionalitypage.editButton.click();

        //  wait.until(ExpectedConditions.elementToBeClickable (salesFuntionalitypage.editButton))
    }


    @And("user user change  name field")
    public void userUserChangeNameField() {

        BrowserUtils.waitFor(2);
        salesFuntionalitypage.nameInput.clear();
        salesFuntionalitypage.nameInput.sendKeys("abccc");
        salesFuntionalitypage.streetInput1.click();
        salesFuntionalitypage.streetInput1.clear();
        salesFuntionalitypage.streetInput1.sendKeys("qwer");
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
        waitFor(2);
        salesFuntionalitypage.saveButon.click();
    }


    @And("user clicks on search field")
    public void userClicksOnSearchField() {
        salesFuntionalitypage.customersButton.click();
    }




}






