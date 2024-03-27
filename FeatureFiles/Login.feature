Feature: As a admin, user should be able to login with valid credentials

  @Smoke
  Scenario: Admin should be able to login with email id and password
    Given Application is up and running
    When User enter username as "admin@email.com"
    And User enter password as "admin@123"
    And click on login button
    Then User should be able to login and see welcome message
