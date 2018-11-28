package br.com.controleConta.service.impl;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import br.com.controleConta.entity.TbMovimentacao;


public interface ItbMovimentacaoService  extends CrudRepository<TbMovimentacao, String>{

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	Optional<TbMovimentacao> findById(int id) throws Exception, Throwable;

	/**
	 * 
	 * @param id
	 * @throws Exception
	 * @throws Throwable
	 */
	void save(int id) throws Exception, Throwable;

	/**
	 * 
	 * @param id
	 * @throws Exception
	 * @throws Throwable
	 */
	void deleteById(int id) throws Exception, Throwable;



}
