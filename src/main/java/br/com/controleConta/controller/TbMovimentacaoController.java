package br.com.controleConta.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.controleConta.entity.TbMovimentacao;
import br.com.controleConta.service.TbMovimentacaoService;


@Controller
@RestController
@RequestMapping("/service")
public class TbMovimentacaoController {
	
	
	@Autowired
	TbMovimentacaoService tbMovimentacaoService;
	
	
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbMovimentacao", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public List<TbMovimentacao> getAllTbMovimentacaos()  throws Exception, Throwable {
		
		
		return tbMovimentacaoService.getAllTbMovimentacaos();
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbMovimentacao/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Optional<TbMovimentacao> getTbMovimentacao(@PathVariable("id") String id)  throws Exception, Throwable {
				
		int idConta = Integer.parseInt(id);
		return tbMovimentacaoService.getTbMovimentacao(idConta);
	}
	
	
	/**
	 * 
	 * @param tbMovimentacao
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbMovimentacao", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void addTbMovimentacao(@RequestBody TbMovimentacao tbMovimentacao)  throws Exception, Throwable {
		
		
		tbMovimentacaoService.addTbMovimentacao(tbMovimentacao);

	}
	
	
	/**
	 * 
	 * @param tbMovimentacao
	 * @param id
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbMovimentacao/{id}", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void updateTbMovimentacao(@RequestBody TbMovimentacao tbMovimentacao, @PathVariable String id)  throws Exception, Throwable {
				
		tbMovimentacaoService.updateTbMovimentacao(id,tbMovimentacao);
	}
	
	
	/**
	 * 
	 * @param id
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbMovimentacao/{id}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void delete(@PathVariable("id") String id)  throws Exception, Throwable { 
			
		int idConta = Integer.parseInt(id);
		tbMovimentacaoService.deleteTbMovimentacao(idConta);
	}	

}
