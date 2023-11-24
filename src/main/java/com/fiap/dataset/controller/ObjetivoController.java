package com.fiap.dataset.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.dataset.model.Indicador;
import com.fiap.dataset.model.Objetivo;
import com.fiap.dataset.service.IndicadorService;
import com.fiap.dataset.service.ObjetivoService;

@RestController
@RequestMapping("/objetivos")
public class ObjetivoController {

	@Autowired
	private ObjetivoService objetivoService;

	@Autowired
	private IndicadorService indicadorService;
	
	@Autowired
	private IndicadorMapper indicadorMapper;

	@GetMapping
	public List<ObjetivoDTO> listAll() {
		List<ObjetivoDTO> result = objetivoService.list().stream().map(ObjetivoDTO::toDto).collect(Collectors.toList());
		return result;
	}

	@PostMapping
	public Objetivo create(@RequestBody ObjetivoDTO dto) {

		Objetivo obj = new Objetivo();

		// mapeamento
		obj.setId(dto.getId());

		Objetivo result = objetivoService.save(obj);
		return result;
	}

	@GetMapping("{id}/indicadores")
	public ResponseEntity<List<IndicadorDTO>> findPedidosByClienteId(@PathVariable String id) {

		List<IndicadorDTO> dto = indicadorService.findById(id).stream().map(indicadorMapper::map)
				.collect(Collectors.toList());

		return new ResponseEntity<>(dto, HttpStatus.OK);
	}


	@PostMapping("indicadores")
	public Indicador createIndicadores(@RequestBody Indicador ind) {

		Indicador result = indicadorService.save(ind);
		return result;
	}
}
