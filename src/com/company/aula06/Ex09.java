package com.company.aula06;
//Crie um programa que preencha uma matriz de 3x5 com números inteiros.
// Em seguida faça:
//some cada uma das linhas armazenando o resultado em um vetor;
//some cada uma das colunas armazenando o resultado em um vetor;
//imprima o resultado da soma das linhas;
//imprima o resultado da soma das coluna;
//imprima a matriz completa

import java.util.Random;

public class Ex09 {
    public static void main(String[] args) {
        Random random = new Random();

        int matriz[][] = new int[3][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(0,100);
            }
        }

        int somaLinhas[] = new int[3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }

        int somaColunas[] = new int[5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("----Soma das Linhas----");
        for (int i = 0; i < somaLinhas.length; i++) {
            System.out.printf("Soma da linha %d: %d \n", i+1, somaLinhas[i]);
        }

        System.out.println("\n----Soma das Colunas----");
        for (int i = 0; i < somaColunas.length; i++) {
            System.out.printf("Soma da coluna %d: %d \n", i+1, somaColunas[i]);
        }
        System.out.println("\n----Matriz Completa----");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
