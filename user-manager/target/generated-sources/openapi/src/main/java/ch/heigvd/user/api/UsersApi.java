/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.heigvd.user.api;

import ch.heigvd.user.api.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-19T11:49:49.238+01:00[Europe/Berlin]")

@Validated
@Api(value = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "changePassword", notes = "change user password", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "changed password successfully"),
        @ApiResponse(code = 401, message = "unauthorized to change password"),
        @ApiResponse(code = 406, message = "token error") })
    @RequestMapping(value = "/users/{email}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> changePassword(@ApiParam(value = "",required=true) @PathVariable("email") String email,@ApiParam(value = "header containing a JWT Token" ,required=true) @RequestHeader(value="jwttoken", required=true) String jwttoken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody String newPassword) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getUserByEmail", notes = "get user informations", response = User.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "user informations", response = User.class),
        @ApiResponse(code = 401, message = "unauthorized to check user") })
    @RequestMapping(value = "/users/{email}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<User> getUserByEmail(@ApiParam(value = "",required=true) @PathVariable("email") String email,@ApiParam(value = "header containing a JWT Token" ,required=true) @RequestHeader(value="jwttoken", required=true) String jwttoken) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"last_name\" : \"last_name\", \"admin\" : true, \"first_name\" : \"first_name\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "register", notes = "create a user", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "user created"),
        @ApiResponse(code = 401, message = "request not permitted"),
        @ApiResponse(code = 403, message = "user mail already registered"),
        @ApiResponse(code = 406, message = "token error") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> register(@ApiParam(value = "header containing a JWT Token" ,required=true) @RequestHeader(value="jwttoken", required=true) String jwttoken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
