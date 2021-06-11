package com.utest.tasks.user;

import com.utest.tasks.common.Wait;
import com.utest.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogInUser implements Task {

    private Map<String, String> data;


    public LogInUser(Map<String, String> dataUser) {

        this.data = dataUser;
    }

    @Step("{0} Log In new user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.Element(LogIn.TXT_USER),
                Enter.theValue(data.get("email")).into(LogIn.TXT_USER),
                Enter.theValue(data.get("createPassword")).into(LogIn.TXT_PASSWORD),
                Click.on(LogIn.BTN_SIGN_IN)
        );
    }

    public static LogInUser fillFields(Map<String, String> data) {
        return instrumented(LogInUser.class, data);
    }
}
