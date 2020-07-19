Feature: Search Products

  Background:
    Given User opened "https://www.bukalapak.com"

  Scenario: User search products in Home Page
    When User in Home Page screen sendskeys on v-omnisearch__input with "smartphone"
    And User in Home Page screen clicks on Search button
    Then Title "Jual Produk Smartphone Murah dan Terlengkap Juli 2020 | Bukapalak" in Home Page screen will be displayed