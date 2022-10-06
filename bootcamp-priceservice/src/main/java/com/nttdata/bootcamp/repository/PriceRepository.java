package com.nttdata.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.dto.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

	public Price findPriceById(final Long id);
}
