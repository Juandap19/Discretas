package ui;
import model.*;

import java.util.Scanner;

public class Main {
    public static  Scanner lc = new Scanner(System.in);
    public static Controladora ct = new Controladora();

    public static void main(String[] args) {
        int option = 0;
        do {
            option = menu();
            switch (option) {
                case 1:
                    addElementoConjA();
                    break;
                case 2:
                    addElementoConjB();
                    break;
                case 3:
                    interseccion();
                    break;
                case 4:
                    union();
                    break;
                case 5:
                   diferencia();
                    break;
                case 6:
                    cardinalA();
                    break;
                case 7:
                    cardinalB();
                    break;

            }
        } while (option != 8);
    }
    public static int menu(){
        System.out.println("///////////////////////////////////////////////\n");
        System.out.println("Hola! ¿Qué deseas hacer?:\n" +
                "[1] Agregar Elemento - Conjunto A\n" +
                "[2] Agregar Elemento - Conjunto B\n" +
                "[3] Interseccion\n" +
                "[4] Union\n" +
                "[5] Diferencia.\n" +
                "[6] Cardinalidad - Conjunto A\n" +
                "[7] Cardinalidad - Conjunto B\n" +
                "[8] Salir\n");
        System.out.println("///////////////////////////////////////////////");
        int option = lc.nextInt();
        lc.nextLine();
        return option;

    }

    public static void addElementoConjA() {
        System.out.println("Ingresa el numero desea agregar");
        int value = lc.nextInt();
        lc.nextLine();
        ct.agregarElemento(1, value);
        System.out.println("\n"+ct.printConjunto(1));

    }

    public static void addElementoConjB() {
        System.out.println("Ingresa el numero que desea agregar");
        int value = lc.nextInt();
        lc.nextLine();
        ct.agregarElemento(2, value);
        System.out.println("\n"+ct.printConjunto(2));

    }


    public static void interseccion() {
        System.out.println("\n"+ct.interseccion());
    }

    public static void union() {
        System.out.println("\n"+ct.union());
    }

    public static void diferencia() {
        System.out.println("\n Indica cual quieres hacer:"+
                "\n [1] A-B"+
                "\n [2] B-A");
        int value = lc.nextInt();
        lc.nextLine();
        System.out.println("\n"+ct.diferencia(value));
    }
   public static void  cardinalA(){
       System.out.println("\n"+ct.cardinalidad(1));
   }
    public static void cardinalB(){
        System.out.println("\n"+ct.cardinalidad(2));
    }
}
