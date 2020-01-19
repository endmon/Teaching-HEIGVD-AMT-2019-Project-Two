package ch.heigvd.flight.api.endpoints;

import ch.heigvd.flight.api.FlightsApi;
import ch.heigvd.flight.api.model.Flight;
import ch.heigvd.flight.api.model.Flights;
import ch.heigvd.flight.repositories.FlightsRepository;
import ch.heigvd.flight.entities.FlightsEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-16T15:39:21.212Z")

@Controller
public class FlightsApiController implements FlightsApi {

    @Autowired
    FlightsRepository flightsRepository;

    @Autowired
    HttpServletRequest httpServletRequest;

    public ResponseEntity<Void> addFlight(@ApiParam(value = "a new flight to the flight manager" ,required=true )  @Valid @RequestBody Flight flight) {

        FlightsEntity NewFlight = new FlightsEntity();
        NewFlight.setName(flight.getName());
        NewFlight.setDeparture_time(flight.getDepartureTime());
        NewFlight.setArrival_time(flight.getArrivalTime());
        NewFlight.setStart_point(flight.getStartPoint());
        NewFlight.setEnd_point(flight.getEndPoint());
        NewFlight.setPrice(flight.getPrice());
        flightsRepository.save(NewFlight);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<Void> deleteFlight(@ApiParam(value = "",required=true) @PathVariable("flight_id") Integer flightId) {

        flightsRepository.deleteById(flightId);
        return ResponseEntity.status(HttpStatus.valueOf(201)).build();
    }

    public ResponseEntity<Flights> getFlight(@ApiParam(value = "",required=true) @PathVariable("flight_id") Integer flightId) {

        Flights flights = new Flights();
        FlightsEntity flightsEntity = flightsRepository.findById(flightId);
        flights = FlightsEntityToFlights(flightsEntity);

        return ResponseEntity.ok(flights);

    }

    public ResponseEntity<List<Flights>> getFlights() {

        List<FlightsEntity> flightsList = flightsRepository.findAll();

        List<Flights> flights = new ArrayList<Flights>();
        for(int i = 0; i < flightsList.size(); i++)
        {
            flights.add(i,FlightsEntityToFlights(flightsList.get(i)));
        }

        return ResponseEntity.ok(flights);
    }

    private Flights FlightsEntityToFlights(FlightsEntity flightsEntity)
    {
        Flights flights = new Flights();
        flights.setFlightId(flightsEntity.getFlight_id());
        flights.setName(flightsEntity.getName());
        flights.setDepartureTime(flightsEntity.getDeparture_time());
        flights.setArrivalTime(flightsEntity.getArrival_time());
        flights.setStartPoint(flightsEntity.getStart_point());
        flights.setEndPoint(flightsEntity.getEnd_point());
        flights.setPrice(flightsEntity.getPrice());

        return flights;
    }

}
