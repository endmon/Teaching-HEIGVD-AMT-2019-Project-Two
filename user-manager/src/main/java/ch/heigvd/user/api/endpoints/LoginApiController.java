package ch.heigvd.user.api.endpoints;

import org.springframework.stereotype.Controller;

import main.java.ch.heigvd.user.api.LoginApi;
import main.java.ch.heigvd.user.api.model.User;
//import ch.heigvd.user.model.User;
import ch.heigvd.user.repositories.UserRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")

@Controller
public class LoginApiController implements LoginApi{

    @Autowired
    UserRepository userRepository;
}
