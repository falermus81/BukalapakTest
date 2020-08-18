Feature: Order

  Scenario: User makes an order using voucher
    Given User has chosen a product of which price is 100000
    When User in Order Detail page select JNE courier with charge 12000
    And User in Payment Method page input voucher code "MERDEKA"
    Then User in Order Status page finds total payment 95000