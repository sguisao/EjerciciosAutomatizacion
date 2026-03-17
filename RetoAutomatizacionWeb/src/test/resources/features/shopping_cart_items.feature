@regresion
Feature: shopping cart items
  Como usuario comprador
  Quiero seleccionar y agregar productos al carrito
  Para poder comprarlos

  Background:
    Given que el usuario comprador esta en la pagina Demo Blaze

  @shopping
  Scenario: Agregar un ítem al carrito
    When seleccione y agregue productos al carrito
    Then podra pagarlos y finalizar la compra

  @facturar
  Scenario: Facturar items del carrito
    Given que el usuario comprador tiene items en el carrito
    When procede a facturar
    Then se genera la factura correspondiente
