package com.company.aula06;
//Escreva um código Java que leia 10 valores double do teclado
// e armazene-os em uma matriz de dimensões 2x5

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double matriz[][] = new double[2][5];

        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.print("Informe um número: ");
                matriz[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        scanner.close();
    }
}
