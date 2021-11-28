package com.odybank.customers.controllers;


import com.odybank.customers.config.MailProperties;
import com.odybank.customers.domain.Customer;
import com.odybank.customers.dto.CustomerDto;
import com.odybank.customers.dto.CustomerWebDto;
import com.odybank.customers.dto.CustomersWebDto;
import com.odybank.customers.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomersApi {

    private final MailProperties mailProperties;
    private final CustomerService customerService;

    //curl http://localhost/customers
    @GetMapping
    public HttpEntity<CustomersWebDto> getAll(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


    //curl http://localhost/customers/1234
    @GetMapping("/{id}")
    public HttpEntity<CustomerWebDto> getById(@PathVariable("id") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    //plural/singular/plural/singular/plural/singular

    //curl http://localhost/customers/1234/address
    //curl http://localhost/customers/address

    //transfer 19311
    //POST http://localhost/transactions --> abc124
    //PUT http://localhost/transactions/abc124 --> OTP
    //DELETE http://localhost/transactions/abc124
    //PUT http://localhost/users/1233/passwords/login {password}


    /*

      public HttpEntity<String> demo(){

        var customer = Customer.builder()
                    .nombre("DEmo")
                    .apellidos("DEmo")
                    .id("22")
                    .build();

        var customerDto = CustomerDto.builder()
                .customer(customer)
                .build();

        return ResponseEntity.ok(mailProperties.getServer() + "-" + customerService.getCuenta(1));

    }


    CRUD:

    Create: POST

    Read: GET
        /all
        /{id}

    Update: PUT
        /{id}

    Delete: DELETE
        /{id}



    {
        customers:[
        {id,nombre,apellidos},
        {id,nombre,apellidos},
        {id,nombre,apellidos}
        ]
    }

     */
}
