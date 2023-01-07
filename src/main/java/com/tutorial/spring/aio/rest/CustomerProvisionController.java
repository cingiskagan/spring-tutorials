package com.tutorial.spring.aio.rest;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer/provision")
public class CustomerProvisionController {

    @PostMapping("/addCustomer")
    Long addCustomer(@Valid @RequestBody Customer customer){
        System.out.println(customer);
        return 0L;
    }

    @GetMapping("/enable")
    void enable(@RequestParam("customerId") Long id){

    }

    @GetMapping("/suspend")
    void suspend(@RequestParam("customerId") Long id){

    }

    @GetMapping("/disable")
    void disable(@RequestParam("customerId") Long id){

    }
}
