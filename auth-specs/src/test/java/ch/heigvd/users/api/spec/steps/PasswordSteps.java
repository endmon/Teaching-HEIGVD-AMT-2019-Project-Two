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
public class PasswordSteps {

    private Environment environment;
    private DefaultApi api;


    public PasswordSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^I have a user jwttoken corresponding to email payload")
    public void i_have_a_user_jwttoken_corresponding_to_email_payload() throws Throwable {
        environment.setJwttoken("eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhcGktdXNlciIsInN1YiI6InRlc3RAdGVzdC5jb20iLCJhZG1pbiI6ZmFsc2V9.C0V0qsQ9EXQ6Vmb84cSrdtTB-mz_FQQwbRxo6LpqWaY");
    }


    @When("^I POST it to the /users/test@test\\.com endpoint$")
    public void i_POST_it_to_the_user_test_test_com_endpoint() throws Throwable {
        try {
            //the token is an admin token
            environment.setLastApiResponse(api.changePasswordWithHttpInfo("test@test.com", environment.getJwttoken(), "test"));
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

}
