Feature: Contact page feature

  @Regression
  Scenario: Make sure email text field is visible
    Given User open the website and navigate to login page
    When User fill email as "qacart" and password as "Test123!" and click on login
    And clicks on contacts
    Then Email text field should be visible
  @Regression
    Scenario: Add new contact
      Given User open the website and navigate to login page
      When User fill email as "qacart" and password as "Test123!" and click on login
      And clicks on contacts
     And click on add new contacts
     And Fill the FirstName and LastName
     Then New contact should be added
