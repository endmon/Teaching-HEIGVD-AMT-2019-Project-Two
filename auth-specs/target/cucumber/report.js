$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("creation.feature");
formatter.feature({
  "line": 1,
  "name": "Creation of user",
  "description": "",
  "id": "creation-of-user",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Users server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationSteps.there_is_a_Users_server()"
});
formatter.result({
  "duration": 2004819100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create a new user",
  "description": "",
  "id": "creation-of-user;create-a-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a user payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /users endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 201 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "CreationSteps.i_have_a_user_payload()"
});
formatter.result({
  "duration": 191500,
  "status": "passed"
});
formatter.match({
  "location": "CreationSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 128692800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "CreationSteps.i_receive_a_status_code(int)"
});
formatter.result({
  "duration": 2497300,
  "error_message": "java.lang.AssertionError: expected:\u003c201\u003e but was:\u003c403\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat ch.heigvd.users.api.spec.steps.CreationSteps.i_receive_a_status_code(CreationSteps.java:76)\r\n\tat ✽.Then I receive a 201 status code(creation.feature:9)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Users server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationSteps.there_is_a_Users_server()"
});
formatter.result({
  "duration": 531300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "create an already existing user",
  "description": "",
  "id": "creation-of-user;create-an-already-existing-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I have an already existing user payload",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I POST it to the /users endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I receive a 403 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "CreationSteps.i_have_an_already_existing_user_payload()"
});
formatter.result({
  "duration": 35800,
  "status": "passed"
});
formatter.match({
  "location": "CreationSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 10477100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "403",
      "offset": 12
    }
  ],
  "location": "CreationSteps.i_receive_a_status_code(int)"
});
formatter.result({
  "duration": 87400,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Authentication of a user",
  "description": "",
  "id": "authentication-of-a-user",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Users server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationSteps.there_is_a_Users_server()"
});
formatter.result({
  "duration": 695400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "login with good credentials",
  "description": "",
  "id": "authentication-of-a-user;login-with-good-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have user credentials payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /login endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 201 status code",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I receive a jwttoken",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_have_a_user_credentials_payload()"
});
formatter.result({
  "duration": 320200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_POST_it_to_the_login_endpoint()"
});
formatter.result({
  "duration": 112578100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "CreationSteps.i_receive_a_status_code(int)"
});
formatter.result({
  "duration": 105900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_receive_a_jwttoken()"
});
formatter.result({
  "duration": 63000,
  "status": "passed"
});
formatter.uri("password.feature");
formatter.feature({
  "line": 1,
  "name": "Change password of a user",
  "description": "",
  "id": "change-password-of-a-user",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Users server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationSteps.there_is_a_Users_server()"
});
formatter.result({
  "duration": 676700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "",
  "description": "",
  "id": "change-password-of-a-user;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a user jwttoken corresponding to email payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /users/test@test.com endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 201 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.i_have_a_user_jwttoken_corresponding_to_email_payload()"
});
formatter.result({
  "duration": 269500,
  "status": "passed"
});
formatter.match({
  "location": "PasswordSteps.i_POST_it_to_the_user_test_test_com_endpoint()"
});
formatter.result({
  "duration": 133183100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "CreationSteps.i_receive_a_status_code(int)"
});
formatter.result({
  "duration": 119000,
  "status": "passed"
});
});