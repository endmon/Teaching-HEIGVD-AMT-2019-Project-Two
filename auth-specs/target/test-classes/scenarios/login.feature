Feature: Authentication of a user

  Background:
    Given there is a Users server

  Scenario: login with good credentials
    Given I have user credentials payload
    When I POST it to the /login endpoint
    Then I receive a 201 status code
    Then I receive a jwttoken