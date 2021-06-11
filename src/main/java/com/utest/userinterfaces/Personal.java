package com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Personal {

    public static final Target TXT_FIRST_NAME = Target.the("First name").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME = Target.the("Last name").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Last name").located(By.id("email"));
    public static final Target DDL_BIRTH_MONTH = Target.the("Birth month").located(By.id("birthMonth"));
    public static final Target DDL_BIRTH_DAY = Target.the("Day month").located(By.id("birthDay"));
    public static final Target DDL_BIRTH_YEAR = Target.the("Year month").located(By.id("birthYear"));
    public static final Target DDL_OPTION = Target.the("Option").locatedBy("[label='{0}']");
    public static final Target TXT_LANGUAGES = Target.the("Languages").located(By.cssSelector("input[role='combobox']"));
    public static final Target BTN_NEXT = Target.the("Next").located(By.xpath("//a[@role='button']"));

}
