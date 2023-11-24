package com.fiap.dataset.controller;

import com.fiap.dataset.model.Objetivo;

public class ObjetivoDTO {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	public static ObjetivoDTO toDto(Objetivo objetivo) {
		ObjetivoDTO dto = new ObjetivoDTO();
		dto.setId(objetivo.getId());		
		return dto;
	}
}
