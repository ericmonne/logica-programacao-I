package com.company.aula06;
//Faça um programa para receber um conjunto de 10 valores até 100,
// e insira em uma matriz,
// em seguida você deverá receber um outro valor
// e verificar se o elemento existe no conjunto de 10 valores da matriz.
// Caso exista você deve imprimir uma mensagem:
// "O valor existe no conjunto",
// caso contrário deverá exibir: "O valor não existe no conjunto"

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double matrizUm[] = new double[10];

        for (int i = 0; i < matrizUm.length; i++) {
            System.out.printf("Informe o %dº número: ", i+1);
            matrizUm[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.print("Informe um número: ");
        double numero = Double.parseDouble(scanner.nextLine());

        boolean buscador = false;
        for(double valor: matrizUm){
            if(valor == numero){
                buscador = true;
                break;
            }
        }
        if (buscador){
            System.out.println("O valor existe no conjunto.");
        } else {
            System.out.println("O valor não existe no conjunto.");
        }

        scanner.close();
    }
}
