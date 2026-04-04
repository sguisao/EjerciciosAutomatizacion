package com.screenplay.retoautomation.tasks;

import com.screenplay.retoautomation.interactions.AceptarAgregarProductoCarrito;
import com.screenplay.retoautomation.interactions.Esperar;
import com.screenplay.retoautomation.userinterfaces.AgregarItemCarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.screenplay.retoautomation.userinterfaces.AgregarItemCarritoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarItemCarrito implements Task {
    public static AgregarItemCarrito agregarItemCarrito() {
        return Tasks.instrumented(AgregarItemCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AgregarItemCarritoPage.ITEM_LINK, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ITEM_LINK),
                WaitUntil.the(AgregarItemCarritoPage.BUTTON_LINK, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_LINK),
                Esperar.por(1),
                AceptarAgregarProductoCarrito.now(),
                Esperar.por(3),
                Click.on(CART_LINK)
        );
    }
}
