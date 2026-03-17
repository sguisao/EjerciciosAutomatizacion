package com.screenplay.retoautomation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarItemCarritoPage {
    public static final Target ITEM_LINK = Target.the("Item link")
            .located(By.xpath("//a[@class='hrefch'  and text()='Iphone 6 32gb']"));

    public static final Target BUTTON_LINK = Target.the("Button link")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));

    public static final Target CART_LINK = Target.the("Cart link").located(By.xpath("//a[text()='Cart']"));

}
