package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);

	public void deleteCustomer(Long id);

	public List<Customer> getAllCustomers();

	public Optional<Customer> getCustomerById(Long id);

	public Customer updateCustomer(Long id, Customer updatedCustomer);

}
