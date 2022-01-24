package gof.strategy;

public class Feliz implements Comportamento{
    @Override
    public void estado() {
        System.out.println("Uhuu aproveite seu dia...");
    }
}
