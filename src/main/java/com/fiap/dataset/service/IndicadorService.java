package com.fiap.dataset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.dataset.model.Indicador;
import com.fiap.dataset.repository.IndicadorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IndicadorService {

	@Autowired
	private IndicadorRepository indicadorRepository;

	public List<Indicador> list() {
		return indicadorRepository.findAll();
	}
	
	public Indicador save(Indicador ind) {
		return indicadorRepository.save(ind);
	}
	
	public List<Indicador> findById(String id) {
		return indicadorRepository.findByObjetivo(id);	
		}
}
