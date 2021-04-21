#language: en
  ##author: Jenny Alejandra Barbosa Pardo - jenny.barbosa@sqasa.co

  Feature:As a admin
  need to register a new employee
 and validate that employee is registered successfully

    @Case1
    Scenario: Employee registered successfully
      Given the admin logins in the page
      When register a new employee
      Then validate register is successfully