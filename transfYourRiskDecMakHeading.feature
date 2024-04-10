Feature: LexisNexis Home Page

  Background:
    Given I am on the lexiNexis landing page

  Scenario: Verify links under Transform Your Risk Decision Making Heading are displayed and enabled
    When I scroll to Transform Your Risk Decision Making Heading
    Then I should see all the correct links and they should be enabled




