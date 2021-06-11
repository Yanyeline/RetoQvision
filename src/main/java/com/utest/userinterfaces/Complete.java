package com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Complete {

    public static final Target TXT_CREATE_PASSWORD = Target.the("Create password").located(By.id("password"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Confirm password").located(By.id("confirmPassword"));
    public static final Target CHK_TERMS_USE = Target.the("Terms of use").located(By.id("termOfUse"));
    public static final Target CHK_PRIVACY = Target.the("Privacy").located(By.id("privacySetting"));

    public static final Target BTN_COMPLETE = Target.the("Next").located(By.id("laddaBtn"));

}
