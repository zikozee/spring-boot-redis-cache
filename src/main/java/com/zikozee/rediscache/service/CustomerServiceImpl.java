package com.zikozee.rediscache.service;

import com.zikozee.rediscache.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CacheConfig(cacheNames = {"Customer"})
public class CustomerServiceImpl implements CustomerService{

    @Override
    @Cacheable(key = "#id", unless = "#result.id < 106") //it will not cache unless id of customer >= 106
    public Customer getCustomerById(int id) {
        log.info("Getting customer information for {} ", id);
        return new Customer(id, "User"+id, "zikozee@gmail.com");//PERFORM DATABASE ACTION HERE
    }

    @CacheEvict(key = "#id", beforeInvocation = true, condition = "#id > 109") //deletes from cache only when customerId > 109
    public String deleteCustomerById(int id) {
        log.info("deleted customer with id: {} ", id);
       return "deleted customer with id: {} " + id;//PERFORM DATABASE ACTION HERE
    }


}
