package facade;

import subSistema1.crm.CrmService;
import subSistema2.cep.CepApi;

public class Facede {
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, nome, cep);
	}

}
