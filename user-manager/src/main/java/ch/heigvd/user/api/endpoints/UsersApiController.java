package ch.heigvd.user.api.endpoints;

import ch.heigvd.user.api.UsersApi;
import ch.heigvd.user.api.model.User;
import ch.heigvd.user.api.util.JWTHelper;
import ch.heigvd.user.api.util.Utils;
import ch.heigvd.user.entities.UserEntity;
import ch.heigvd.user.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UsersApiController implements UsersApi {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JWTHelper jwtHelper;

    @Autowired
    Utils utils;

    @Autowired
    HttpServletRequest httpServletRequest;

    /*public ResponseEntity<User> getUserByEmail(@ApiParam(value = "",required=true) @PathVariable("email") String email,@ApiParam(value = "header containing a JWT Token" ,required=true) @RequestHeader(value="jwttoken", required=true) String jwttoken) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{  \"password\" : \"password\",  \"last_name\" : \"last_name\",  \"admin\" : true,  \"first_name\" : \"first_name\",  \"email\" : \"email\"}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }*/

    public ResponseEntity<Void> patchPassword(@ApiParam(value = "",required=true) @PathVariable("email") String email,@ApiParam(value = "header containing a JWT Token" ,required=true) @RequestHeader(value="jwttoken", required=true) String jwttoken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        Claims claims = (Claims) httpServletRequest.getAttribute("claims");

        if((claims.get("admin") == true) || email.equals(claims.getSubject())){

            UserEntity usr = userRepository.findByEmail(email);

            if(usr != null){
                usr.setPassword(utils.hashPassword(user.getPassword()));
                userRepository.save(usr);
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    public ResponseEntity<Void> register(@ApiParam(value = "header containing a JWT Token" ,required=true) @RequestHeader(value="jwttoken", required=true) String jwttoken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {

        Claims claims = (Claims) httpServletRequest.getAttribute("claims");

        if(claims.get("admin") == true){
            UserEntity usr = new UserEntity();
            usr.setAdmin(user.getAdmin());
            usr.setEmail(user.getEmail());
            usr.setFirst_name(user.getFirstName());
            usr.setLast_name(user.getLastName());
            usr.setPassword(utils.hashPassword(user.getPassword()));
            userRepository.save(usr);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }


}
