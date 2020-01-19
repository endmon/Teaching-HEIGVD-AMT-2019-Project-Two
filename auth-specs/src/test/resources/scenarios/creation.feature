Feature: Creation of user

  Background:
    Given there is a Users server

  Scenario: create a new user
    Given I have a user payload
    When I POST it to the /users endpoint
    Then I receive a 201 status code
    
  Scenario: create an already existing user
    Given I have an already existing user payload
    When I POST it to the /users endpoint
    Then I receive a 403 status code