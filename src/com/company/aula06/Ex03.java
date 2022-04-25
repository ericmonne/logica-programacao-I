package com.company.aula06;
//Crie um método que recebe uma matriz bidimensional double
// e retorna o maior valor da matriz.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas terá a sua matriz? ");
        int linhas = Integer.parseInt(scanner.nextLine());
        System.out.print("Quantas colunas terá a sua matriz? ");
        int colunas = Integer.parseInt(scanner.nextLine());

        double matriz[][] = new double[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe um número: ");
                matriz[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        double maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor da matriz é: " + maior);

        scanner.close();
    }
}
