package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cuartoCodigo();
    }

    public static void primerCodigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su valor\n");
        String entrada = scanner.nextLine();
        System.out.println(entrada);
    }

    public static void segundoCodigo() {
        boolean miguelAngel;
        miguelAngel = true;
        if (miguelAngel) {
            System.out.println("se salvo");
        } else {
            System.out.println("se la gano");
        }
    }

    public static void tercerCodigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su valor\n");
        String entrada = scanner.nextLine();

        if (entrada.equals("1")) {
            System.out.println("es uno");
        }
        else if (entrada.equals("2")) {
            System.out.println("es dos");
        }
        else {
            System.out.println("no es ni uno ni es dos");
        }
    }
    public static void cuartoCodigo() {
        List <String> listaPersonas=new ArrayList<>();
        listaPersonas.add("saul");
        listaPersonas.add("migue");
        listaPersonas.add("isa");
        //System.out.println(listaPersonas);
        for (int i = 0; i < listaPersonas.size(); i++) {
            //System.out.println(listaPersonas.get(i));
            if (listaPersonas.get(i).equals("migue")){
                System.out.println(listaPersonas.get(i));
            }

        }
    }
}



