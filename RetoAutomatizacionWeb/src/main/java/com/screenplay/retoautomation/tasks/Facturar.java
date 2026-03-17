package com.screenplay.retoautomation.tasks;

import com.screenplay.retoautomation.interactions.Esperar;
import com.screenplay.retoautomation.userinterfaces.AgregarItemCarritoPage;
import com.screenplay.retoautomation.userinterfaces.FacturarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

/*import static com.screenplay.retoautomation.userinterfaces.FacturarPage.BUTTON_PLACE_ORDER;
import static com.screenplay.retoautomation.userinterfaces.FacturarPage.NAME_FILED;*/
import static com.screenplay.retoautomation.userinterfaces.FacturarPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Facturar implements Task {


    public static Performable facturarItemsCarrito() {
        return  Tasks.instrumented(Facturar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.por(2),
                Click.on(BUTTON_PLACE_ORDER),
                Enter.theValue("Sebas").into(NAME_FILED),
                Enter.theValue("Colombia").into(COUNTRY_FILED),
                Enter.theValue("Medellín").into(CITY_FILED),
                Enter.theValue("Visa").into(CARD_FILED),
                Enter.theValue("203568").into(MONTH_FILED),
                Enter.theValue("2026").into(YEAR_FILED),
                Click.on(BUTTON_PURCHASE)
        );
    }
}
