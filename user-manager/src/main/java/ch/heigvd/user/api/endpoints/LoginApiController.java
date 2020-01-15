package ch.heigvd.user.api.endpoints;

import ch.heigvd.user.api.LoginApi;
import ch.heigvd.user.api.model.JWTToken;
import ch.heigvd.user.api.model.UserCredentials;
import ch.heigvd.user.api.util.JWTHelper;
import ch.heigvd.user.api.util.Utils;
import ch.heigvd.user.entities.UserEntity;
import ch.heigvd.user.repositories.UserRepository;

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

    JWTHelper jwtHelper = new JWTHelper();

    Utils utils = new Utils();

    public ResponseEntity<JWTToken> login(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserCredentials userCredentials) {

        UserEntity userEntity = userRepository.findByEmail(userCredentials.getEmail());

        if(userEntity != null){
            if(utils.checkPassword(userCredentials.getPassword(), userEntity.getPassword())){
                JWTToken jwtToken = jwtHelper.createJWT(userEntity.getEmail(), 10000000, userEntity.isAdmin());
                return ResponseEntity.ok(jwtToken);
            }
        }

        return ResponseEntity.status(401).build();
    }

}

