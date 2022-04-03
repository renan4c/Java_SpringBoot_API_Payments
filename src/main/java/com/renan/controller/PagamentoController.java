package com.renan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.renan.dominio.Pagamento;
import com.renan.repository.PagamentoRepository;


@RestController
@RequestMapping("/pagamento")
public class PagamentoController {
	
	@Autowired
	PagamentoRepository pagamentoRepository;
	
	@GetMapping
	public List<Pagamento> buscarPagamentos() {
		return pagamentoRepository.findAll(); 
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pagamento adicionaPagamento(@RequestBody Pagamento pagamento) {
		return pagamentoRepository.save(pagamento);
	}
	
	@RequestMapping(value = "/saveAll", method = RequestMethod.POST)
	public List<Pagamento> saveAllPagamentos(@RequestBody List<Pagamento> pagamentos) {
		return (List<Pagamento>) pagamentoRepository.saveAll(pagamentos);

	}
	
}
