Feature: Product

    Scenario: User want add product to Cart
        Given I am on Product Screen
        When I Search and Found product
        And I click Beli
        Then The number of items in the Cart increases

