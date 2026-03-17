package com.screenplay.retoautomation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hooks {

    @Before (order = 0)
    public void inicializeActor(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Actor");
    }

    @After (order = 1)
    public void tearDown() {
        OnStage.drawTheCurtain();
    }
}
