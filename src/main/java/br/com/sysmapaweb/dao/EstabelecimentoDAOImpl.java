package br.com.sysmapaweb.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import br.com.sysmapaweb.model.Estabelecimento;

public class EstabelecimentoDAOImpl implements IEstabelecimentoDAO {
	private Map<String, Estabelecimento> estabelecimentos = new HashMap<String, Estabelecimento>();
	Logger logger = Logger.getLogger(this.getClass());

	public void incluir(Estabelecimento entidade) {
		estabelecimentos.put(entidade.getDescricao(), entidade);
	}

	public List<Estabelecimento> listar() {
		return new ArrayList<Estabelecimento>(estabelecimentos.values());
	}

	public Estabelecimento getEstabelecimento(Integer id) {
		return estabelecimentos.get(id);
	}

	public void alterar(Estabelecimento entidade) {
		estabelecimentos.put(entidade.getDescricao(), entidade);
	}

	public void excluir(Integer id) {
		estabelecimentos.remove(id);
	}
	
	public void initialisation() {
//		incluir(new Estabelecimento(20, "notas", ""));
//		logger.info("Initialisation du catalogue");
	}




}
