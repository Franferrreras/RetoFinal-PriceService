package com.nttdata.bootcamp.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.nttdata.bootcamp.productservice.dto.Product;
import com.nttdata.bootcamp.productservice.service.ProductManagementServiceI;

@SpringBootApplication
@EnableEurekaClient
public class ProductService21Application implements CommandLineRunner {

	@Autowired
	ProductManagementServiceI productService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductService21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Product pr1 = new Product();
		pr1.setProductName("Shampoo");
		
		Product pr2 = new Product();
		pr2.setProductName("Toalla");
		
		Product pr3 = new Product();
		pr3.setProductName("Camiseta");
		
		Product pr4 = new Product();
		pr4.setProductName("Zapatos");
		
		productService.insertNewProudct(pr1);
		productService.insertNewProudct(pr2);
		productService.insertNewProudct(pr3);
		productService.insertNewProudct(pr4);
		
		
	}

}
