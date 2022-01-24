package gof.facade;

import gof.strategy.User;
import subsistema.crm.CrmService;
import subsistema2.cep.Cep;

public class Facade {
    public void migrarCliente(String nome, String cep, User comportamento){
        String cidade = Cep.getInstancia().recuperarCidade(cep);
        String estado = Cep.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado,comportamento);
    }
}
