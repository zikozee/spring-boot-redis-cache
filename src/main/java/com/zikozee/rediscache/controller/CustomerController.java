package com.zikozee.rediscache.controller;

import com.zikozee.rediscache.entity.Customer;
import com.zikozee.rediscache.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {


    private final CustomerService customerService;

    //todo info  check impl for caching
    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @PutMapping("customer")
    @CachePut(key = "#id", value = "customers")
    public Customer updateCustomer(@RequestParam(value = "id") int id, Customer customer){
        Object x = (Integer)id;
        log.info("ID- TYPE {}", x instanceof Integer);
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("customer/{id}")
    public String deleteCustomer(@PathVariable int id){
        return customerService.deleteCustomerById(id);
    }

}
