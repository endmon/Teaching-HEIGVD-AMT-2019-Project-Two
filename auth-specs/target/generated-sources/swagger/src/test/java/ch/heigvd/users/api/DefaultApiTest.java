/*
 * User Api
 * An API to manage users
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ch.heigvd.users.api;

import ch.heigvd.users.ApiException;
import ch.heigvd.users.api.dto.User;
import ch.heigvd.users.api.dto.UserCredentials;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * change user password
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changePasswordTest() throws ApiException {
        String email = null;
        String jwttoken = null;
        String newPassword = null;
        api.changePassword(email, jwttoken, newPassword);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get user informations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByEmailTest() throws ApiException {
        String email = null;
        String jwttoken = null;
        User response = api.getUserByEmail(email, jwttoken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * log with JWT token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        UserCredentials userCredentials = null;
        String response = api.login(userCredentials);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerTest() throws ApiException {
        String jwttoken = null;
        User user = null;
        api.register(jwttoken, user);

        // TODO: test validations
    }
    
}
