package net.bank.customerservice;

import net.bank.customerservice.entities.Customer;
import net.bank.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			List<Customer> customerList=List.of(
					Customer.builder()
							.firstName("Rachid")
							.lastName("Abid")
							.email("rachid@gmail.com")
							.build(),
					Customer.builder()
							.firstName("khalid")
							.lastName("Mousaoui")
							.email("khalid@gmail.com")
							.build(),
					Customer.builder()
							.firstName("Rida")
							.lastName("boufous")
							.email("rida@gmail.com")
							.build()
			);
			customerRepository.saveAll(customerList);
		};
	}

}
