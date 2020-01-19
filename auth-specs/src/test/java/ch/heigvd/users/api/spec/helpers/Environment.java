package ch.heigvd.users.api.spec.helpers;

import ch.heigvd.users.ApiException;
import ch.heigvd.users.ApiResponse;
import ch.heigvd.users.api.DefaultApi;
import ch.heigvd.users.api.dto.User;
import ch.heigvd.users.api.dto.UserCredentials;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Olivier Liechti on 24/06/17.
 */
public class Environment {

    private DefaultApi api = new DefaultApi();

    private User user;

    private UserCredentials userCredentials;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

    private String jwttoken;

    public String getJwttoken() {
        return jwttoken;
    }

    public void setJwttoken(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public User getUser() {
        return user;
    }

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public ApiResponse getLastApiResponse() {
        return lastApiResponse;
    }

    public ApiException getLastApiException() {
        return lastApiException;
    }

    public boolean isLastApiCallThrewException() {
        return lastApiCallThrewException;
    }

    public int getLastStatusCode() {
        return lastStatusCode;
    }


    public void setApi(DefaultApi api) {
        this.api = api;
    }

    public void setLastApiResponse(ApiResponse lastApiResponse) {
        this.lastApiResponse = lastApiResponse;
    }

    public void setLastApiException(ApiException lastApiException) {
        this.lastApiException = lastApiException;
    }

    public void setLastApiCallThrewException(boolean lastApiCallThrewException) {
        this.lastApiCallThrewException = lastApiCallThrewException;
    }

    public void setLastStatusCode(int lastStatusCode) {
        this.lastStatusCode = lastStatusCode;
    }


    public Environment() throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("environment.properties"));
        String url = properties.getProperty("ch.heigvd.users.server.url");
        api.getApiClient().setBasePath(url);

    }

    public DefaultApi getApi() {
        return api;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }
}
