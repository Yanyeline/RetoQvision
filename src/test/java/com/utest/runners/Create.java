package com.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = {"com.utest.stepdefinitions"},
        features = {"src/test/resources/features/create_user.feature"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)
public class Create {
}
