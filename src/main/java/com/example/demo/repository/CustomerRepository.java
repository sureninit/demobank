package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.CustomerModel;

@Component
public interface CustomerRepository extends MongoRepository<CustomerModel,Long>{

}
