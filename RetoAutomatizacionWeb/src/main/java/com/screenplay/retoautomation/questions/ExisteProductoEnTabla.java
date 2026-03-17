package com.screenplay.retoautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.screenplay.retoautomation.userinterfaces.CarritoPage.ITEM_CART;

public class ExisteProductoEnTabla implements Question<String> {

    public static ExisteProductoEnTabla seEncuantraElProductoEnLaTabla(){
        return new ExisteProductoEnTabla();
    }
    @Override
    public String answeredBy(Actor actor) {
        return ITEM_CART.resolveFor(actor).getText();
    }
}
