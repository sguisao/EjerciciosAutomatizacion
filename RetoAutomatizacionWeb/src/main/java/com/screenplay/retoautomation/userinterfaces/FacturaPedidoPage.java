package com.screenplay.retoautomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FacturaPedidoPage {

    public static final Target THANKS_PURCHASE = Target.the("PURCHASE THANKS").located(By.xpath("//h2[normalize-space()='Thank you for your purchase!']"));
}
