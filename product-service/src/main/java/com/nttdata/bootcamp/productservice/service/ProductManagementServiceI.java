package com.nttdata.bootcamp.productservice.service;

import java.util.List;

import com.nttdata.bootcamp.productservice.dto.Product;

public interface ProductManagementServiceI {

	public Product ProductGet(Long id);

	public Product ProductPost(Long id);
	
	public void insertNewProudct(final Product newProduct);
	
	public List<Product> searchAll();
	
	public Product searchById(final Long id);
}
