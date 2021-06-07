package Practico2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]){
        String nombre = "";
        int año=0;

        Scanner input=new Scanner(System.in);

        System.out.println("Ingrese su Nombre");
        nombre= input.next();

        System.out.println("Ingrese su año de Nacimiento");
        año=input.nextInt();

        int edad= 2021 - año;
        System.out.println("Su nombre es" + nombre);
        System.out.println("Su edad es"  + edad);
    }
}
