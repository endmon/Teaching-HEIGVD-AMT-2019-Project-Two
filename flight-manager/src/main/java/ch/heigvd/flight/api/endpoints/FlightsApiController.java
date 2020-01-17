package ch.heigvd.flight.api.endpoints;

//import io.swagger.model.Flight;
//import io.swagger.model.Flights;
import ch.heigvd.flight.api.FlightsApi;
import ch.heigvd.flight.api.model.Flight;
import ch.heigvd.flight.api.model.Flights;
import ch.heigvd.flight.repositories.FlightsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.sun.xml.internal.ws.resources.ModelerMessages;
import io.swagger.annotations.*;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.*;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-16T15:39:21.212Z")

@Controller
public class FlightsApiController implements FlightsApi {

    @Autowired
    FlightsRepository flightsRepository;

    @Autowired
    HttpServletRequest httpServletRequest;

    public ResponseEntity<Void> addFlight(@ApiParam(value = "a new flight to the flight manager" ,required=true )  @Valid @RequestBody Flight flight) {

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteFlight(@ApiParam(value = "",required=true) @PathVariable("flight_id") Integer flightId) {

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Flight> getFlight(@ApiParam(value = "",required=true) @PathVariable("flight_id") Integer flightId) {

        return new ResponseEntity<Flight>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Flights>> getFlights() {


        return new ResponseEntity<List<Flights>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
