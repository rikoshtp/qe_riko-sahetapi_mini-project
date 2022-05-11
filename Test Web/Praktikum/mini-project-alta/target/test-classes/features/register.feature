Feature: Register

    Scenario Outline: Users want to register an account on this website (Register2)
        Given I am on register page
        When I input nama "<name>" on field Nama Lengkap
        And I input email "<gmail>" on field Email
        And I input password "<pw>" on field Password
        And I click register button
        Then I am on signin page
        Examples:
            |name|gmail|pw|
            |Ben Toyib|bentoyib@gmail.com|qualityengineer|

    Scenario Outline: The user wants to register an account on this website, but the email already exists
        Given I am on landing page
        When I click button signin
        And I am on page login
        And I click register
        And I input nama "<name>" on field nama Lengkap
        And I input email "<gmail>" on field email
        And I input password "<pw>" on field password
        And I click button register
        Then Show alert error
        Examples:
            |name|gmail|pw|
            |Bang Toyib|rikoshtp@gmail.com|qualityengineer|




