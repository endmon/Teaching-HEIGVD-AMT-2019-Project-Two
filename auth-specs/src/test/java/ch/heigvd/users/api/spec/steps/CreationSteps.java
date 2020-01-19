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

    User user;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

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
        user = new ch.heigvd.users.api.dto.User();
        user.setEmail("cucumber@cucumber.com");
        user.setFirstName("cucumber");
        user.setLastName("cucumber");
        user.setPassword("cucumber");
        user.admin(false);
        environment.setUser(user);
    }

    @When("^I POST it to the /users endpoint$")
    public void i_POST_it_to_the_users_endpoint() throws Throwable {
        try {
            //the token is an admin token
            lastApiResponse = api.registerWithHttpInfo("eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhcGktdXNlciIsInN1YiI6InJvb3RAcm9vdC5jb20iLCJhZG1pbiI6dHJ1ZX0.c8sEer9cCK-4eorpuPXNGB095uUf6EJA-G5cF7R3rQ4",user);
            lastApiCallThrewException = false;
            lastApiException = null;
            lastStatusCode = lastApiResponse.getStatusCode();
        } catch (ApiException e) {
            lastApiCallThrewException = true;
            lastApiResponse = null;
            lastApiException = e;
            lastStatusCode = lastApiException.getCode();
        }

    }

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(201, lastStatusCode);
    }

}
