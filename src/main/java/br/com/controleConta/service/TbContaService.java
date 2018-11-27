package br.com.controleConta.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.controleConta.entity.TbConta;
import br.com.controleConta.service.impl.ItbContaService;

@Service
public class TbContaService {
	
	@Autowired
	ItbContaService itbContaService;
	
	
	public List<TbConta> getAllTbContas() {
		List<TbConta> tbContas = new ArrayList<TbConta>();
		itbContaService.findAll().forEach(tbContas::add);
		return tbContas;
	}
		
	public Optional<TbConta> getTbConta(String id) {
		return itbContaService.findById(id);
	}
	
	public void addTbConta(TbConta tbConta) {
		itbContaService.save(tbConta);
	}
	
	public void updateTbConta(String id, TbConta tbConta) {
		itbContaService.save(tbConta);
	}
	
	public void deleteTbConta(String id) {
		itbContaService.deleteById(id);
	}
	

}
