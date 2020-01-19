package ch.heigvd.users.api.spec.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ch.heigvd.users.ApiException;
import ch.heigvd.users.ApiResponse;
import ch.heigvd.users.api.DefaultApi;
import ch.heigvd.users.api.dto.UserCredentials;
import ch.heigvd.users.api.spec.helpers.Environment;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Olivier Liechti on 27/07/17.
 */
public class LoginSteps {

    private Environment environment;
    private DefaultApi api;


    public LoginSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^I have user credentials payload$")
    public void i_have_a_user_credentials_payload() throws Throwable {
        UserCredentials userCredentials = new ch.heigvd.users.api.dto.UserCredentials();
        userCredentials.setEmail("root@root.com");
        userCredentials.setPassword("root");
        environment.setUserCredentials(userCredentials);
    }


    @When("^I POST it to the /login endpoint$")
    public void i_POST_it_to_the_login_endpoint() throws Throwable {
        try {
            //the token is an admin token
            environment.setLastApiResponse(api.loginWithHttpInfo(environment.getUserCredentials()));
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


    @Then("^I receive a jwttoken$")
    public void i_receive_a_jwttoken() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        environment.setJwttoken((String) environment.getLastApiResponse().getData());
        assertNotNull(environment.getJwttoken());
    }

}
