package spring.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.projeto.entity.Customer;
import spring.projeto.entity.repository.CustomerRepository;

@Controller
@RequestMapping(path = "/customers")
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	public CustomerController(CustomerRepository customerRepository) {
		this.repository = customerRepository;

	}

	@PostMapping
	@ResponseBody
	public Customer create(@RequestParam String name, @RequestParam Integer age) {
		Customer customer = new Customer(name, age);

		repository.save(customer);

		return customer;

	}

}
