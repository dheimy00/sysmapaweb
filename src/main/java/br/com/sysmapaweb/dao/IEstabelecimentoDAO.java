package br.com.sysmapaweb.dao;
import java.util.List;

import br.com.sysmapaweb.model.Estabelecimento;



public interface IEstabelecimentoDAO {
	
	Estabelecimento getEstabelecimento(Integer id);
	
	void excluir(Integer id);
	
	void incluir(Estabelecimento entidade);
   
   List<Estabelecimento> listar();
   
   void alterar(Estabelecimento entidade);
}
