package com.screenplay.retoautomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FacturarPage {
    public static final Target BUTTON_PLACE_ORDER = Target.the("Button place order").located(By.xpath("//button[normalize-space()='Place Order']"));
    public static final Target NAME_FILED = Target.the("Name field").located(By.id("name"));
    public static final Target COUNTRY_FILED = Target.the("Country field").located(By.id("country"));
    public static final Target CITY_FILED = Target.the("City field").located(By.id("city"));
    public static final Target CARD_FILED = Target.the("Card field").located(By.id("card"));
    public static final Target MONTH_FILED = Target.the("Month field").located(By.id("month"));
    public static final Target YEAR_FILED = Target.the("Year field").located(By.id("year"));
    public static final Target BUTTON_PURCHASE = Target.the("Button purchase").located(By.xpath("//button[contains(text(),'Purchase')]"));
}
