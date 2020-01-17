package ch.heigvd.flight.api.endpoints;

//import io.swagger.model.Customer;
//import io.swagger.model.Customers;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-16T15:39:21.212Z")

@Controller
public class CustomersApiController implements CustomersApi {

    @Autowired
    CustomersRepository customersRepository;

    @Autowired
    HttpServletRequest httpServletRequest;

    public ResponseEntity<Void> addCustomer(@ApiParam(value = "a new customer to the flight manager" ,required=true )  @Valid @RequestBody Customer customer) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCustomer(@ApiParam(value = "",required=true) @PathVariable("customer_id") Integer customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomer(@ApiParam(value = "",required=true) @PathVariable("customer_id") Integer customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{  \"firstname\" : \"firstname\",  \"customer_pseudo\" : \"customer_pseudo\",  \"customer_pw\" : \"customer_pw\",  \"age\" : 0,  \"lastname\" : \"lastname\"}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Customers>> getCustomers() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Customers>>(objectMapper.readValue("[ {  \"firstname\" : \"firstname\",  \"customer_pseudo\" : \"customer_pseudo\",  \"customer_pw\" : \"customer_pw\",  \"customer_id\" : 0,  \"age\" : 6,  \"lastname\" : \"lastname\"}, {  \"firstname\" : \"firstname\",  \"customer_pseudo\" : \"customer_pseudo\",  \"customer_pw\" : \"customer_pw\",  \"customer_id\" : 0,  \"age\" : 6,  \"lastname\" : \"lastname\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Customers>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Customers>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
