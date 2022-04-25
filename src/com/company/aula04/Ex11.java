package com.company.aula04;
//Escreva um programa que receba dois números inteiros
// e imprima os números inteiros que estão no intervalo compreendido entre eles.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int segundo = scanner.nextInt();

        if (primeiro < segundo){
            for(int i = primeiro+1; i < segundo; i++){
                System.out.println(i);
            }
        } else if (primeiro > segundo){
            for(int i = primeiro - 1; i > segundo; i--){
                System.out.println(i);
            }
        } else {
            System.out.println("Os dois números são iguais");
        }

    }
}
