package com.fiap.dataset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.dataset.model.Objetivo;
import com.fiap.dataset.repository.ObjetivoRepository;

@Service
public class ObjetivoService {

	@Autowired
	private ObjetivoRepository objetivoRepository;

	public List<Objetivo> list() {
		return objetivoRepository.findAll();
	}
	
	public Objetivo save(Objetivo obj) {
		return objetivoRepository.save(obj);
	}
	
}
