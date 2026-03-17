package com.screenplay.retoautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.screenplay.retoautomation.userinterfaces.FacturaPedidoPage.THANKS_PURCHASE;

public class ExisteFactura implements Question<String> {

    public static ExisteFactura seMuestraMensajeDeGracias() {
        return new ExisteFactura();
    }

    @Override
    public String answeredBy(Actor actor) {
        return THANKS_PURCHASE.resolveFor(actor).getText();
    }
}
