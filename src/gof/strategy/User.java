package gof.strategy;

public class User {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    public void estado(){
        comportamento.estado();
    }


}
