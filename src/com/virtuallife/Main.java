package com.virtuallife;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;
        //obtenemos un número por teclado

        System.out.println("Por favor, introduce un número");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        //comprobamos número con el método

        comprobarNumero(numero);


        //bucle while

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

       //bucle do while

        do{
            System.out.println(numeroWhile);
        }while (numeroWhile>3);

        //bucle for

        int numeroFor = 0;
        for(int i=0; i<=3; i++){
            numeroFor++;
            System.out.println(numeroFor);
        }

        //bloque switch

        System.out.println("Indica un múmero de estación");
        int nEstacion;
        nEstacion = sc.nextInt();
        switch (nEstacion){
            case 1:
                System.out.println("La estación elegida es INVIERNO");
                break;
            case 2:
                System.out.println("La estación elegida es PRIMAVERA");
                break;
            case 3:
                System.out.println("La estación elegida es VERANO");
                break;
            case 4:
                System.out.println("La estación elegida es OTOÑO");
                break;
            default:
                System.out.println(nEstacion + " no es una estación válida. Introduce un nñumero del 1 al 4");

        }
    }


    //método para comprobar si un número es positivo o negativo
    public static void comprobarNumero(int numero){
        if(numero >= 0){
            System.out.println("El número " + numero + " es positivo");
        }else{
            System.out.println("El número " + numero + " es negatvio");
        }
    }
}