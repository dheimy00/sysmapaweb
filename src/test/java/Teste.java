

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.sysmapaweb.dao.EstabelecimentoDAO;
import br.com.sysmapaweb.dao.EstabelecimentoDAOImpl;
import br.com.sysmapaweb.model.Estabelecimento;
import br.com.sysmapaweb.service.IEstabelecimentoService;

/**
 * This class contains UserDao tests.
 * <p>
 * 
 * @author Atanas Roussev
 */
public class Teste {

	private Estabelecimento user = new Estabelecimento();
	private EstabelecimentoDAOImpl dao = new EstabelecimentoDAOImpl();
	private EstabelecimentoDAO daoim = new EstabelecimentoDAO();
	private IEstabelecimentoService service;

	
	@Test
	public void list() {
//		List<Estabelecimento> list = .listar();
//		Assert.assertTrue(list.size() > 0 );
//	}

     	//listar
		 List<Estabelecimento>  users = dao.listar();
	     Assert.assertTrue(users != null);
	
	
//	Excluir
//	dao.excluir(1);
//	user = dao.getEstabelecimento(5);
//	Assert.assertTrue(user == null);
//	
	
////  Incluir	
//	Estabelecimento u = new Estabelecimento();
//	u.setCodigo(1);
//	u.setDescricao("tessss");
//	dao.incluir(u);
//	Assert.assertTrue(daoim != null);
//	Assert.assertTrue(u.getCodigo() != null);	
}

//	@Test
//	public void read() {
//		String sampleName = "test-name";
//		Estabelecimento u2 = new Estabelecimento();
//		user = dao.getEstabelecimento(user.getCodigo());
//		user.setDescricao(sampleName);
//		dao.alterar(user);
//		u2 = dao.getEstabelecimento(user.getCodigo());
//		Assert.assertTrue(sampleName.equals(u2.getDescricao()));
//	}
	
//	@Test
//	public void createDelete() {
//		Estabelecimento u = new Estabelecimento();
//				
//		u.setCodigo(1);
//		u.setDescricao("tessss");
//		dao.incluir(u);
//		Assert.assertTrue(daoim != null);
//		Assert.assertTrue(u.getCodigo() != null);		
//		dao.excluir(u.getCodigo());
//		u = dao.getEstabelecimento(u.getCodigo());
//		Assert.assertTrue(u == null);
//	}
	
//	@Test
//	public void update() {
//		Estabelecimento u = new Estabelecimento();
//		Estabelecimento u2 = new Estabelecimento();
//		String sampleName = "testeq";	
//		u = dao.getEstabelecimento(user.getCodigo());
//		u.setDescricao(sampleName);
//		daoim.alterar(u);
//		u2 = dao.getEstabelecimento(user.getCodigo());
//		Assert.assertTrue(sampleName.equals(u2.getDescricao()));
//	}



}