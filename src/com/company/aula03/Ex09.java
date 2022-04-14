package com.company.aula03;
//Escreva um programa que exiba quantas pessoas possuem mais de 18 anos.
// O algoritmo deverá ler a idade de 10 pessoas.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idades[] = new int[10];

        for(int i = 0; i < idades.length; i++){
            System.out.printf("Digite a idade da %dª pessoa: ", i+1);
            idades[i] = Integer.parseInt(scanner.nextLine());
        }

        int contador = 0;
        for(int idade : idades){
            if(idade >= 18){
                contador++;
            }
        }

        System.out.println(contador + " pessoas possuem 18 anos ou mais");
    }
}
