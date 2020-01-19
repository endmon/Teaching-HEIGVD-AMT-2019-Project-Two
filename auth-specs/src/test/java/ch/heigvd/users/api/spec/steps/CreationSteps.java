package ch.heigvd.users.api.spec.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ch.heigvd.users.ApiException;
import ch.heigvd.users.ApiResponse;
import ch.heigvd.users.api.DefaultApi;
import ch.heigvd.users.api.dto.User;
import ch.heigvd.users.api.spec.helpers.Environment;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Olivier Liechti on 27/07/17.
 */
public class CreationSteps {

    private Environment environment;
    private DefaultApi api;

    public CreationSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a Users server$")
    public void there_is_a_Users_server() throws Throwable {
        assertNotNull(api);
    }

    @Given("^I have a user payload$")
    public void i_have_a_user_payload() throws Throwable {
        User user = new ch.heigvd.users.api.dto.User();
        user.setEmail("cucumber@cucumber.com");
        user.setFirstName("cucumber");
        user.setLastName("cucumber");
        user.setPassword("cucumber");
        user.admin(false);
        environment.setUser(user);
    }

    @Given("^I have an already existing user payload$")
    public void i_have_an_already_existing_user_payload() throws Throwable{
        User user = new ch.heigvd.users.api.dto.User();
        user.setEmail("root@root.com");
        user.setFirstName("root");
        user.setLastName("root");
        user.setPassword("root");
        user.admin(true);
        environment.setUser(user);
    }


    @When("^I POST it to the /users endpoint$")
    public void i_POST_it_to_the_users_endpoint() throws Throwable {
        try {
            //the token is an admin token
            environment.setLastApiResponse(api.registerWithHttpInfo("eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhcGktdXNlciIsInN1YiI6InJvb3RAcm9vdC5jb20iLCJhZG1pbiI6dHJ1ZX0.c8sEer9cCK-4eorpuPXNGB095uUf6EJA-G5cF7R3rQ4",environment.getUser()));
            environment.setLastApiCallThrewException(false);
            environment.setLastApiException(null);
            environment.setLastStatusCode(environment.getLastApiResponse().getStatusCode());
        } catch (ApiException e) {
            environment.setLastApiCallThrewException(true);
            environment.setLastApiResponse(null);
            environment.setLastApiException(e);
            environment.setLastStatusCode(environment.getLastApiException().getCode());
        }

    }

    @When("^I POST it to the /users endpoint whithout admin rights$")
    public void i_POST_it_to_the_users_endpoint_without_admin_rights() throws Throwable {
        try {
            //the token is a non admin token
            environment.setLastApiResponse(api.registerWithHttpInfo("eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhcGktdXNlciIsInN1YiI6InRlc3RAdGVzdC5jb20iLCJhZG1pbiI6ZmFsc2V9.C0V0qsQ9EXQ6Vmb84cSrdtTB-mz_FQQwbRxo6LpqWaY",environment.getUser()));
            environment.setLastApiCallThrewException(false);
            environment.setLastApiException(null);
            environment.setLastStatusCode(environment.getLastApiResponse().getStatusCode());
        } catch (ApiException e) {
            environment.setLastApiCallThrewException(true);
            environment.setLastApiResponse(null);
            environment.setLastApiException(e);
            environment.setLastStatusCode(environment.getLastApiException().getCode());
        }

    }



    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(arg1, environment.getLastStatusCode());
    }

}
