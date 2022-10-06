package com.nttdata.bootcamp.service;

import java.util.List;

import com.nttdata.bootcamp.dto.Price;

public interface PriceManagementServiceI {

	public void insertNewPrice(final Price price);
	
	public List<Price> searchAll();
	
	public Price searchById(final Long id);
}
