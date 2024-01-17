package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	@Transactional
	public Customer saveCustomer(Customer customer) {

		return customerRepository.save(customer);

	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);

	}

	@Override
	public List<Customer> getAllCustomers() {

		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(Long id) {

		return customerRepository.findById(id);
	}

	@Override
	@Transactional
	public Customer updateCustomer(Long id, Customer updatedCustomer) {
		return customerRepository.findById(id).map(existingCustomer -> {
			existingCustomer.setFirstName(updatedCustomer.getFirstName());
			existingCustomer.setLastName(updatedCustomer.getLastName());
			existingCustomer.setStreet(updatedCustomer.getStreet());
			existingCustomer.setAddress(updatedCustomer.getAddress());
			existingCustomer.setCity(updatedCustomer.getCity());
			existingCustomer.setState(updatedCustomer.getState());
			existingCustomer.setEmail(updatedCustomer.getEmail());
			existingCustomer.setPhone(updatedCustomer.getPhone());
			return customerRepository.save(existingCustomer);
		}).orElse(null);
	}

}
