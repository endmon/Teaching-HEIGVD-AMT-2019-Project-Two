/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.heigvd.flight.api;

import ch.heigvd.flight.api.model.Customer;
import ch.heigvd.flight.api.model.Customers;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-19T21:23:44.450+01:00[Europe/Berlin]")

@Validated
@Api(value = "customers", description = "the customers API")
public interface CustomersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "addCustomer", notes = "add a new customer", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "customer added"),
        @ApiResponse(code = 400, message = "error in adding customer") })
    @RequestMapping(value = "/customers",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> addCustomer(@ApiParam(value = "a new customer to the flight manager" ,required=true )  @Valid @RequestBody Customer customer) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteCustomer", notes = "delete a customer by id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "customer deleted"),
        @ApiResponse(code = 400, message = "bad request"),
        @ApiResponse(code = 404, message = "not found") })
    @RequestMapping(value = "/customers/{customer_id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteCustomer(@ApiParam(value = "",required=true) @PathVariable("customer_id") Integer customerId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getCustomer", notes = "get customer by id", response = Customers.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "customer sent", response = Customers.class),
        @ApiResponse(code = 400, message = "bad request"),
        @ApiResponse(code = 404, message = "not found") })
    @RequestMapping(value = "/customers/{customer_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Customers> getCustomer(@ApiParam(value = "",required=true) @PathVariable("customer_id") Integer customerId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstname\" : \"firstname\", \"customer_pseudo\" : \"customer_pseudo\", \"customer_pw\" : \"customer_pw\", \"customer_id\" : 0, \"age\" : 6, \"lastname\" : \"lastname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getCustomers", notes = "get the list of customers", response = Customers.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "list of customers sent", response = Customers.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "error in retrieve list of customers") })
    @RequestMapping(value = "/customers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Customers>> getCustomers(@ApiParam(value = "", defaultValue = "0") @Valid @RequestParam(value = "page", required = false, defaultValue="0") Integer page,@ApiParam(value = "", defaultValue = "10") @Valid @RequestParam(value = "size", required = false, defaultValue="10") Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstname\" : \"firstname\", \"customer_pseudo\" : \"customer_pseudo\", \"customer_pw\" : \"customer_pw\", \"customer_id\" : 0, \"age\" : 6, \"lastname\" : \"lastname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
