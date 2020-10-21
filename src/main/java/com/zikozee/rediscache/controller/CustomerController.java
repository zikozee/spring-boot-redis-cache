package com.zikozee.rediscache.controller;

import com.zikozee.rediscache.entity.Customer;
import com.zikozee.rediscache.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {


    private final CustomerService customerService;

    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("customer/{id}")
    public String deleteCustomer(@PathVariable int id){
        return customerService.deleteCustomerById(id);
    }

}
