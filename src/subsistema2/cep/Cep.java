package subsistema2.cep;

import gof.strategy.User;

public class Cep {
    //Singleton
    private static class instanceHolder{
        public static Cep instancia = new Cep();
    }

    private Cep() {
        super();
    }

    public static Cep getInstancia() {
        return instanceHolder.instancia;
    }
    public String recuperarCidade(String cep){
        return "Recife";
    }
    public String recuperarEstado(String cep){
        return "PE";
    }

}
