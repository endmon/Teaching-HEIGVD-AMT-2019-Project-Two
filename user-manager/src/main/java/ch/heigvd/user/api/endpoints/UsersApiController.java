package ch.heigvd.user.api.endpoints;

import ch.heigvd.user.api.UsersApi;
import ch.heigvd.user.api.model.User;
import ch.heigvd.user.api.util.JWTHelper;
import ch.heigvd.user.api.util.Utils;
import ch.heigvd.user.entities.UserEntity;
import ch.heigvd.user.repositories.UserRepository;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-13T15:42:39.441Z")

@Controller
public class UsersApiController implements UsersApi {

    Utils utils = new Utils();

    @Autowired
    UserRepository userRepository;

    JWTHelper jwtHelper = new JWTHelper();

    @Autowired
    HttpServletRequest httpServletRequest;

    public ResponseEntity<User> getUserByEmail(@ApiParam(value = "",required=true) @PathVariable("email") String email,@ApiParam(value = "header containing a JWT Token" ,required=true) @RequestHeader(value="jwttoken", required=true) String jwttoken) {
        Claims claims = (Claims) httpServletRequest.getAttribute("claims");
        if (((Boolean) claims.get("admin") == true) || email.equals(claims.getSubject())) {
            User user = new User();
            UserEntity userEntity = userRepository.findByEmail(email);
            user.setEmail(userEntity.getEmail());
            user.setPassword(userEntity.getPassword());
            user.setLastName(userEntity.getLast_name());
            user.setFirstName(userEntity.getFirst_name());
            user.setAdmin(userEntity.isAdmin());
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    public ResponseEntity<Void> patchPassword(@ApiParam(value = "",required=true) @PathVariable("email") String email,@ApiParam(value = "header containing a JWT Token" ,required=true) @RequestHeader(value="jwttoken", required=true) String jwttoken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        Claims claims = (Claims) httpServletRequest.getAttribute("claims");

        if(((Boolean) claims.get("admin") == true) || email.equals(claims.getSubject())){

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

        if( (Boolean) claims.get("admin") == true){
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
