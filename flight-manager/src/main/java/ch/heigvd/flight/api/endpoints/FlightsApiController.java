package ch.heigvd.flight.api.endpoints;

//import io.swagger.model.Flight;
//import io.swagger.model.Flights;
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
public class FlightsApiController implements FlightsApi {

    @Autowired
    FlightsRepository flightsRepository;

    @Autowired
    HttpServletRequest httpServletRequest;

    public ResponseEntity<Void> addFlight(@ApiParam(value = "a new flight to the flight manager" ,required=true )  @Valid @RequestBody Flight flight) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteFlight(@ApiParam(value = "",required=true) @PathVariable("flight_id") Integer flightId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Flight> getFlight(@ApiParam(value = "",required=true) @PathVariable("flight_id") Integer flightId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Flight>(objectMapper.readValue("{  \"arrival_time\" : 6,  \"start_point\" : \"start_point\",  \"end_point\" : \"end_point\",  \"price\" : 1,  \"name\" : \"name\",  \"departure_time\" : 0}", Flight.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Flight>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Flight>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Flights>> getFlights() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Flights>>(objectMapper.readValue("[ {  \"arrival_time\" : 1,  \"start_point\" : \"start_point\",  \"end_point\" : \"end_point\",  \"price\" : 5,  \"name\" : \"name\",  \"departure_time\" : 6,  \"flight_id\" : 0}, {  \"arrival_time\" : 1,  \"start_point\" : \"start_point\",  \"end_point\" : \"end_point\",  \"price\" : 5,  \"name\" : \"name\",  \"departure_time\" : 6,  \"flight_id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Flights>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Flights>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
