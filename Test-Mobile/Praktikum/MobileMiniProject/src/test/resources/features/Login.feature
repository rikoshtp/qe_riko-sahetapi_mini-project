Feature: Login

    Scenario Outline: Verify if a user can login with a valid email and password. (Login1)
        Given I am on Page Home
        When I tap icon login
        And I input valid Email "<email>" and password "password"
        And I tap button "Login"
        Then I am on Product Page
        |email|password|
        |rikoshtp@gmail.com|qualityengineer|

#    Scenario: Verify if a user can't login with an invalid email and password. (Login2)
#        Given I am on Home Page
#        When I click Icon Login
#        And I input invalid Email "<email>" and password "password"
#        And I click "Login" button
#        Then I am on Products Page
