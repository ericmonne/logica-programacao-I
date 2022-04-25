package com.company.aula04;
//Escreva um programa que receba 5 números inteiros,
// armazene-os em um array,
// e imprima na tela os valores em ordem decrescente.

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[5];

        for(int i = 0; i< numeros.length; i++){
            System.out.printf("Informe o %dº número: ", i+1);
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }

        //Solução 01
        Arrays.sort(numeros);
        for(int i = numeros.length - 1; i > 0; i--){
            System.out.println(numeros[i]);
        }


        //Solução 02
//        for (int i = 1; i < numeros.length; i++){
//            for(int j =0; j<i; j++){
//                if(numeros[i] > numeros[j]){
//                    int temporaria = numeros[i];
//                    numeros[i] = numeros[j];
//                    numeros[j] = temporaria;
//                }
//            }
//        }
//        for(int numero : numeros){
//            System.out.println(numero);
//        }

        scanner.close();
    }
}
