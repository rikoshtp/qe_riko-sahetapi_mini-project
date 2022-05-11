Feature: Login

    Scenario: Verify if a user can login with a valid email and password. (Login4)
        Given I am on Landing Page
        When I click button sign-in
        And I am on login page
        And I input email "<email>" and password "<password>"
        And I click login button
        Then I am on home page

    Scenario Outline: Verify if a user can't login with an invalid email and password. (Login3)
        Given I am on LandingPage
        When I click button Sign In
        And I am on LoginPage
        And I input invalid email "<mail>" and invalid password "<pwd>"
        And I click button login
        Then Show Error Message "record not found"
        Examples:
            |mail|pwd|
            |riko@gmail.com|passwordsalah|


    Scenario Outline: Verify if a user can't login with an valid email and invalid password. (Login2)
        Given I am on Landing Page2
        When I click button sign-In
        And I am on login  Page
        And I input valid email "<email>" and invalid password "<password>"
        And I click login Button
        Then Show error Message "email or password is invalid"
        Examples:
            |email|password|
            |rikoshtp@gmail.com|passwordsalah|

    Scenario Outline: Verify if a user can't login with an invalid email and valid password. (Login1)
        Given I am on Landing Page1
        When I click button Sign-in
        And I am on login Page
        And I input invalid email "<email>" and valid password "<password>"
        And I click Button Login
        Then Showing Error Message "record not found"
        Examples:
            |email|password|
            |riko@gmail.com|qualityengineer|



