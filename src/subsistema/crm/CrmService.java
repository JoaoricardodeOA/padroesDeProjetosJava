package subsistema.crm;

import gof.strategy.User;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado, User user) {
        System.out.println("Cliente salvo no sistema de crm,");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
        try {
            user.estado();
        }catch (NullPointerException o){
            System.out.println("infelizmente como não foi informado corretamente seu estado, só posso desejar que aproveite o dia.:)");
        }
    }
}
