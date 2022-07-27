package com.fidexio.step_definitions;

import com.fidexio.pages.EmployeePage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeesStepDefinition {


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);


    EmployeePage employeePage = new EmployeePage();

    @When("User click to Employees button")
    public void userClickToEmployeesButton() throws InterruptedException {
        Thread.sleep(3000);
        employeePage.employees.click();


    }

    @Then("user see Employees section")
    public void userSeeEmployeesSection()  {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]")));
       Assert.assertTrue(employeePage.kanban.isDisplayed());

    }

    @And("User click to create button")
    public void userClickToCreateButton()  {
        wait.until(ExpectedConditions.elementToBeClickable(employeePage.createButton));
        employeePage.createButton.click();

    }

    @Then("User see Create employees section")
    public void userSeeCreateEmployeesSection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("o_employee_container")));
        Assert.assertTrue(employeePage.employeeContainer.isDisplayed());

    }

    @And("User click to back button")
    public void userClickToBackButton()  {
        Driver.getDriver().navigate().back();

    }

    @And("User click to Import button")
    public void userClickToImportButton() {
        wait.until(ExpectedConditions.elementToBeClickable(employeePage.importButton));
        employeePage.importButton.click();

    }

    @Then("User see import section")
    public void userSeeImportSection() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/form/div[1]/div[2]/div/span[1]/label")));
        Assert.assertTrue(employeePage.importSection.isDisplayed());

    }


    @And("User click to Advanced Search button")
    public void userClickToAdvancedSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(employeePage.advancedSearch));
        employeePage.advancedSearch.click();

    }

    @Then("User see advanced search")
    public void userSeeAdvancedSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]")));

        Assert.assertTrue(employeePage.advancedSearchSection.isDisplayed());

    }

    @And("User click to Filters button")
    public void userClickToFiltersButton() {
        employeePage.filtersButton.click();
    }

    @Then("user see Filters dropdown")
    public void userSeeFiltersDropdown() {
        Assert.assertTrue(employeePage.filtersDropDown.isDisplayed());
    }

    @And("User click to Group By button")
    public void userClickToGroupByButton() {
        employeePage.groupButton.click();
    }

    @Then("user see Group By dropdown")
    public void userSeeGroupByDropdown() {
        Assert.assertTrue(employeePage.groupDropDown.isDisplayed());

    }

    @And("User click to Favorites button")
    public void userClickToFavoritesButton() {
        employeePage.filtersButton.click();
    }

    @Then("User see Favorites dropdown")
    public void userSeeFavoritesDropdown() {
        Assert.assertTrue(employeePage.filtersDropDown.isDisplayed());
    }

    @And("User click Search bar and write anything")
    public void userClickSearchBarAndWriteAnything() throws InterruptedException {
        employeePage.searchBox.sendKeys("a");
        employeePage.searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("User see search result")
    public void userSeeSearchResult() {
        WebElement searchResult = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/div/div[1]"));
        Assert.assertTrue(searchResult.isDisplayed());

    }

    @And("User click to List button")
    public void userClickToListButton() {
        employeePage.listButton.click();
    }

    @Then("Employees profiles appears as a list")
    public void employeesProfilesAppearsAsAList() {
        WebElement listAppear = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr"));
        Assert.assertTrue(listAppear.isDisplayed());

    }

    @And("User click to Kanban button")
    public void userClickToKanbanButton() {
        employeePage.kanbanButton.click();
    }

    @Then("Employees profiles appears as a Kanban")
    public void employeesProfilesAppearsAsAKanban() {
        Assert.assertTrue(employeePage.kanban.isDisplayed());
    }

    @And("User click to any employees")
    public void userClickToAnyEmployees() {
        wait.until(ExpectedConditions.elementToBeClickable(employeePage.employee));
        employeePage.employee.click();
    }

    @Then("User see Employee created message appears under full profile.")
    public void userSeeEmployeeCreatedMessageAppearsUnderFullProfile() {
        WebElement createMessage = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/p"));
        Assert.assertTrue(createMessage.isDisplayed());
    }

    @Then("User type name on the Name bar")
    public void userTypeNameOnTheNameBar() {
        employeePage.nameBar.sendKeys("employee_name");
    }

    @And("User click to Save button")
    public void userClickToSaveButton() {

        employeePage.saveButton.click();

    }

    @Then("User see created employee is listed")
    public void userSeeCreatedEmployeeIsListed() {

        WebElement createdVehicle = Driver.getDriver().findElement(By.xpath("//li[normalize-space()='Bmw/520ES/01adana01']"));
        Assert.assertTrue(createdVehicle.isDisplayed());

    }
}
