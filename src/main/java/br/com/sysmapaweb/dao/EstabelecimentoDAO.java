package br.com.sysmapaweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.sysmapaweb.model.Estabelecimento;

public class EstabelecimentoDAO implements IEstabelecimentoDAO {
	@PersistenceContext
	private EntityManager em;

	public void incluir(Estabelecimento entidade) {
		em.persist(entidade);
	}

	public List<Estabelecimento> listar() {
		Query lista = em.createQuery("select e from Estabelecimento e");
		return lista.getResultList();
	}

	public Estabelecimento getEstabelecimento(Integer id) {
		return em.find(Estabelecimento.class, id);
	}

	public void alterar(Estabelecimento entidade) {
		em.merge(entidade);

	}

	public void excluir( Integer id) {
		Estabelecimento e = getEstabelecimento(id);
		em.remove(e);
	}


}
