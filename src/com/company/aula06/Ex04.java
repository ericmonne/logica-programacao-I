package com.company.aula06;
//Crie um método que recebe uma matriz de inteiros
// e retorna a soma de todos os elementos da matriz.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas terá a sua matriz? ");
        int linhas = Integer.parseInt(scanner.nextLine());
        System.out.print("Quantas colunas terá a sua matriz? ");
        int colunas = Integer.parseInt(scanner.nextLine());

        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe um número: ");
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int somados = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somados += matriz[i][j];
            }
        }

        System.out.println("A soma de todos os elementos da matriz é: " + somados);

        scanner.close();
    }
}
