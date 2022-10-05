package com.nttdata.bootcamp.productservice.service;

import com.nttdata.bootcamp.productservice.dto.ProductDTO;

public interface ProductManagementServiceI {

	public ProductDTO ProductGet(Long id);

	public ProductDTO ProductPost(Long id);
}
