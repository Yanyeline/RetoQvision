package com.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class HomePage extends PageObject {

    public static final Target BTN_JOIN = Target.the("Join today").located(By.cssSelector(".unauthenticated-nav-bar__sign-up"));
    public static final Target BTN_LOG_IN = Target.the("Log in").located(By.cssSelector(".unauthenticated-nav-bar__links [target]"));


}
