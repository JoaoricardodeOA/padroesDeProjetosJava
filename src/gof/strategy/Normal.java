package gof.strategy;

public class Normal implements Comportamento{
    @Override
    public void estado() {
        System.out.println("Espero que seu dia melhore...");
    }
}
