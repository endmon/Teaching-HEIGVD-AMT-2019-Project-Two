package ch.heigvd.flight.api.endpoints;

import ch.heigvd.flight.api.CustomersApi;
import ch.heigvd.flight.api.model.Customers;
import ch.heigvd.flight.api.model.Customer;
import ch.heigvd.flight.entities.CustomersEntity;
import ch.heigvd.flight.repositories.CustomersRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

        CustomersEntity NewCustomer = new CustomersEntity();
        NewCustomer.setCustomer_pseudo(customer.getCustomerPseudo());
        NewCustomer.setFirstname(customer.getFirstname());
        NewCustomer.setLastname(customer.getLastname());
        NewCustomer.setAge(customer.getAge());
        NewCustomer.setCustomer_pw(customer.getCustomerPw());
        customersRepository.save(NewCustomer);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<Void> deleteCustomer(@ApiParam(value = "",required=true) @PathVariable("customer_id") Integer customerId) {
        customersRepository.deleteById(customerId);
        return ResponseEntity.status(HttpStatus.valueOf(201)).build();
    }

    public ResponseEntity<Customers> getCustomer(@ApiParam(value = "",required=true) @PathVariable("customer_id") Integer customerId) {
        Customers customer = new Customers();
        CustomersEntity customersEntity = customersRepository.findById(customerId);
        customer = CustomersEntityToCustomers(customersEntity);

        return ResponseEntity.ok(customer);
    }

    public ResponseEntity<List<Customers>> getCustomers() {
        Page<CustomersEntity> customersList = customersRepository.findAll();
        List<Customers> customers = customersList.map(e -> CustomersEntityToCustomers(e)).toList();

        return ResponseEntity.ok(customers);
    }

    private Customers CustomersEntityToCustomers(CustomersEntity customersEntity)
    {
        Customers customers = new Customers();
        //customers.setCustomerId(customersEntity.getCustomer_id());
        customers.setCustomerPseudo(customersEntity.getCustomer_pseudo());
        customers.setFirstname(customersEntity.getFirstname());
        customers.setLastname(customersEntity.getLastname());
        customers.setAge(customersEntity.getAge());
        customers.setCustomerPw(customersEntity.getCustomer_pw());

        return customers;
    }

}
