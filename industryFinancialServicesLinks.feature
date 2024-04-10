Feature: Industry

  Background:
    Given I am on the lexiNexis landing page

  Scenario: Verify elements on the Choose your Industry tab
      When I navigate to choose your industry page
      And I select the financial services link
      Then I should see all financial services links displayed and enabled