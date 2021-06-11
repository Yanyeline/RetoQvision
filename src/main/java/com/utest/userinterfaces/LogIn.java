package com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LogIn {

    public static final Target TXT_USER = Target.the("User name").located(By.id("username"));
    public static final Target TXT_PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target BTN_SIGN_IN = Target.the("Sign in").located(By.id("kc-login"));
    public static final Target LBL_EMAIL = Target.the("Instructions").located(By.cssSelector(".auth-section  span"));


}
