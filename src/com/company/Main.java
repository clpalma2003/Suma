package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer = new Scanner(System.in);
                int num_1, num_2, suma;
        System.out.println("Ingrese el primer numero : ");

        num_1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero : ");

        num_2 = leer.nextInt();

        //suma = sumar(num_1, num_2);
        suma = num_1 + num_2;

        System.out.println("La suma es: " + suma);


    }
    static int sumar(int x , int y){
        int retorno;
        retorno = x +y;

        return retorno;
    }

}
