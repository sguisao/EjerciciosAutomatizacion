@crud
Feature: Prueba POST API Petstore

  Background:
    * url petsUrl




  @post
  Scenario: Crear una nueva mascota
    Given path 'pet'
    And request { id: 1, name: 'GU', status: 'activo' }
    When method POST
    Then status 200
    And match response.name == 'GU'
    And match response.status == 'activo'

  @get
  Scenario: Consultar mascota por ID
    Given path 'pet', 1
    When method GET
    Then status 200
    And match response.id == 1

  @put
  Scenario: Actualizar mascota existente
    Given path 'pet'
    And request { id: 1, name: 'Mina', status: 'ok' }
    When method PUT
    Then status 200
    And match response.name == 'Mina'

  @delete
  Scenario: Eliminar mascota por ID
    Given path 'pet', 1
    When method DELETE
    Then status 200
    And match response.code == 200
    And match response.message == '1'
