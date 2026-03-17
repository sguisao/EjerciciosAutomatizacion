package com.screenplay.retoautomation.stepdefinitions;



import com.screenplay.retoautomation.questions.ExisteFactura;
import com.screenplay.retoautomation.questions.ExisteProductoEnTabla;
import com.screenplay.retoautomation.tasks.AgregarItemCarrito;
import com.screenplay.retoautomation.tasks.Facturar;
import com.screenplay.retoautomation.userinterfaces.DemoBlazePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class ShoppingDemoBlazeStepdefinition {
    // Background
    @Given("que el usuario comprador esta en la pagina Demo Blaze")
    public void queElUsuarioCompradorEstaEnLaPaginaDemoBlaze() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new DemoBlazePage()));
    }

    // Scenario 1
    @When("seleccione y agregue productos al carrito")
    public void seleccioneYAgregueProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(AgregarItemCarrito.agregarItemCarrito());
    }
    @Then("podra pagarlos y finalizar la compra")
    public void podraPagarlosYFinalizarLaCompra() {
        theActorInTheSpotlight().should(seeThat(ExisteProductoEnTabla.seEncuantraElProductoEnLaTabla(),
                containsString("Iphone 6 32gb")));
    }

    // Scenario 2
    @Given("que el usuario comprador tiene items en el carrito")
    public void queElUsuarioCompradorTieneItemsEnElCarrito() {
        theActorInTheSpotlight().attemptsTo(AgregarItemCarrito.agregarItemCarrito());
    }

    @When("procede a facturar")
    public void procedeAFacturar() {
        theActorInTheSpotlight().attemptsTo(Facturar.facturarItemsCarrito());
    }

    @Then("se genera la factura correspondiente")
    public void seGeneraLaFacturaCorrespondiente() {
        theActorInTheSpotlight().should(seeThat(ExisteFactura.seMuestraMensajeDeGracias(),
                containsString("Thank you for your purchase!")));
    }
}
