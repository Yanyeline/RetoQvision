package com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Address {

    public static final Target TXT_CITY = Target.the("City").located(By.id("city"));
    public static final Target TXT_POSTAL_CODE = Target.the("Postal code").located(By.id("zip"));
    public static final Target DDL_COUNTRY = Target.the("Country").located(By.cssSelector(".ui-select"));
    public static final Target TXT_SEARCH_COUNTRY = Target.the("Search country").located(By.xpath("//div[@class='ui-select']//div[@role='combobox']//input[@type='search']"));
    public static final Target BTN_NEXT = Target.the("Next").located(By.cssSelector(".next-step.pull-right > a[role='button']"));

}
