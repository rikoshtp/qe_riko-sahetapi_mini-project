Feature: Product

    Scenario: User want add product to Cart
        Given I am on Landing_Page
        When I search and found "Tensi Darah Elektrik"
        And I click "Beli"
        Then The product "Tensi Darah Elektrik" was added to cart

    Scenario: User want to view detail product
        Given I am on Landing_Pagee
        When I search and found product "Kamera"
        And I click button "DETAIL"
        Then Display product detail page

