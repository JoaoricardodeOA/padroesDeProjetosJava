package gof.singleton;

import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy= SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager= SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder= SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
    }
}
