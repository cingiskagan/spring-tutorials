package com.tutorial.spring.aio.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer/query")
public class CustomerQueryController {

    @GetMapping("/getOne")
    Customer getOne(@RequestParam("customerId") Long id){
        return new Customer();
    }

    @GetMapping("/getAll")
    List<Customer> getAll(){
        return new ArrayList<>();
    }

    @GetMapping("/getAllByName")
    List<Customer> getAllByName(@RequestParam("customerName") String name){
        return new ArrayList<>();
    }
}
