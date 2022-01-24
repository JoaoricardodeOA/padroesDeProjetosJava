package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, cep, dia;
        User user =new User();


        // Strategy
        Comportamento normal = new Normal();
        Comportamento feliz = new Feliz();
        Comportamento ruim = new Ruim();



        //Facade
        Facade usuario1 = new Facade();
        System.out.println("Bom dia recifense! qual é o seu nome?");
        nome = in.next();
        System.out.println("CEP?");
        cep = in.next();
        System.out.println("Como vai seu dia?(bom, feliz ou ruim)");
        dia = in.next();
        switch (dia){
            case "bom":user.setComportamento(normal);
            break;
            case "feliz":user.setComportamento(feliz);
            break;
            case "ruim":user.setComportamento(ruim);
            break;
            default:
                System.out.println("opção inválida");
        }
        usuario1.migrarCliente(nome, cep, user);

    }
}
