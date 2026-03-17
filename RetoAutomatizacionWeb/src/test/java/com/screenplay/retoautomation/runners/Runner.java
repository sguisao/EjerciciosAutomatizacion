package com.screenplay.retoautomation.runners;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features", // Ruta de mis .feature
        glue = {"com.screenplay.retoautomation.stepdefinitions", "com.screenplay.retoautomation.hooks"}, // Paquete de mis StepDefinitions y hooks
        tags = "@facturar", // Filtra escenarios por etiquetas en este caso @shopping
        plugin = {"pretty","json:target/cucumber-report.json" , "json:target/cucumber.json"}, // Salida más legible en consola
        snippets = CucumberOptions.SnippetType.CAMELCASE // le dice a Cucumber que los métodos de StepDefinitions se generen con nombres en camelCase
)

public class Runner {
}
