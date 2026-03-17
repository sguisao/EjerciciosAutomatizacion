package com.screenplay.retoautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;



public class AceptarAgregarProductoCarrito implements Interaction {
    public static AceptarAgregarProductoCarrito now() {
        return new AceptarAgregarProductoCarrito();

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
