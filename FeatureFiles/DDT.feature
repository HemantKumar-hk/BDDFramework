Feature: Title of your feature
  I want to use this template for my feature file

  @DDT
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the "<value>" in step
    Then I verify the "<status>" in step

    Examples: 
      | name    | value | status  |
      | Hemant  |    50 | success |
      | Afjal   |    70 | Fail    |
      | Pritesh |    70 | success |
      | Kunal   |    80 | Fail    |
