package com.nttdata.bootcamp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.dto.Price;
import com.nttdata.bootcamp.repository.PriceRepository;

@Service
public class PriceManagementServiceImpl implements PriceManagementServiceI {

	@Autowired
	PriceRepository priceRepo;
	
	@Override
	public void insertNewPrice(Price price) {
		// TODO Auto-generated method stub
		if (price != null && price.getId() == null) {
			priceRepo.save(price);
		}
	}

	@Override
	public List<Price> searchAll() {
		// TODO Auto-generated method stub
		return priceRepo.findAll();
	}

	@Override
	public Price searchById(Long id) {
		// TODO Auto-generated method stub
		return priceRepo.findPriceById(id);
	}

}
