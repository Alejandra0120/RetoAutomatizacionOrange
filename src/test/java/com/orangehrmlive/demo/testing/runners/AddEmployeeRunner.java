package com.orangehrmlive.demo.testing.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/com.orangehrmlive.demo.testing.features/AddEmployee.feature"},
        glue = "com.orangehrmlive.demo.testing",
        snippets = SnippetType.CAMELCASE)
public class AddEmployeeRunner {
    private AddEmployeeRunner(){}
}
