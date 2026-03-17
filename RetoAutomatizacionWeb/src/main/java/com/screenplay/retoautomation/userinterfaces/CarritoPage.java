package com.screenplay.retoautomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {

    public static final Target ITEM_CART = Target.the("CART ITEM").located(By.xpath("//tbody[@id='tbodyid']//td[contains(normalize-space(.), 'Iphone 6 32gb')]"));
}
