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
  "duration": 2230492300,
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
  "duration": 271000,
  "status": "passed"
});
formatter.match({
  "location": "CreationSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 1942506000,
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
  "duration": 3477800,
  "status": "passed"
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
  "duration": 431200,
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
  "duration": 60800,
  "status": "passed"
});
formatter.match({
  "location": "CreationSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 16979400,
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
  "duration": 87200,
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
  "duration": 615300,
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
  "duration": 226800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_POST_it_to_the_login_endpoint()"
});
formatter.result({
  "duration": 162323300,
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
  "duration": 108100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_receive_a_jwttoken()"
});
formatter.result({
  "duration": 74900,
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
  "duration": 903800,
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
  "duration": 286400,
  "status": "passed"
});
formatter.match({
  "location": "PasswordSteps.i_POST_it_to_the_user_test_test_com_endpoint()"
});
formatter.result({
  "duration": 266574800,
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
  "duration": 1412400,
  "status": "passed"
});
});