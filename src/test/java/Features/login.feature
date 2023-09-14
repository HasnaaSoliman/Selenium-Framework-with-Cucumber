

  Feature: Test The Login Functionality
    @Sanity @Regression
    Scenario: To Login With Valid email and password
      Given User open the website and navigate to login page
      When User fill email as "qacart" and password as "Test123!" and click on login
      Then User should navigate to home page
    @Regression
      Scenario Outline: login with invalid credentials
        Given User open the website and navigate to login page
        When User fill email as "<username>" and password as "<password>" and click on login
      Then error message should appear

      Examples:
        |    username    |     password   |
        |    wrong       |   Test123!     |
        |    qacart      |   12345**      |
        |    hasnaa      |   159xc*       |



