package com.utest.questions;


import com.utest.userinterfaces.LogIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class CheckUser implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return Text.of(LogIn.LBL_EMAIL).viewedBy(actor).asString();

    }

    public static CheckUser email() {
        return new CheckUser();
    }


}
