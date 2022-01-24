package subsistema2.cep;

public class Cep {
    private static Cep instancia = new Cep();

    private Cep() {
        super();
    }

    public static Cep getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Recife";
    }
    public String recuperarEstado(String cep){
        return "PE";
    }

}
