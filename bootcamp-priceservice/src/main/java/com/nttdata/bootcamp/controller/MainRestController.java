package com.nttdata.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.dto.Price;
import com.nttdata.bootcamp.service.PriceManagementServiceI;

@RestController
public class MainRestController {

	@Autowired
	PriceManagementServiceI priceService;
	
	@RequestMapping("/get-all-prices")
	public ResponseEntity<List<Price>> getAllPrices() {
		
		return ResponseEntity.ok(priceService.searchAll());
	}
	
	@GetMapping("/get-price/{id}")
	public ResponseEntity<Price> getPriceId(@PathVariable("id") Long id) {
		
		return ResponseEntity.ok(priceService.searchById(id));
	}
	
	
}
