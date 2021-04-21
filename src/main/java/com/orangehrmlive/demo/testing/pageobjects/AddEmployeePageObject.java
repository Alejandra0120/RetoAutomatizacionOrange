package com.orangehrmlive.demo.testing.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class AddEmployeePageObject extends PageObject {

    private By btnLogin = By.id("btnLogin");
    private By lblDashboard = By.xpath("//li[@class='page-title']");
    private By lstPIM = By.xpath("//span[text()='PIM']");
    private By lstAddEmployee = By.xpath("//span[text()='Add Employee']");
    private By txtFirstName = By.id("first-name-box");
    private By txtMiddleName = By.id("middle-name-box");
    private By txtLastName = By.id("last-name-box");
    private By lstLocation = By.xpath("//button[@class='btn']");
    private By itmCanadianRegional = By.xpath("(//a[@class='dropdown-item'])[1]");
    private By btnLoginDetails = By.id("hasLoginDetails");
    private By txtUserName = By.id("username");
    private By txtPassword = By.id("password");
    private By txtConfirmPassword = By.id("confirmPassword");
    private By lstAdminRole = By.xpath("//select[@id='adminRoleId']");
    private By btnNext = By.xpath("//button[@ohrm-save-form='vm.save(oxdModalForm);']");
    private By txtFirstNameVal = By.xpath("//input[@id='firstName']");
    private By txtDOB = By.xpath("//input[@id='emp_birthday']");
    private By txtHobbies = By.xpath("//input[@id='5']");
    private By btnNext1 = By.xpath("//button[text()='Next']");
    private By txtJoinDate = By.xpath("//input[@id='joined_date']");
    private By lstRegion = By.xpath("(//input[@class='select-dropdown'])[7]");
    private By lstRegionOption = By.xpath("//li//span[text()='Region-2']");
    private By lstFTE = By.xpath("(//input[@class='select-dropdown'])[8]");
    private By lstFTEOption = By.xpath("//li//span[text()='0.75']");
    private By lstTempDepartment = By.xpath("(//input[@class='select-dropdown'])[9]");
    private By lstTempDepartmentOpt = By.xpath("//li//span[text()='Sub unit-2']");
    private By btnSave  = By.xpath("//button[@class='btn waves-effect waves-light right']");
    private By lblPersonalDetails = By.xpath("//h4[text()='Personal Details']");


    public AddEmployeePageObject() {
        super();
    }

    public AddEmployeePageObject(By btnLogin, By lblDashboard, By lstPIM, By lstAddEmployee,
                                 By txtFirstName, By txtMiddleName, By txtLastName, By lstLocation,
                                 By itmCanadianRegional, By btnLoginDetails, By txtUserName,
                                 By txtPassword, By txtConfirmPassword, By lstAdminRole, By btnNext,
                                 By txtFirstNameVal, By txtDOB, By txtHobbies, By btnNext1, By txtJoinDate, By lstRegion, By lstRegionOption,
                                 By lstFTE, By lstFTEOption, By lstTempDepartment, By lstTempDepartmentOpt,
                                 By btnSave, By lblPersonalDetails) {
        this.btnLogin = btnLogin;
        this.lblDashboard = lblDashboard;
        this.lstPIM = lstPIM;
        this.lstAddEmployee = lstAddEmployee;
        this.txtFirstName = txtFirstName;
        this.txtMiddleName = txtMiddleName;
        this.txtLastName = txtLastName;
        this.lstLocation = lstLocation;
        this.itmCanadianRegional = itmCanadianRegional;
        this.btnLoginDetails = btnLoginDetails;
        this.txtUserName = txtUserName;
        this.txtPassword = txtPassword;
        this.txtConfirmPassword = txtConfirmPassword;
        this.lstAdminRole = lstAdminRole;
        this.btnNext = btnNext;
        this.txtFirstNameVal = txtFirstNameVal;
        this.txtDOB = txtDOB;
        this.txtHobbies = txtHobbies;
        this.btnNext1 = btnNext1;
        this.txtJoinDate = txtJoinDate;
        this.lstRegion = lstRegion;
        this.lstRegionOption = lstRegionOption;
        this.lstFTE = lstFTE;
        this.lstFTEOption = lstFTEOption;
        this.lstTempDepartment = lstTempDepartment;
        this.lstTempDepartmentOpt = lstTempDepartmentOpt;
        this.btnSave = btnSave;
        this.lblPersonalDetails = lblPersonalDetails;
    }

    public By getBtnLogin() {

        return btnLogin;
    }

    public void setBtnLogin(By btnLogin) {
        this.btnLogin = btnLogin;
    }

    public By getLstPIM() {

        return lstPIM;
    }

    public void setLstPIM(By lstPIM) {

        this.lstPIM = lstPIM;
    }

    public By getLstAddEmployee() {
        return lstAddEmployee;
    }

    public void setLstAddEmployee(By lstAddEmployee) {
        this.lstAddEmployee = lstAddEmployee;
    }

    public By getLblDashboard() {
        return lblDashboard;
    }

    public void setLblDashboard(By lblDashboard) {
        this.lblDashboard = lblDashboard;
    }

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public void setTxtFirstName(By txtFirstName) {
        this.txtFirstName = txtFirstName;
    }

    public By getTxtMiddleName() {
        return txtMiddleName;
    }

    public void setTxtMiddleName(By txtMiddleName) {
        this.txtMiddleName = txtMiddleName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public void setTxtLastName(By txtLastName) {
        this.txtLastName = txtLastName;
    }

    public By getLstLocation() {
        return lstLocation;
    }

    public void setLstLocation(By lstLocation) {
        this.lstLocation = lstLocation;
    }

    public By getItmCanadianRegional() {
        return itmCanadianRegional;
    }

    public void setItmCanadianRegional(By itmCanadianRegional) {
        this.itmCanadianRegional = itmCanadianRegional;
    }

    public By getBtnLoginDetails() {
        return btnLoginDetails;
    }

    public void setBtnLoginDetails(By btnLoginDetails) {
        this.btnLoginDetails = btnLoginDetails;
    }

    public By getTxtUserName() {
        return txtUserName;
    }

    public void setTxtUserName(By txtUserName) {
        this.txtUserName = txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(By txtPassword) {
        this.txtPassword = txtPassword;
    }

    public By getTxtConfirmPassword() {
        return txtConfirmPassword;
    }

    public void setTxtConfirmPassword(By txtConfirmPassword) {
        this.txtConfirmPassword = txtConfirmPassword;
    }

    public By getLstAdminRole() {
        return lstAdminRole;
    }

    public void setLstAdminRole(By lstAdminRole) {
        this.lstAdminRole = lstAdminRole;
    }

    public By getBtnNext() {
        return btnNext;
    }

    public void setBtnNext(By btnNext) {
        this.btnNext = btnNext;
    }

    public By getLblPersonalDetails() {
        return lblPersonalDetails;
    }

    public void setLblPersonalDetails(By lblPersonalDetails) {
        this.lblPersonalDetails = lblPersonalDetails;
    }

    public By getTxtDOB() {
        return txtDOB;
    }

    public void setTxtDOB(By txtDOB) {
        this.txtDOB = txtDOB;
    }

    public By getTxtHobbies() {
        return txtHobbies;
    }

    public void setTxtHobbies(By txtHobbies) {
        this.txtHobbies = txtHobbies;
    }

    public By getBtnNext1() {
        return btnNext1;
    }

    public void setBtnNext1(By btnNext1) {
        this.btnNext1 = btnNext1;
    }

    public By getTxtJoinDate() {
        return txtJoinDate;
    }

    public void setTxtJoinDate(By txtJoinDate) {
        this.txtJoinDate = txtJoinDate;
    }

    public By getTxtFirstNameVal() {
        return txtFirstNameVal;
    }

    public void setTxtFirstNameVal(By txtFirstNameVal) {
        this.txtFirstNameVal = txtFirstNameVal;
    }

    public By getLstRegion() {
        return lstRegion;
    }

    public void setLstRegion(By lstRegion) {
        this.lstRegion = lstRegion;
    }

    public By getLstRegionOption() {
        return lstRegionOption;
    }

    public void setLstRegionOption(By lstRegionOption) {
        this.lstRegionOption = lstRegionOption;
    }

    public By getLstFTE() {
        return lstFTE;
    }

    public void setLstFTE(By lstFTE) {
        this.lstFTE = lstFTE;
    }

    public By getLstFTEOption() {
        return lstFTEOption;
    }

    public void setLstFTEOption(By lstFTEOption) {
        this.lstFTEOption = lstFTEOption;
    }

    public By getLstTempDepartment() {
        return lstTempDepartment;
    }

    public void setLstTempDepartment(By lstTempDepartment) {
        this.lstTempDepartment = lstTempDepartment;
    }

    public By getLstTempDepartmentOpt() {
        return lstTempDepartmentOpt;
    }

    public void setLstTempDepartmentOpt(By lstTempDepartmentOpt) {
        this.lstTempDepartmentOpt = lstTempDepartmentOpt;
    }

    public By getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(By btnSave) {
        this.btnSave = btnSave;
    }
}
