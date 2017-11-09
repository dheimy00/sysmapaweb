package br.com.sysmapaweb.action;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import br.com.sysmapaweb.model.Estabelecimento;
import br.com.sysmapaweb.service.IEstabelecimentoService;

public class EstabelecimentoAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String ref;
	public Estabelecimento estabelecimento = new Estabelecimento();
	public List<Estabelecimento> estabelecimentos;
	public boolean editMode=false;

	@Autowired
	private IEstabelecimentoService service;
	Logger logger=Logger.getLogger(this.getClass());


	public String index(){
		estabelecimentos=service.listar();
		return SUCCESS;
	}
	public String save(){
		logger.info(estabelecimento.getDescricao());
		if(editMode == false)
			service.incluir(estabelecimento);
		else{
			service.alterar(estabelecimento);
			this.estabelecimento = new Estabelecimento();
		}
		estabelecimentos=service.listar();
		return SUCCESS;
	}
	public String delete(){
		service.excluir(Integer.parseInt(ref));
		estabelecimentos=service.listar();
		return SUCCESS;
	}
	public String edit(){
		estabelecimento=service.getEstabelecimento(Integer.parseInt(ref));
		estabelecimentos=service.listar();
		editMode=true;
		return SUCCESS;
	}
	

}
