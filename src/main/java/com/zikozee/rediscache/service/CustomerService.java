package com.zikozee.rediscache.service;

import com.zikozee.rediscache.entity.Customer;

public interface CustomerService {
    Customer getCustomerById(int id);
    String deleteCustomerById(int id);
    Customer updateCustomer(int id, Customer customer);
}
