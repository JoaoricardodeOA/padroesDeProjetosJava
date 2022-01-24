package gof.facade;

import subsistema.crm.CrmService;
import subsistema2.cep.Cep;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = Cep.getInstancia().recuperarCidade(cep);
        String estado = Cep.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
