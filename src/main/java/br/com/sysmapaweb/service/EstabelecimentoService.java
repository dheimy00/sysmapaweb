package br.com.sysmapaweb.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.sysmapaweb.model.Estabelecimento;
import br.com.sysmapaweb.dao.IEstabelecimentoDAO;

@Transactional
public class EstabelecimentoService implements IEstabelecimentoService {
	private IEstabelecimentoDAO dao;
	
	public void setDao(IEstabelecimentoDAO dao) {
		this.dao = dao;
	}

	public void incluir(Estabelecimento entidade) {
		dao.incluir(entidade);		
	}

	public List<Estabelecimento> listar() {
		return dao.listar();
	}

	public Estabelecimento getEstabelecimento(Integer id) {
		return dao.getEstabelecimento(id);
	}

	public void alterar(Estabelecimento entidade) {
		dao.alterar(entidade);
	}

	public void excluir(Integer id) {
		dao.excluir(id);
	}

	

	



}
