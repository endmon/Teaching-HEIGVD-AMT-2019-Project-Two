# DefaultApi

All URIs are relative to *http://localhost:8080/api-user-manager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](DefaultApi.md#changePassword) | **PUT** /users/{email} | 
[**getUserByEmail**](DefaultApi.md#getUserByEmail) | **GET** /users/{email} | 
[**login**](DefaultApi.md#login) | **POST** /login | 
[**register**](DefaultApi.md#register) | **POST** /users | 


<a name="changePassword"></a>
# **changePassword**
> changePassword(email, jwttoken, newPassword)



change user password

### Example
```java
// Import classes:
import ch.heigvd.users.ApiClient;
import ch.heigvd.users.ApiException;
import ch.heigvd.users.Configuration;
import ch.heigvd.users.models.*;
import ch.heigvd.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-user-manager");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | 
    String jwttoken = "jwttoken_example"; // String | header containing a JWT Token
    String newPassword = "newPassword_example"; // String | 
    try {
      apiInstance.changePassword(email, jwttoken, newPassword);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#changePassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |
 **jwttoken** | **String**| header containing a JWT Token |
 **newPassword** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | changed password successfully |  -  |
**401** | unauthorized to change password |  -  |
**406** | token error |  -  |

<a name="getUserByEmail"></a>
# **getUserByEmail**
> User getUserByEmail(email, jwttoken)



get user informations

### Example
```java
// Import classes:
import ch.heigvd.users.ApiClient;
import ch.heigvd.users.ApiException;
import ch.heigvd.users.Configuration;
import ch.heigvd.users.models.*;
import ch.heigvd.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-user-manager");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | 
    String jwttoken = "jwttoken_example"; // String | header containing a JWT Token
    try {
      User result = apiInstance.getUserByEmail(email, jwttoken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getUserByEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |
 **jwttoken** | **String**| header containing a JWT Token |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | user informations |  -  |
**401** | unauthorized to check user |  -  |

<a name="login"></a>
# **login**
> String login(userCredentials)



log with JWT token

### Example
```java
// Import classes:
import ch.heigvd.users.ApiClient;
import ch.heigvd.users.ApiException;
import ch.heigvd.users.Configuration;
import ch.heigvd.users.models.*;
import ch.heigvd.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-user-manager");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UserCredentials userCredentials = new UserCredentials(); // UserCredentials | 
    try {
      String result = apiInstance.login(userCredentials);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#login");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCredentials** | [**UserCredentials**](UserCredentials.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | logged in |  -  |
**401** | Wrong user credentials |  -  |

<a name="register"></a>
# **register**
> register(jwttoken, user)



create a user

### Example
```java
// Import classes:
import ch.heigvd.users.ApiClient;
import ch.heigvd.users.ApiException;
import ch.heigvd.users.Configuration;
import ch.heigvd.users.models.*;
import ch.heigvd.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-user-manager");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String jwttoken = "jwttoken_example"; // String | header containing a JWT Token
    User user = new User(); // User | 
    try {
      apiInstance.register(jwttoken, user);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#register");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jwttoken** | **String**| header containing a JWT Token |
 **user** | [**User**](User.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | user created |  -  |
**401** | request not permitted |  -  |
**403** | user mail already registered |  -  |
**406** | token error |  -  |

