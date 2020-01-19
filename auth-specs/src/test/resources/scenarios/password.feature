Feature: Change password of a user

  Background:
    Given there is a Users server

   Scenario:
     Given I have a user jwttoken corresponding to email payload
     When I POST it to the /users/test@test.com endpoint
     Then I receive a 201 status code