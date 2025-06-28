package com.example.springcustomermanagementaspect.service;

import com.example.springcustomermanagementaspect.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll() throws Exception;

    Customer findOne(Long id) throws Exception;
}
