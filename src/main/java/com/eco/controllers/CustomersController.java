package com.eco.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eco.entities.Customer;
import com.eco.service.CustomerService;

@RestController
@RequestMapping(value = "/api")
public class CustomersController {
	@Autowired(required = false)
	CustomerService customerService;

	private final Logger LOG = LoggerFactory.getLogger(CustomersController.class);

	// http://localhost:PORT/customers (GET)
	@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
	public List<Customer> getCustomers() {
		LOG.info("Request a http://localhost:PORT/api/customers (GET)");
		return customerService.findAllCustomers();
	}

	// http://localhost:PORT/customers/1 (GET)
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Customer> getCustomerById(@PathVariable Long id) {
		LOG.info("Request a http://localhost:PORT/api/customers/id (GET)");
		return customerService.findCustomerById(id);
	}

	// http://localhost:PORT/customers/add (POST)
	@RequestMapping(value = "/customers/add", method = RequestMethod.POST, produces = "application/json")
	public Customer addCustomer(Customer customer) {
		LOG.info("Request a http://localhost:PORT/api/customers/add (ADD)");
		return customerService.saveCustomer(customer);
	}

	// http://localhost:PORT/customers/delete/1 (GET)
	@RequestMapping(value = "/customers/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	public String deleteCustomer(@PathVariable Long id) {
		LOG.info("Request a http://localhost:PORT/api/delete/id (GET)");
		return customerService.deleteCustomer(id);
	}

	// http://llocalhost:PORT/customers/update (PATCH)
	@RequestMapping(value = "/customers/update", method = RequestMethod.PATCH, produces = "application/json")
	public String updateCustomer(Customer customerNew) {
		LOG.info("Request a http://localhost:PORT/api/customers/update (PATCH)");
		return customerService.updateCustomer(customerNew);
	}

	// http://localhost:PORT/test (GET)
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	public String test() {
		LOG.info("Request a http://localhost:PORT/api/test (GET)");
		return "Test done";
	}
}
