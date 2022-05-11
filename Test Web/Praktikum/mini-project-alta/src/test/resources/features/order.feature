Feature: Order

    Background:
            Given I am on Landing_Pages
            When I click "Buy" on any product
            And I click Icon Cart

    Scenario: Add and subtract product quantity and then order without login
        And I click "+" 2 times
        And I click "-"
        And I click button Bayar
        Then Show Sign In Page

    Scenario: Add and subtract product quantity and then order with login
        And I click button "+" 2 times
        And I click button "-"
        And I Click button Bayar
        And I am go to login page
        And I input email "<mail>" and invalid password "<pwd>"
        And I click LOGIN button
        Then I am on Transaction Page




