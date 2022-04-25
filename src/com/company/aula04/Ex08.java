package com.company.aula04;
//Escreva um programa que leia 10 valores inteiros e positivos
// e encontre o maior valor,
// o menor valor
// e calcule a média dos números lidos
// e exiba essas informações.

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[10];
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Informe o %dº número: ", i+1);
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }

        int maior = 0;

        for(int numero : numeros){
            if (numero > maior){
                maior = numero;
            }
        }

        int menor = maior ;
        for(int numero : numeros){
            if (numero < menor){
                menor = numero;
            }
        }

        int agregador = 0;
        for(int numero : numeros){
            agregador += numero;
        }

        double media = agregador/numeros.length;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.printf("Media: %.2f", media);
    }
}
