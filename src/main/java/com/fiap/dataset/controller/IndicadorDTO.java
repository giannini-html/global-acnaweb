package com.fiap.dataset.controller;

import com.fiap.dataset.model.Indicador;

public class IndicadorDTO {

	private String id;
	private String descricao;

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

	public static IndicadorDTO toDto(Indicador indicador) {
		IndicadorDTO dto = new IndicadorDTO();
		dto.setId(indicador.getId());		
		dto.setDescricao(indicador.getDescricao());		
		return dto;
	}
}
