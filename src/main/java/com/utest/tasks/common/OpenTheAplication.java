package com.utest.tasks.common;

import com.utest.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheAplication implements Task {

    HomePage homePage;

    @Step("{0} Opens the web site")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(homePage)
        );
    }

    public static com.utest.tasks.common.OpenTheAplication withUrl() {
        return Tasks.instrumented(com.utest.tasks.common.OpenTheAplication.class);
    }


}
