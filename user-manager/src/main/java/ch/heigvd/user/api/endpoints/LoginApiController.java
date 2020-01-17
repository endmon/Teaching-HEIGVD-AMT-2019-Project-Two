package ch.heigvd.user.api.endpoints;

import ch.heigvd.user.api.LoginApi;
import ch.heigvd.user.api.model.UserCredentials;
import ch.heigvd.user.api.util.JWTHelper;
import ch.heigvd.user.api.util.Utils;
import ch.heigvd.user.entities.UserEntity;
import ch.heigvd.user.repositories.UserRepository;

import io.jsonwebtoken.Claims;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-13T15:42:39.441Z")

@Controller
public class LoginApiController implements LoginApi {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JWTHelper jwtHelper;

    Utils utils = new Utils();

    public ResponseEntity<String> login(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserCredentials userCredentials) {

        UserEntity userEntity = userRepository.findByEmail(userCredentials.getEmail());

        if(userEntity != null){
            if(utils.checkPassword(userCredentials.getPassword(), userEntity.getPassword())){
                String jwtToken = jwtHelper.createJWT(userEntity.getEmail(),  userEntity.isAdmin());
                System.out.println("email = " + userEntity.getEmail() + " admin = " + userEntity.isAdmin());
                Claims claims = jwtHelper.decodeJWT(jwtToken);
                System.out.println("Subject = " + claims.get("email"));
                System.out.println("Admin = " + claims.get("admin"));
                System.out.println("token: " + jwtToken);
                return ResponseEntity.ok(jwtToken);
            }
        }

        return ResponseEntity.status(401).build();
    }

}

