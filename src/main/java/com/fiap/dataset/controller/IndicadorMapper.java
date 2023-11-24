package com.fiap.dataset.controller;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.fiap.dataset.model.Indicador;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class IndicadorMapper {
	
	private final ModelMapper modelMapper = new ModelMapper();

	public Indicador map(IndicadorDTO dto) {
		Indicador ind = modelMapper.map(dto, Indicador.class);
		return ind;
	}

	public IndicadorDTO map(Indicador ind) {
		IndicadorDTO dto = modelMapper.map(ind, IndicadorDTO.class);
		return dto;
	}

}
