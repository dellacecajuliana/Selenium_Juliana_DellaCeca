package Practico2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String args[]){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un Numero");
        num1 = input.nextInt();

        System.out.println("Ingrese otro Numero");
        num2 = input.nextInt();

        System.out.println("Ingrese el ultimo Numero");
        num3 = input.nextInt();

        int suma = num1 + num2 + num3;
        System.out.println("La suma es" + suma);
    }

}
