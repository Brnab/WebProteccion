Feature: Compra en swagger


  Scenario: Compra en swagger
    Given Dado que inicio sesion en la pagina web
    When Selecciono los dos articulos y complete el proceso de comprar
    Then Entonces me debe aparecer un mensaje exitoso confirmando la compra