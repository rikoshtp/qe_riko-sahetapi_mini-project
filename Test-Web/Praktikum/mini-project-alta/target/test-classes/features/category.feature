Feature: Category

    Scenario: User want to search product by Category (Category1)
        Given I am on landing Page
        When I click button "Select category..."
        And I click category "Kesehatan"
        Then Show alert "Product is empty!"

    Scenario: User want to search product by Category (Category2)
        Given I am on landing Pagee
        When I click button "Select category.."
        And I click category "Alat"
        Then Show alert "Can not get products!"
