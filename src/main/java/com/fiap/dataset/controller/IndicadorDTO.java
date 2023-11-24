package com.fiap.dataset.controller;

import com.fiap.dataset.model.Indicador;
import com.fiap.dataset.model.Objetivo;

public class IndicadorDTO {

	private String id;
	private String descricao;
	private Objetivo objetivo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public static IndicadorDTO toDto(Indicador indicador) {
		IndicadorDTO dto = new IndicadorDTO();
		dto.setId(indicador.getId());		
		dto.setDescricao(indicador.getDescricao());		
		dto.setObjetivo(indicador.getObjetivo());		
		return dto;
	}
}
