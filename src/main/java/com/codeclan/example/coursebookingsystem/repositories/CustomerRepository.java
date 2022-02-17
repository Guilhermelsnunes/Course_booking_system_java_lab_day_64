package com.codeclan.example.coursebookingsystem.repositories;

import com.codeclan.example.coursebookingsystem.models.Course;
import com.codeclan.example.coursebookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Long> {


//    List<Customer> findCustomers();

    Customer findDistinctCustomerById(Long id);

    List<Customer> findCustomersByBookingsCourseName(String name);


}
