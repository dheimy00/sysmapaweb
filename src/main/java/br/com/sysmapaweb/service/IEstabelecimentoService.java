package br.com.sysmapaweb.service;
import java.util.List;

import br.com.sysmapaweb.model.Estabelecimento;
public interface IEstabelecimentoService {
	   void incluir(Estabelecimento p);
	   List<Estabelecimento> listar();
	   Estabelecimento getEstabelecimento(Integer id);
	   void alterar(Estabelecimento p);
	   void excluir (Integer id);
}
