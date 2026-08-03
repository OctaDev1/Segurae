package com.generation.segurae.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.segurae.model.Apolice;

import jakarta.persistence.Id;

public interface ApoliceRepository extends JpaRepository<Long, Id>{
	
	public List<Apolice> findAllByTipoCoberturaContainingIgnoreCase(String tipoCobertura);
	public List<Apolice> findAllByPlacaContainingIgnoreCase(String placa);

}
