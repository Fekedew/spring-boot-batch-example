package com.example.spring.batch.config;

import com.example.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        //You can do any filter or transformation here
        //it executes before inserting to the database
        return customer;
    }
}
