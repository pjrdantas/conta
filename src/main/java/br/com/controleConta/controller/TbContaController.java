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


import br.com.controleConta.entity.TbConta;
import br.com.controleConta.service.TbContaService;


@Controller
@RestController
@RequestMapping("/service")
public class TbContaController {
	
	
	@Autowired
	TbContaService tbContaService;
	
	
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbConta", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public List<TbConta> getAllTbContas()  throws Exception, Throwable {
		
		
		return tbContaService.getAllTbContas();
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbConta/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Optional<TbConta> getTbConta(@PathVariable("id") String id)  throws Exception, Throwable {
				
		int idConta = Integer.parseInt(id);
		return tbContaService.getTbConta(idConta);
	}
	
	
	/**
	 * 
	 * @param tbConta
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbConta", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void addTbConta(@RequestBody TbConta tbConta)  throws Exception, Throwable {
		
		
		tbContaService.addTbConta(tbConta);

	}
	
	
	/**
	 * 
	 * @param tbConta
	 * @param id
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbConta/{id}", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void updateTbConta(@RequestBody TbConta tbConta, @PathVariable String id)  throws Exception, Throwable {
				
		tbContaService.updateTbConta(id,tbConta);
	}
	
	
	/**
	 * 
	 * @param id
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value="/tbConta/{id}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void delete(@PathVariable("id") String id)  throws Exception, Throwable { 
						
		int idConta = Integer.parseInt(id);
		tbContaService.deleteTbConta(idConta);
	}	

}
