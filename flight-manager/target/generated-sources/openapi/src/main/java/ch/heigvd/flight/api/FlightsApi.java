/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.heigvd.flight.api;

import ch.heigvd.flight.api.model.Flight;
import ch.heigvd.flight.api.model.Flights;
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
@Api(value = "flights", description = "the flights API")
public interface FlightsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "addFlight", notes = "add a new flight", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "flight added"),
        @ApiResponse(code = 400, message = "error in adding flight") })
    @RequestMapping(value = "/flights",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> addFlight(@ApiParam(value = "a new flight to the flight manager" ,required=true )  @Valid @RequestBody Flight flight) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteFlight", notes = "delete a flight by id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "flight deleted"),
        @ApiResponse(code = 400, message = "bad request"),
        @ApiResponse(code = 404, message = "not found") })
    @RequestMapping(value = "/flights/{flight_id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteFlight(@ApiParam(value = "",required=true) @PathVariable("flight_id") Integer flightId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getFlight", notes = "get flight by id", response = Flights.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "flight sent", response = Flights.class),
        @ApiResponse(code = 400, message = "bad request"),
        @ApiResponse(code = 404, message = "not found") })
    @RequestMapping(value = "/flights/{flight_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Flights> getFlight(@ApiParam(value = "",required=true) @PathVariable("flight_id") Integer flightId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"arrival_time\" : 1, \"start_point\" : \"start_point\", \"end_point\" : \"end_point\", \"price\" : 5, \"name\" : \"name\", \"departure_time\" : 6, \"flight_id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getFlights", notes = "get the list of flightd", response = Flights.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "list of flights sent", response = Flights.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "error in retrieve list of flights") })
    @RequestMapping(value = "/flights",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Flights>> getFlights(@ApiParam(value = "", defaultValue = "0") @Valid @RequestParam(value = "page", required = false, defaultValue="0") Integer page,@ApiParam(value = "", defaultValue = "10") @Valid @RequestParam(value = "size", required = false, defaultValue="10") Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"arrival_time\" : 1, \"start_point\" : \"start_point\", \"end_point\" : \"end_point\", \"price\" : 5, \"name\" : \"name\", \"departure_time\" : 6, \"flight_id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
