package com.nttdata.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.nttdata.bootcamp.dto.Price;
import com.nttdata.bootcamp.service.PriceManagementServiceI;

@SpringBootApplication
@EnableEurekaClient
public class BootcampPriceserviceApplication implements CommandLineRunner {

	@Autowired
	PriceManagementServiceI priceService;
	
	public static void main(String[] args) {
		SpringApplication.run(BootcampPriceserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Price pr1 = new Price();
		pr1.setCodeProduct("PRODCT_001");
		pr1.setDescription("Gafas");
		pr1.setPrice(69.99);
		
		Price pr2 = new Price();
		pr2.setCodeProduct("PRODCT_002");
		pr2.setDescription("Camisa");
		pr2.setPrice(14.99);
		
		Price pr3 = new Price();
		pr3.setCodeProduct("PRODCT_003");
		pr3.setDescription("Lavadora");
		pr3.setPrice(499.99);
		
		Price pr4 = new Price();
		pr4.setCodeProduct("PRODCT_004");
		pr4.setDescription("Chocolate");
		pr4.setPrice(9.99);
		
		priceService.insertNewPrice(pr1);
		priceService.insertNewPrice(pr2);
		priceService.insertNewPrice(pr3);
		priceService.insertNewPrice(pr4);
	}

}
