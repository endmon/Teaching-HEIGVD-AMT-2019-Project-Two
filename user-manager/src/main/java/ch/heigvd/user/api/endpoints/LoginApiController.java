package ch.heigvd.user.api.endpoints;

import ch.heigvd.user.api.LoginApi;
import ch.heigvd.user.api.model.JWTToken;
import ch.heigvd.user.api.model.UserCredentials;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-13T15:42:39.441Z")

@Controller
public class LoginApiController implements LoginApi {

    private static final Logger log = LoggerFactory.getLogger(LoginApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LoginApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JWTToken> login(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserCredentials userCredentials) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JWTToken>(objectMapper.readValue("{  \"jwttoken\" : \"jwttoken\"}", JWTToken.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JWTToken>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JWTToken>(HttpStatus.NOT_IMPLEMENTED);
    }

}
