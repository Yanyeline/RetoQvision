package com.utest.stepdefinitions;

import com.utest.questions.CheckUser;
import com.utest.tasks.common.OpenTheAplication;
import com.utest.tasks.user.LogInUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import com.utest.tasks.user.Create;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CreateUser {

    @Given("^User is on the home page$")
    public void user_is_on_the_home_page() {
        theActorInTheSpotlight().wasAbleTo(OpenTheAplication.withUrl());
    }


    @When("^Enter registration information$")
    public void enter_registration_information(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(Create.fillFields(data));

    }

    @Then("^Create the new user and enter the application$")
    public void create_the_new_user_and_enter_the_application(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(LogInUser.fillFields(data));
        theActorInTheSpotlight().should(seeThat(CheckUser.email(), equalTo(data.get("email"))));

    }

}
