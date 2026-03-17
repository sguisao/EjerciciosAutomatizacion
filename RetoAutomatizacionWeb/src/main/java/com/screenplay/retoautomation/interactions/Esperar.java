package com.screenplay.retoautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar implements Interaction {
    private final int segundos;

    public Esperar(int segundos) { this.segundos = segundos; }

    public static Esperar por(int segundos) {
        return new Esperar(segundos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
