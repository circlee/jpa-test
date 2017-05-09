package com.sample.service;



import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.domain.Customer;
import com.sample.domain.CustomerManager;
import com.sample.domain.Manager;
import com.sample.repository.CustomerManagerRepository;
import com.sample.repository.CustomerRepository;
import com.sample.repository.ManagerRepository;

@Service
public class TestService {


	private static final Logger log = LoggerFactory.getLogger(TestService.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ManagerRepository managerRepository;

	@Autowired
	private CustomerManagerRepository customerManagerRepository;


	@Transactional
	public void setInitData(){

		// save a couple of customers
		customerRepository.save(new Customer("Jack", "Bauer"));
		customerRepository.save(new Customer("Chloe", "O'Brian"));
		customerRepository.save(new Customer("Kim", "Bauer"));
		customerRepository.save(new Customer("David", "Palmer"));
		customerRepository.save(new Customer("Michelle", "Dessler"));

		// fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (Customer customer : customerRepository.findAll()) {
			log.info(customer.toString());
		}
		log.info("");

		// save a couple of managers
		managerRepository.save(new Manager("Manager-Jack", "Bauer"));
		managerRepository.save(new Manager("Manager-Chloe", "O'Brian"));
		managerRepository.save(new Manager("Manager-Kim", "Bauer"));
		managerRepository.save(new Manager("Manager-David", "Palmer"));
		managerRepository.save(new Manager("Manager-Michelle", "Dessler"));

		// fetch all customers
		log.info("Managers found with findAll():");
		log.info("-------------------------------");
		for (Manager manager : managerRepository.findAll()) {
			log.info(manager.toString());
		}
		log.info("");


		Customer cus1 = customerRepository.findAll().stream().findFirst().orElse(null);
		Manager man1 = managerRepository.findAll().stream().findFirst().orElse(null);

		if(cus1 != null && man1 != null) {

			log.info("CustomerManager insert target : " + cus1);
			log.info("CustomerManager insert target : " + man1);
			customerManagerRepository.save(new CustomerManager(cus1, man1));
		}



	}
	@Transactional
	public void fetchAllCustomerManager() {
		// fetch all customers
		log.info("CustomerManager found with findAll():");
		log.info("-------------------------------");
		for (CustomerManager cm : customerManagerRepository.findAll()) {
			log.info(cm.toString());
		}
		log.info("");
	}
	
	@Transactional
	public void deleteCustomerManagerByCustomerId(Long customerId){
		
		log.info("CustomerManager delete by customerID : " + customerId);
		customerManagerRepository.deleteByCustomerId(customerId);



	}

}
