package com.orangehrmlive.demo.testing.stepdefinitions;

import com.orangehrmlive.demo.testing.steps.AddEmployeeSteps;
import cucumber.api.java.bs.I;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AddEmployeeStepDefinitions {
    @Steps
    private AddEmployeeSteps addEmployeeSteps;

    @Given("^the admin logins in the page$")
    public void theAdminLoginsInThePage() {
        addEmployeeSteps.openBrowser();
        addEmployeeSteps.goToLogin();
        addEmployeeSteps.validateLogin();
    }

    @When("^register a new employee$")
    public void registerANewEmployee() throws IOException, InterruptedException {
        addEmployeeSteps.goToAddEmployee();
        addEmployeeSteps.inputFirstName();
        addEmployeeSteps.inputMiddleName();
        addEmployeeSteps.inputLastName();
        addEmployeeSteps.selectLocation();
        addEmployeeSteps.selectLoginDetails();
        addEmployeeSteps.inputUserName();
        addEmployeeSteps.inputPassword();
        addEmployeeSteps.inputConfirmPassword();
        addEmployeeSteps.selectAdminRole();
        addEmployeeSteps.goToNext();
        addEmployeeSteps.validateFirstName();
        addEmployeeSteps.selectDOB();
        addEmployeeSteps.inputHobbies();
        addEmployeeSteps.goToNext1();
        addEmployeeSteps.validateJoinDate();
        addEmployeeSteps.selectRegion();
        addEmployeeSteps.selectFTE();
        addEmployeeSteps.selectTempDepartment();
        addEmployeeSteps.goToSave();
    }

    @Then("^validate register is successfully$")
    public void validateRegisterIsSuccessfully()throws IOException{
        addEmployeeSteps.validatePersonalDetails();

    }
}
