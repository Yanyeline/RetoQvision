package com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Devices {

    public static final Target TXT_COMPUTER = Target.the("Computer").located(By.cssSelector("div#web-device > div:nth-of-type(1) > .ui-select-box"));
    public static final Target TXT_MOBILE = Target.the("Mobile").located(By.cssSelector("div#mobile-device > div:nth-of-type(1) > .ui-select-box"));
    public static final Target TXT_SEARCH_MOILE = Target.the("Search mobile").located(By.xpath("//div[@id='mobile-device']/div[1]/div[@class='ui-select-box']/div[@role='combobox']/input[@type='search']"));

    public static final Target TXT_MODEL = Target.the("Model").located(By.cssSelector("div#mobile-device > div:nth-of-type(2) > .ui-select-box"));
    public static final Target TXT_SEARCH_MODEL = Target.the("Search model").located(By.xpath("//div[@id='mobile-device']/div[2]/div[@class='ui-select-box']/div[@role='combobox']/input[@type='search']"));

    public static final Target TXT_SYSTEM = Target.the("Operating system").located(By.cssSelector("div#mobile-device > div:nth-of-type(3) > .ui-select-box"));
    public static final Target TXT_SEARCH_SYSTEM = Target.the("Search operating system").located(By.xpath("//div[@id='mobile-device']/div[3]/div[@class='ui-select-box']/div[@role='combobox']/input[@type='search']"));


    public static final Target BTN_NEXT = Target.the("Next").located(By.cssSelector(".next-step.pull-right > a[role='button']"));

}
