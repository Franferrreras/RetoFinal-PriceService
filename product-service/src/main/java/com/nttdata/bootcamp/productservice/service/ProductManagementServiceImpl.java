package com.nttdata.bootcamp.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.nttdata.bootcamp.productservice.dto.Product;
import com.nttdata.bootcamp.productservice.repository.ProductRepository;


@Service
public class ProductManagementServiceImpl implements ProductManagementServiceI {

	@Autowired
	ProductRepository productRepo;
	
//	@Value("${server.port}")
	private String port = "8080";

	@Override
	public Product ProductGet(Long id) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(id);
		product.setChannel("GET");
		product.setServerPort(port);
		
		return product;
	}

	@Override
	public Product ProductPost(Long id) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(id);
		product.setChannel("POST");
		product.setServerPort(port);
		
		return product;
	}

	@Override
	public List<Product> searchAll() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product searchById(Long id) {
		// TODO Auto-generated method stub
		return productRepo.findProductById(id);
	}

	@Override
	public void insertNewProudct(Product newProduct) {
		// TODO Auto-generated method stub
		if(newProduct != null && newProduct.getId() == null) {
			productRepo.save(newProduct);
		}
	}

}
