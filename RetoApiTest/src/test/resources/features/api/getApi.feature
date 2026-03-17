Feature: Prueba Get API Rick y Morty

  Background:
    * url rickandmortyUrl

  @get
  Scenario: Obtener personaje por id
    Given path 'api/character', 3
    When method GET
    Then status 200
    And match response.id == 3
    And match response.name contains 'Summer'
    And match response.species == '#string'