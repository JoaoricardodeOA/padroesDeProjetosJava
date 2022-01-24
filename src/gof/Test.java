package gof;

import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy= SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager= SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder= SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo=new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
    }
}
