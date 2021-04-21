package com.orangehrmlive.demo.testing.steps;

import com.orangehrmlive.demo.testing.pageobjects.AddEmployeePageObject;
import com.orangehrmlive.demo.testing.utils.ReadData;
import cucumber.api.PendingException;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class AddEmployeeSteps {


    private AddEmployeePageObject addEmployeePageObject = new AddEmployeePageObject();
    private ReadData read = new ReadData();


    @Step
    public void openBrowser() {
        addEmployeePageObject.getDriver().get("https://orangehrm-demo-6x.orangehrmlive.com/");
        addEmployeePageObject.getDriver().manage().window().maximize();
    }

    @Step
    public void goToLogin() {
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getBtnLogin()).click();
    }

    @Step
    public void validateLogin() {
        if (!addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLblDashboard()).isDisplayed()) {
            throw new PendingException("We are not in the page");
        }
    }

    @Step
    public void goToAddEmployee() {
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstPIM()).click();
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstAddEmployee()).click();
        WebDriverWait result = new WebDriverWait(addEmployeePageObject.getDriver(), 15);
        result.until(ExpectedConditions.visibilityOfElementLocated(addEmployeePageObject.getTxtFirstName()));
    }

    @Step
    public void inputFirstName() throws IOException {
        String firstName = read.ReadData("Hoja1", "Data.xlsx", 0, 1);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtFirstName()).sendKeys(firstName);
    }

    @Step
    public void inputMiddleName() throws IOException {
        String middleName = read.ReadData("Hoja1", "Data.xlsx", 1, 1);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtMiddleName()).sendKeys(middleName);
    }

    @Step
    public void inputLastName() throws IOException {
        String lastName = read.ReadData("Hoja1", "Data.xlsx", 2, 1);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtLastName()).sendKeys(lastName);
    }

    @Step
    public void selectLocation() {
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstLocation()).click();
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getItmCanadianRegional()).click();
    }

    @Step
    public void selectLoginDetails() {
        Actions action = new Actions(addEmployeePageObject.getDriver());
        action.moveToElement(addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getBtnLoginDetails())).click().perform();
    }

    @Step
    public void inputUserName() throws IOException {
        String userName = read.ReadData("Hoja1", "Data.xlsx", 3, 1);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtUserName()).sendKeys(userName);
    }

    @Step
    public void inputPassword() throws IOException {
        String password = read.ReadData("Hoja1", "Data.xlsx", 4, 1);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtPassword()).sendKeys(password);
    }

    @Step
    public void inputConfirmPassword() throws IOException {
        String confirmPassword = read.ReadData("Hoja1", "Data.xlsx", 4, 1);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtConfirmPassword()).sendKeys(confirmPassword);
    }

    @Step
    public void selectAdminRole() {
        Select select = new Select(addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstAdminRole()));
        select.selectByVisibleText("Global Admin");
    }

    @Step
    public void goToNext() throws InterruptedException {
        Thread.sleep(3000);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getBtnNext()).click();
        WebDriverWait result = new WebDriverWait(addEmployeePageObject.getDriver(), 20);
        result.until(ExpectedConditions.visibilityOfElementLocated(addEmployeePageObject.getTxtFirstNameVal()));
    }

    @Step
    public void validateFirstName() {
        if (!addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtFirstNameVal()).isDisplayed()) {
            throw new PendingException("We are not in the page");
        }
    }

    @Step
    public void selectDOB() throws IOException {
        String dateOfBirth = read.ReadData("Hoja1", "Data.xlsx", 5, 1);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtDOB()).sendKeys(dateOfBirth);
    }

    @Step
    public void inputHobbies() throws IOException{
        String hobbies = read.ReadData("Hoja1", "Data.xlsx", 6, 1);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtHobbies()).sendKeys(hobbies);
    }

    @Step
    public void goToNext1()throws InterruptedException{
        Thread.sleep(3000);
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getBtnNext1()).sendKeys(Keys.ENTER);
        WebDriverWait result = new WebDriverWait(addEmployeePageObject.getDriver(), 20);
        result.until(ExpectedConditions.visibilityOfElementLocated(addEmployeePageObject.getTxtJoinDate()));
    }

    @Step
    public void validateJoinDate(){
        if (!addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getTxtJoinDate()).isDisplayed()) {
            throw new PendingException("We are not in the page");
        }
    }

    @Step
    public void selectRegion(){
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstRegion()).click();
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstRegionOption()).click();
    }

    @Step
    public void selectFTE(){
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstFTE()).click();
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstFTEOption()).click();
    }

    @Step
    public void selectTempDepartment(){
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstTempDepartment()).click();
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLstTempDepartmentOpt()).click();
    }

    @Step
    public void goToSave(){
        addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getBtnSave()).click();
        WebDriverWait result = new WebDriverWait(addEmployeePageObject.getDriver(), 20);
        result.until(ExpectedConditions.visibilityOfElementLocated(addEmployeePageObject.getLblPersonalDetails()));
    }

    @Step
    public void validatePersonalDetails()throws IOException{
        String expectedMessage = read.ReadData("Hoja1", "Data.xlsx", 7, 1);
        String obtainedMessage = addEmployeePageObject.getDriver().findElement(addEmployeePageObject.getLblPersonalDetails()).getText();
        Assert.assertThat(obtainedMessage, Matchers.is(expectedMessage));
    }
}