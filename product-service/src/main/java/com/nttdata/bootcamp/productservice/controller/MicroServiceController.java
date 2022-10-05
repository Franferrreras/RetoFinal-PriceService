package com.nttdata.bootcamp.productservice.controller;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.dto.Product;
import com.nttdata.bootcamp.productservice.service.ProductManagementServiceI;


@RestController
@RequestMapping("/product")
public class MicroServiceController {

	@Autowired
	ProductManagementServiceI productService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> MethodGet(@PathVariable("id") Long id) {
		
		Product product = productService.searchById(id);
		return ResponseEntity.ok(product);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Product> MethodPost(@PathVariable("id") Long id) {
		
		Product product = productService.ProductPost(id);
		return ResponseEntity.ok(product);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> getProducts() {
		
		return ResponseEntity.ok(productService.searchAll());
	}
	
	
}
