package spring.projeto.entity.repository;


import org.springframework.data.repository.CrudRepository;

import spring.projeto.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	

}


