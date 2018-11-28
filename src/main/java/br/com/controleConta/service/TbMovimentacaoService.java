package br.com.controleConta.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.controleConta.entity.TbMovimentacao;
import br.com.controleConta.service.impl.ItbMovimentacaoService;




@Service
@Transactional
public class TbMovimentacaoService {
	
	@Autowired
	ItbMovimentacaoService itbMovimentacaoService;
	
	
	public List<TbMovimentacao> getAllTbMovimentacaos() {
		List<TbMovimentacao> tbMovimentacaos = new ArrayList<TbMovimentacao>();
		itbMovimentacaoService.findAll().forEach(tbMovimentacaos::add);
		return tbMovimentacaos;
	}
		
	public Optional<TbMovimentacao> getTbMovimentacao(int id) throws Exception, Throwable {
		return itbMovimentacaoService.findById(id);
	}
	
	public void addTbMovimentacao(TbMovimentacao tbMovimentacao) {
		itbMovimentacaoService.save(tbMovimentacao);
	}
	
	public void updateTbMovimentacao(String id, TbMovimentacao tbMovimentacao) {
		itbMovimentacaoService.save(tbMovimentacao);
	}
	
	public void deleteTbMovimentacao(int id) throws Exception, Throwable {
		itbMovimentacaoService.deleteById(id);
	}
	

}
