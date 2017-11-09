package br.com.sysmapaweb.service;


import br.com.sysmapaweb.dao.EstabelecimentoDAOImpl;

public class ServiceSingleton {
	private static EstabelecimentoService service;
	static {

		EstabelecimentoDAOImpl dao = new EstabelecimentoDAOImpl();
		dao.initialisation();
		service = new EstabelecimentoService();
		service.setDao(dao);
	}

	public static IEstabelecimentoService getService() {
		return service;
	}
}
