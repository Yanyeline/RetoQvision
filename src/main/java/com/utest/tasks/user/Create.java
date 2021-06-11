package com.utest.tasks.user;

import com.utest.tasks.common.Wait;
import com.utest.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.Map;

public class Create implements Task {

    private Map<String, String> data;


    public Create(Map<String, String> dataUser) {

        this.data = dataUser;
    }

    @Step("{0} Enter data create a new user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_JOIN),
                Wait.Element(Personal.TXT_FIRST_NAME),
                Enter.theValue(data.get("firstName")).into(Personal.TXT_FIRST_NAME),
                Enter.theValue(data.get("lastName")).into(Personal.TXT_LAST_NAME),
                Enter.theValue(data.get("email")).into(Personal.TXT_EMAIL),
                Click.on(Personal.DDL_BIRTH_MONTH),
                Click.on(Personal.DDL_OPTION.of(data.get("birthMonth"))),
                Click.on(Personal.DDL_BIRTH_DAY),
                Click.on(Personal.DDL_OPTION.of(data.get("birthDay"))),
                Click.on(Personal.DDL_BIRTH_YEAR),
                Click.on(Personal.DDL_OPTION.of(data.get("birthYear"))),
                Click.on(Personal.TXT_LANGUAGES),
                Enter.theValue(data.get("languages")).into(Personal.TXT_LANGUAGES),
                Hit.the(Keys.ENTER).into(Personal.TXT_LANGUAGES),
                Click.on(Personal.BTN_NEXT),
                Wait.Element(Address.TXT_CITY),
                Enter.theValue(data.get("city")).into(Address.TXT_CITY),
                Enter.theValue(data.get("postalCode")).into(Address.TXT_POSTAL_CODE),
                Click.on(Address.DDL_COUNTRY),
                Enter.theValue(data.get("country")).into(Address.TXT_SEARCH_COUNTRY),
                Hit.the(Keys.ENTER).into(Address.TXT_SEARCH_COUNTRY),
                Click.on(Address.BTN_NEXT),
                Wait.Element(Devices.TXT_COMPUTER),
                Click.on(Devices.TXT_MOBILE),
                Enter.theValue(data.get("MobileDevice")).into(Devices.TXT_SEARCH_MOILE),
                Hit.the(Keys.ENTER).into(Devices.TXT_SEARCH_MOILE),
                Click.on(Devices.TXT_MODEL),
                Enter.theValue(data.get("model")).into(Devices.TXT_SEARCH_MODEL),
                Hit.the(Keys.ENTER).into(Devices.TXT_SEARCH_MODEL),
                Click.on(Devices.TXT_SYSTEM),
                Enter.theValue(data.get("operatingSystem")).into(Devices.TXT_SEARCH_SYSTEM),
                Hit.the(Keys.ENTER).into(Devices.TXT_SEARCH_SYSTEM),
                Click.on(Devices.BTN_NEXT),
                Wait.Element(Complete.TXT_CREATE_PASSWORD),
                Enter.theValue(data.get("createPassword")).into(Complete.TXT_CREATE_PASSWORD),
                Enter.theValue(data.get("confirmPassword")).into(Complete.TXT_CONFIRM_PASSWORD),
                Click.on(Complete.CHK_TERMS_USE),
                Click.on(Complete.CHK_PRIVACY),
                Click.on(Complete.BTN_COMPLETE),
                Click.on(HomePage.BTN_LOG_IN),
                Wait.Element(LogIn.TXT_USER)

        );
    }

    public static Create fillFields(Map<String, String> data) {
        return instrumented(Create.class, data);
    }
}
